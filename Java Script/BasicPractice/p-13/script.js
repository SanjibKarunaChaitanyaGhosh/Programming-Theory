// input
let ArrayLength=document.querySelector("input")

//Total Elements
let addTotalElements=document.getElementById("addTotalElements")

let TotalElementsOutput=document.getElementById("TotalElementsOutput")

// elements
let EnterElements=document.getElementById("EnterElements")


// add elements
let addElements=document.getElementById("addElements")


// ArrayOutput

let ArrayOutput=document.getElementById("ArrayOutput")


// GiveMeIndex

let GiveMeIndex=document.getElementById("GiveMeIndex")


// output

let output=document.getElementById("output")

addTotalElements.onclick=function(){
    TotalElementsOutput.textContent= `Length of the Array is ${ArrayLength.value}`;

}

let array=[];

addElements.onclick=function(){

    let values=EnterElements.value;

        

        array.push(values);
    
        ArrayOutput.innerHTML=array
    }
