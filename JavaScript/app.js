//data: 27/12/2023
//node app.js

const {karatsuba} = require('./karatsuba.js');

const a = 9999;
const b = 7777;
const resultado = karatsuba(a,b,4);

console.log(`${a} vezes ${b} eh ${resultado}`);
