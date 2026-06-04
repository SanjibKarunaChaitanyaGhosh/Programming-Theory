
let random=Math.floor(Math.random()*100)+1

max=100
min=500
let randomNumber=Math.floor(Math.random()*(max-min)+min)

console.log(randomNumber)

console.log(random)


const button=document.getElementById("button")
const label=document.getElementById("label")

const maxNUM=6
const minNUM=1

let randomNum;

button.onclick=function(){
    randomNum=Math.floor(Math.random()*maxNUM)+minNUM
    label.textContent=randomNum
}