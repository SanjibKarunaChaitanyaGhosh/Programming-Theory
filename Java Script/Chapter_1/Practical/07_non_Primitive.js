// Non-Primitive Data Types

// Objects

// Object is collection of values.
//  name, age, class,  marks , isPass, all are primitive Data-types

// we can store it in  key:value  Pair.

// So when we made collection of Primitive Data type it will be an OBJECT.

// In general we declare an object using const, you can using let also.

// example -
const student={
    fullName:"Vishal Biswas",
    age:25,
    marks:95,
    isPass:true
};
console.log(student);
console.log(typeof(student));
console.log(student["fullName"]);
console.log(student.fullName);

// console.log(student[fullName]);
// here without " " it will find a variable, so it is wrong.  ERROR:fullName is not defined

// assigining new value within object or updation of values.
const student1={
    fullName:"Vishal Biswas",
    age:25,
    marks:95,
    isPass:true
};
student1["fullName"]="Debdip Das"
student1["age"]=student1["age"]-3 ;
student1["marks"]=student1["marks"]-10;
console.log(student1);

// now the interesting Question is ----- how does we change the value of a key of an Object after const.