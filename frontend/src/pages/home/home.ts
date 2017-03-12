import { Component } from '@angular/core';
import { DOM as rxdom } from 'rx-dom';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  private instant: string;
  private subscribeDisabled = false;

  subscribe() {
    if (this.subscribeDisabled) return;
    this.subscribeDisabled = true;
    rxdom.fromEventSource<string>('http://localhost:8080/date/now/5').subscribe(
      value => { this.instant = value; },
      exception => { this.subscribeDisabled = false; },
      () => { this.subscribeDisabled = false; }
    );
  }

}
