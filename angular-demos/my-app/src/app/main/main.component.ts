import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  nameList:Array<string>=[];
  name:string;
  isDisabled:boolean=false;
  constructor() { }

  ngOnInit(): void {
    this.name="";
  }

  show(name:string){
      this.nameList.push(name);
      console.log(this.nameList);
  }

}
