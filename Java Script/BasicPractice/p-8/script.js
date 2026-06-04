const checkbox=document.getElementById("checkbox");

const visa=document.getElementById("visa");

const master=document.getElementById("master");

const Paypal=document.getElementById("Paypal");

const submit=document.getElementById("submit");

const result=document.getElementById("result");

const notSubcribe=document.getElementById("notSubcribe");

submit.onclick=function(){
    if(checkbox.checked){
        result.textContent=`Your are subscribed`
    }else{
        result.textContent=`Your are not subscribed`
    }
}