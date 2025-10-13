//Data_types in JS

//Number
//String
//Boolean
//Undefined
//Null
//Bigint // not that important
//Symbol // not that important

let y=BigInt("45");
console.log(y); // output 45n
console.log(typeof(y)); //output BigInt

let z=Symbol("Hello world!");
console.log(z);
console.log(typeof(z));

// we do not jump on details of this two variable because of rare uses

// By default all variable are Undefined untill any value within that.

let name;
console.log(name);  // output - undefined
console.log(typeof(name)); // output - undefined

let fullName=null;
console.log(fullName);
console.log(typeof(fullName)); // object

// we consider null like a PRIMITIVE data type, although type of null is OBJECT.

// null means absence of an object