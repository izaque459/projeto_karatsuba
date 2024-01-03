/* data: 03/01/2024
	classe usada para utilizar a função lambda e interface Algoritmo

*/

package Karatsuba;

import Karatsuba.Algoritmo;

public class Karatsuba{
	
	public int calcule(int a,int b, int c){
		Algoritmo lambda =  (x, y, z) -> {
				if (z <= 3) {
					return x * y;
				} else {
					return 0; 
				}
			};
			
		return lambda.funcao(a,b,c);
	}
		
		
}