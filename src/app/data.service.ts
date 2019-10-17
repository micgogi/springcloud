import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  endPoint:string;
  constructor(private http:HttpClient) {
    this.endPoint="https://ftl-frontend-test.herokuapp.com/interest?"
   }


  getData(amount,numMonths){
   const api= `${this.endPoint}amount=${amount}&numMonths=${numMonths}`;
   return this.http.get(api);

  }
}
