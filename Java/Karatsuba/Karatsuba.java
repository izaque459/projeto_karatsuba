/* data: 03/01/2024
	classe usada para utilizar a função lambda e interface Algoritmo
Atualização em 31/01/2024: este projeto conta somente com a versão recursiva da função karatsuba
*/

package Karatsuba;

import Karatsuba.Algoritmo;

public class Karatsuba{
	private int p;
	private int q;
	private int r;
	private int s;
	private int m;
	
	private int karatsubaRecursivo(int x,int y, int z){
		
		if (z <= 3) {
					return x * y;
				} else {
					
					m = (int) Math.ceil(z / 2.0);
					p = (int) Math.floor(x / Math.pow(10, m));
					q = x % (int) Math.pow(10, m);
					r = (int) Math.floor(y / Math.pow(10, m));
					s = y % (int) Math.pow(10, m);
					
				return karatsubaRecursivo(p, r, m) * (int) Math.pow(10, 2 * m) +
                    (karatsubaRecursivo(p + q, r + s, m + 1) - karatsubaRecursivo(p, r, m) - karatsubaRecursivo(q, s, m)) * (int) Math.pow(10, m) +
                    karatsubaRecursivo(q, s, m);
				}
	}
	
	public int calcule(int a,int b, int c){
		
		return karatsubaRecursivo(a, b, c);
			
	}
	
			
}