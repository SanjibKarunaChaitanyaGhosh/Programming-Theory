// 1. Write a JavaScript function to check whether an input is an array or not
// Test Data :

// console.log(is_array("devhives"));
// console.log(is_array([1, 2, 4, 0]));


// function is_array(val){
//     if(Array.isArray(val)) return true;

//     return false;
// }

function is_array(val){
    return Array.isArray(val);
}

val="devhives"

console.log(is_array(val))