import { Component, OnInit } from '@angular/core';
import { DemoData } from '../data';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
myData:string;
dataArray:Array<any>;
jsonData;
  constructor() { }

  ngOnInit() {
    
    this.myData=localStorage.getItem('a');
   this.dataArray= this.myData.split(',');
  
   console.log(this.dataArray);
   
 
  }

}
