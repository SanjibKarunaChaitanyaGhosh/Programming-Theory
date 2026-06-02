const PI=3.14159;
let radious;
let circumference;





document.getElementById("submit").onclick=function(){
    
    radious=document.getElementById("input").value
    
    circumference=2*PI*radious;

    document.getElementById("output").innerHTML=circumference;

    // document.getElementById("output").textContent=circumference;
}
