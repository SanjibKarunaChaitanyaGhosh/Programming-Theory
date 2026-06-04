// Task — Unique Cart Products

// const cart = [
//   { id: 1, name: "Laptop", price: 45000 },
//   { id: 2, name: "Mouse", price: 500 },
//   { id: 1, name: "Laptop", price: 45000 },
//   { id: 3, name: "Keyboard", price: 1200 },
//   { id: 2, name: "Mouse", price: 500 },
// ];

// 1. filter + findIndex diye unique products ber koro (duplicate id thakle 1ta rakho)
// 2. Prottekta unique product e quantity property add koro — joto bar duplicate achhe, sheta count hobe

// Expected output:

// [
//   { id: 1, name: "Laptop", price: 45000, quantity: 2 },
//   { id: 2, name: "Mouse", price: 500, quantity: 2 },
//   { id: 3, name: "Keyboard", price: 1200, quantity: 1 }
// ]

const cart = [
  { id: 1, name: "Laptop", price: 45000 },
  { id: 2, name: "Mouse", price: 500 },
  { id: 1, name: "Laptop", price: 45000 },
  { id: 3, name: "Keyboard", price: 1200 },
  { id: 2, name: "Mouse", price: 500 },
];


let cartArrow= cart.filter(function(val){
    let i=0;
    while(i<cart.length){
        if(i===0 || cart[i]!==cart[i-1]){
            return val;
            i++;
        }
    }
})

console.log(newArrow)
console.log(cartArrow)
