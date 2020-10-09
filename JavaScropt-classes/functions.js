function facto(num){
    var f=1;
    while(num>0){
        f=f*num;
        num--;
    }
    return f;
}


function fun(){
    var date = new Date();
    document.write(date.getDate());
}

// 5! = 5*4*3*2*1