class Student{
    protected studentName:string;
    protected studentId:number;
    protected email:string;

   constructor(studentName:string,studentId:number,email:string){
        this.studentId=studentId;
        this.studentName=studentName;
        this.email=email;
   }

   // constructor(private studentName:string,private studentId:number,private email:string){}

    // setStudentData(studentName:string,studentId:number,email:string):void{
    //     this.studentId=studentId;
    //     this.studentName=studentName;
    //     this.email=email;
    // }

    printStudentData():void{
        console.log(this);
    }
}

class CSStudent extends Student{
    
    programmingLanguages:Array<string>=["C","C++","JAVA","Python"];
    constructor(studentName:string,studentId:number,email:string){
            super(studentName,studentId,email);
    }

}



//let s:Student=new Student('Rahul',25502,'rahul@gmail.com');
// s.setStudentData('Rahul',25502,'rahul@gmail.com');
let s:Student=new CSStudent('Rahul',25502,'rahul@gmail.com');
console.log(s);