const a = [1,1,2,2,2,3,4,4,4,5,5,5,6];

let b = [];
let i = 0;

while(i < a.length){
    if(i === 0 || a[i] !== a[i-1]){
        b.push(a[i]);
    }
    i++;
}

console.log(b);
console.log("Length:", b.length);
