
import Karatsuba.Algoritmo;


public class App {
	
	public static void main(String args[]){
	
	int u = 9999;
	int v = 7777;
	int n = 4;
	
	Algoritmo karatsuba =  (x, y, z) -> {
            if (z <= 3) {
                return x * y;
            } else {
                return 0; 
            }
        };
	
	int produto = karatsuba.calcule(u,v,n);
	
	
	System.out.println("O produto de " + u + " e " + v + " eh: " + produto);

	
	
	}



}