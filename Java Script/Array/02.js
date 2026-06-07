// Level 2: Loops with Arrays

// step-1

const arr1 = [10, 20, 30, 40];

for(let i = 0; i < arr1.length; i++){
    console.log(arr1[i]);
}



// step-2

const arr2 = [1, 2, 3, 4, 5];

let sum = 0;

for(let i = 0; i < arr2.length; i++){
    sum += arr2[i];
}

console.log(sum);



// step-3

const arr3 = [10, 5, 100, 25];

let largest = arr3[0];

for(let i = 1; i < arr3.length; i++) {
    if(arr3[i] > largest) {
        largest = arr3[i];
    }
}

console.log(largest);



// step-4

const arr4 = [10, 5, 100, 25];

let smallest = arr4[0];

for(let i = 1; i < arr4.length; i++) {
    if(arr4[i] < smallest) {
        smallest = arr4[i];
    }
}

console.log(smallest);


// step-5

const arr5 = [1, 2, 3, 4, 5, 6];

let count = 0;

for(let i = 0; i < arr5.length; i++) {
    if(arr5[i] % 2 === 0) {
        count++;
    }
}

console.log(count);


// step-6

const arr6 = [1, 2, 3, 4, 5, 6];

let count1 = 0;

for(let i = 0; i < arr6.length; i++) {
    if(arr6[i] % 2 !== 0) {
        count1++;
    }
}

console.log(count);

// step-7

const arr7 = [1, 2, 3, 4];

let reversed = [];

for(let i = arr7.length - 1; i >= 0; i--) {
    reversed.push(arr7[i]);
}

console.log(reversed);

// step-8

const arr8 = [10, 20, 30, 40];
let target = 30;
let found = false;

for(let i = 0; i < arr8.length; i++) {
    if(arr8[i] === target) {
        found = true;
        break;
    }
}

console.log(found ? "Found" : "Not Found");

// step-9

const arr = [1, 1, 2, 2, 3, 4, 4];

let unique = [];

for(let i = 0; i < arr.length; i++) {
    if(!unique.includes(arr[i])) {
        unique.push(arr[i]);
    }
}

console.log(unique);


//step-10

const arr9 = [1, 1, 2, 2, 2, 3];

let freq = {};

for(let i = 0; i < arr9.length; i++) {
    if(freq[arr9[i]]) {
        freq[arr9[i]]++;
    } else {
        freq[arr9[i]] = 1;
    }
}

console.log(freq);


//step-11
const arr10 = [10, 5, 50, 20];

let largest3 = -Infinity;
let secondLargest = -Infinity;

for(let i = 0; i < arr10.length; i++) {
    if(arr10[i] > largest3) {
        secondLargest = largest3;
        largest3 = arr10[i];
    } else if(arr10[i] > secondLargest && arr10[i] !== largest3) {
        secondLargest = arr10[i];
    }
}

console.log(secondLargest);




//step-12

const arr11 = [1, 0, 2, 0, 3, 4, 0];

let result = [];

for(let i = 0; i < arr11.length; i++) {
    if(arr11[i] !== 0) {
        result.push(arr11[i]);
    }
}

while(result.length < arr11.length) {
    result.push(0);
}

console.log(result);