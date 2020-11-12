import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpClientModule } from "@angular/common/http";
import { Observable, throwError } from 'rxjs';
import { User } from "src/app/models/User";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  
  private url: string;
  
  private httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' , 'Accept': 'application/json','Access-Control-Allow-Origin':'*'})
  };
  
  constructor(private http: HttpClient) { 
    this.url = 'http://localhost:8080/stravinsky/getAll';
  }

public getAll(): Observable<User[]>{
  return this.http.get<User[]>(this.url, this.httpOptions);
}

}
