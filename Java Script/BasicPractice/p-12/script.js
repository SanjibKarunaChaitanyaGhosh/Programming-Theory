let A=[10,40,52,37,93]

// console.log(A)

let p=document.querySelector("p")

let input=document.querySelector("input")

let output=document.getElementById("output")

let button=document.querySelector("button")

input.onchange=function(){
    let i=input.value;

    output.textContent=A[i]

}