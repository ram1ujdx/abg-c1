interface Trainee{
    traineeId:number;
    traineeName:string;
    email:string;
    showTrainee(x?:number);
}

export class TraineeImpl implements Trainee{
    email='harsh@yahoo.com';
    traineeName='Harsh';
    traineeId=154512;
    showTrainee(x?:number){
        console.log(this);
        console.log(x);
    }
}

