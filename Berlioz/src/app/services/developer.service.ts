import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable, throwError } from 'rxjs';
import { Developer } from "src/app/models/developer";

@Injectable({
  providedIn: 'root'
})
export class DeveloperService {
  
  private url: string;
  
  constructor(private http: HttpClient) { 
  this.url = 'http://localhost:8080/';
  }
  
public getDeveloperById(id: String): Observable<Developer>{
  return this.http.get<Developer>(this.url+'/get/'+id);
}

public getAllDevelopers(): Observable<Developer[]>{
  return this.http.get<Developer[]>(this.url+'/get/');
}

}
