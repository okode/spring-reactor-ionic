import { Component } from '@angular/core';
import { DOM as rxdom } from 'rx-dom';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  private instant = { epochSecond: 0, nano: 0 };
  private subscribeDisabled = false;

  subscribe() {
    if (this.subscribeDisabled) return;
    this.subscribeDisabled = true;
    rxdom.fromEventSource<string>('http://localhost:8080/date/now/5').subscribe(
      data => { this.instant = JSON.parse(data); },
      exception => { this.subscribeDisabled = false; }
    );
  }

}
