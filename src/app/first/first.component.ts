import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  amount:number=500;
  numMonths:number=12;
  data:string;

  constructor(private dataService:DataService) {
   
   }

  ngOnInit() {
    this.dataService.getData(this.amount,this.numMonths).subscribe((data:any)=>{
      console.log(data);
      this.data=data;
    })
  }

}
