import { Component, OnInit } from '@angular/core';
import { DeveloperService } from "src/app/services/developer.service";
import { Developer } from '../models/developer';

@Component({
  selector: 'app-developer',
  templateUrl: './developer.component.html',
  styleUrls: ['./developer.component.css']
})
export class DeveloperComponent implements OnInit {
developers: Developer[];

  constructor(private developerService : DeveloperService) { }

  ngOnInit() {

    this.developerService.getAllDevelopers().subscribe(data => {
      this.developers = data;
    })

//

  }


}
