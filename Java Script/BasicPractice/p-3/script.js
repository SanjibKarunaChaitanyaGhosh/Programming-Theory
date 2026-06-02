

let username

document.getElementById("submit").onclick= function(){
    username=document.getElementById("inputBox").value
    // console.log(username)
    document.getElementById("header").textContent= `hello ${username}, welcome to my website`
}