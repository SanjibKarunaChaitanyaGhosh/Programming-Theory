const text=document.getElementById("text")

const submit=document.getElementById("submit")

const result=document.getElementById("result")


submit.onclick=function(){
    
    let age=Number(text.value)

    if(age>=18){
        result.textContent =`Your age is ${age}, so you are eligible to vote`
    }
    else{
        result.textContent =`Your age is ${age}, so you are not 
        eligible to vote`
    }
}
