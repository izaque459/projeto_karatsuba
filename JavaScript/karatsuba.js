/*  data: 27/12/2023
	a função karatsuba tem objetivo de multiplicação de numeros naturais , pelo algoritmo karatsuba e ofman
    grandes de forma rapida com uso, por exemplo, em criptografia
*/

// implementacao atualizada em arrow function
 const karatsuba = (u, v, n)=>{
  if (n <= 3) {
    return u * v; //caso base
  } else{

  // uso recursivo da função anonima como retorno retorno
  return ((m,p,q,r,s)=>{
	  return karatsuba(p, r, m) * Math.pow(10, 2 * m) + 
			(karatsuba(p + q, r + s, m + 1) - karatsuba(p, r, m) - karatsuba(q, s, m)) * Math.pow(10, m) + 
			karatsuba(q, s, m);})(Math.ceil(n / 2),Math.floor(u / Math.pow(10, Math.ceil(n / 2))),u % Math.pow(10, Math.ceil(n / 2)),Math.floor(v / Math.pow(10, Math.ceil(n / 2))),v % Math.pow(10, Math.ceil(n / 2)));
 
 /* const m = Math.ceil(n / 2);
  const p = Math.floor(u / Math.pow(10, m));
  const q = u % Math.pow(10, m);
  const r = Math.floor(v / Math.pow(10, m));
  const s = v % Math.pow(10, m);

  return karatsuba(p, r, m) * Math.pow(10, 2 * m) + 
		(karatsuba(p + q, r + s, m + 1) - karatsuba(p, r, m) - karatsuba(q, s, m)) * Math.pow(10, m) + 
		 karatsuba(q, s, m);*/
  }
}

module.exports = {karatsuba} 