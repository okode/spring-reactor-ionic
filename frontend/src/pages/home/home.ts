import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { DOM as rxdom } from 'rx-dom';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController) { }

  subscribe() {
    rxdom.fromEventSource<string>('http://localhost:8080/date/now/5').subscribe(event => {
      console.log(`New event received: ${event}`);
    });
  }

}
