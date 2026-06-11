const checkbox=document.getElementById("checkbox");

const visa=document.getElementById("visa");

const master=document.getElementById("master");

const Paypal=document.getElementById("Paypal");

const submit=document.getElementById("submit");

const result=document.getElementById("result");

const notSubcribe=document.getElementById("notSubcribe");

submit.onclick=function(){
    if(checkbox.checked){
        notSubcribe.textContent=`Your are subscribed`
    }else{
        notSubcribe.textContent=`Your are not subscribed`
    }

    if(visa.checked){
        result.textContent=`You choosed Visacard`
    }else if(master.checked){
        result.textContent=`You choosed Mastercard`
    }else if(Paypal.checked){
        result.textContent=`You choosed Paypal`
    }
    else{
        result.textContent=`You did not choose any card`
    }
}

// submit.onclick = () => {   notSubcribe.textContent = checkbox.checked     ? "You are subscribed"     : "You are not subscribed";    result.textContent =     visa.checked ? "You chose Visa Card" :     master.checked ? "You chose Mastercard" :     Paypal.checked ? "You chose Paypal" :     "You did not choose any card"; };

// ternery Operaton