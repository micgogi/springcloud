import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { FormGroup, FormBuilder, FormControl } from '@angular/forms';
import Slider from 'bootstrap-slider';
import { DemoData } from '../data';









@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  amount:any;
  numMonths:any;
  data:string;
  dataForm: FormGroup;
  check:boolean;
  history:boolean;
  
  localData:DemoData= new DemoData();
  dataList:string;
  constructor(private dataService:DataService,private fb : FormBuilder) {
   
   }

  ngOnInit() {
    //this.dataList= localStorage.getItem('a');
    var slider = new Slider("#ex6");
slider.on("slide", function(sliderValue) {
  document.getElementById("ex6SliderVal").textContent = sliderValue;
  console.log(sliderValue);

});
    this.dataForm=this.fb.group({
      amount:new FormControl(),
     // numMonths:new FormControl('')
    })
    
    
  }


  onSubmit(){
      console.log("Hakuna matata");
      console.log(this.dataForm.value);
    
      this.numMonths=document.getElementsByClassName("junga")[0].textContent;
      this.amount = this.dataForm.get('amount').value;
     
      console.log(this.amount+" "+this.numMonths);
      
      this.dataService.getData(this.amount,this.numMonths).subscribe((data:any)=>{
        console.log(data);
        this.data=data;
        // this.dataList=this.dataList+','+data;
        // this.data=data;
        
       
          //this.data['monthlyPayment']['amount'].value;
          this.dataList= localStorage.getItem('a');
       // localStorage.setItem(this.data['interestRate'],this.data['monthlyPayment']['amount']);
       console.log(this.dataList)
       
        console.log(localStorage);
        
        
        this.dataList=this.dataList+','+this.data['interestRate']+' '+ this.data['monthlyPayment']['amount'];
        console.log(this.dataList)
        localStorage.setItem('a',''+this.dataList);
        console.log(this.data['interestRate'])
       
        this.history=true;

       
        this.check = true;
      })
      
  }
  get f()
{
  return this.dataForm.controls;
}  


}
