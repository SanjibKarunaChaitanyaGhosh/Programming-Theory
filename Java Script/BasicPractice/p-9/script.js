const marks=document.getElementById("input")

const submit=document.getElementById("submit")

submit.onclick=function(){

        let Marks=Number(marks.value)
        let grade;
        let text="Your grade is "

        switch(true){
            case Marks>90:
                grade=text+"AA"
                break;
            case Marks>70:
                grade=text+"A+"
                break;
            case Marks>60:
                grade=text+"A"
                break;
            case Marks>40:
                grade=text+"B"
                break;
            case Marks>35:
                grade=text+"A"
                break;
            default:
                grade="You are faild, better luck next time"
                
        }


        result.textContent=` ${grade} and your marks is ${Marks}`

}

