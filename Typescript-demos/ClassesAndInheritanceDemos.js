var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Student = /** @class */ (function () {
    function Student(studentName, studentId, email) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
    }
    // constructor(private studentName:string,private studentId:number,private email:string){}
    // setStudentData(studentName:string,studentId:number,email:string):void{
    //     this.studentId=studentId;
    //     this.studentName=studentName;
    //     this.email=email;
    // }
    Student.prototype.printStudentData = function () {
        console.log(this);
    };
    return Student;
}());
var CSStudent = /** @class */ (function (_super) {
    __extends(CSStudent, _super);
    function CSStudent() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.programmingLanguages = ["C", "C++", "JAVA", "Python"];
        return _this;
    }
    return CSStudent;
}(Student));
//let s:Student=new Student('Rahul',25502,'rahul@gmail.com');
// s.setStudentData('Rahul',25502,'rahul@gmail.com');
var s = new CSStudent('Rahul', 25502, 'rahul@gmail.com');
console.log(s);
