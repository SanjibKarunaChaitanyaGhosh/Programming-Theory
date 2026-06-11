// 1. Get user name via prompt
let userName = prompt("Please enter your name:");

// 2. Define the greeting function

let getGreeting = (name) => {
  if (name !== null && name !== "") {
    return "Hello, " + name + "!";
  } else {
    return "User canceled the prompt or entered nothing.";
  }
};

// 3. Process the name and log it
let inputName = getGreeting(userName);
console.log(inputName);

// 4. Get DOM elements
let upper = document.getElementById("upper");
let lower = document.getElementById("lower");
let proper = document.getElementById("proper");

// 5. outputs
let outputs = document.getElementById("outputs");


// 6. Handle the UPPERCASE button click
upper.onclick = function() {
  // Use the userName variable directly instead of input.value
  if (userName !== null && userName !== "") {
    outputs.textContent = userName.toUpperCase();
  } else {
    outputs.textContent = "NO NAME ENTERED";
  }
};

// 7. Handle the lowercase button click
lower.onclick = function() {
  // Use the userName variable directly instead of input.value
  if (userName !== null && userName !== "") {
    outputs.textContent = userName.toLowerCase();
  } else {
    outputs.textContent = "NO NAME ENTERED";
  }
};

// 8. Handle the Proper button click
proper.onclick = function() {
  // Use the userName variable directly instead of input.value
  if (userName !== null && userName !== "") {
    outputs.textContent = userName.trim().charAt(0).toUpperCase()+userName.trim().slice(1).toLowerCase();
  } else {
    outputs.textContent = "NO NAME ENTERED";
  }
};
