
const a=[1,1,2,2,2,3,4,4,4,5,5,5,6]

console.log("The length of the given array is ",a.length);

let b=[]

let i=0;
while(i<a.length){
	if(i===0){
		b.push(a[i]);
        i++;
	}
	else if (i>0 && i<a.length){
		while(a[i] !== a[i-1]){
			b.push(a[i]);
			i++;
		}
	}
	i++;
}

console.log(b);
console.log(`The length of the new array ${b} is `,b.length);


