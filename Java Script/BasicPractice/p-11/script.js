let abcd=document.getElementById("abcd");

// console.dir(abcd)


let h1=document.querySelectorAll("h1");

// console.dir(h1)

let h2=document.querySelector("#abcd")

// console.log(h2)
// console.dir(h2)


let h3=document.querySelectorAll(".hei")
// console.dir(h3)


// Attribute manupulation

let a=document.querySelector("a")

a.setAttribute("href","https://www.google.com/imgres?q=india&imgurl=https%3A%2F%2Fcdn.britannica.com%2F97%2F1597-050-008F30FA%2FFlag-India.jpg&imgrefurl=https%3A%2F%2Fwww.britannica.com%2Fplace%2FIndia&docid=qsYvT3y4ymQyVM&tbnid=LDAjM51x9-NkkM&vet=12ahUKEwjG_N2WlfiUAxXI2jQHHThJFEQQnPAOegQIFBAB..i&w=1600&h=1067&hcb=2&ved=2ahUKEwjG_N2WlfiUAxXI2jQHHThJFEQQnPAOegQIFBAB")


let img=document.querySelector("img")

img.setAttribute("src","https://plus.unsplash.com/premium_photo-1669839774770-df5a3d2da257?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8ZnJlZXxlbnwwfHwwfHx8MA%3D%3D")

img.setAttribute("alt","image from unplash")

img.remove("src")

// create ElementInternals, Child, remove child, append and prepend child

let hab=document.createElement("h4")

hab.textContent="I love India"

document.querySelector("body").append(hab)


document.querySelector("body").prepend(hab)

let hello=document.querySelector("h1");

hello.style.color="red"

hello.style.backgroundColor="yellow";

hello.style.textTransform=""

hello.style.fontFamily=""


let imag=document.querySelector("a")

imag.classList.add("new")



