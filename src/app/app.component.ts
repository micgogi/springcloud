import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'dummy';
    constructor(private router:Router){

    }
  get(){
    console.log("hello");
    this.router.navigateByUrl('/history');
  }
}
