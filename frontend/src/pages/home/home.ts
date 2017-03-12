import { Component } from '@angular/core';
import { DOM as rxdom } from 'rx-dom';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  private instant: string;

  subscribe() {
    rxdom.fromEventSource<string>('http://localhost:8080/date/now/5').subscribe(
      value => { this.instant = value; },
      exception => { },
      () => { }
    );
  }

}
