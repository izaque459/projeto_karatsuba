
import Karatsuba.Karatsuba;


public class App {
	
	public static void main(String args[]){
	
	int u = 9999;
	int v = 7777;
	int n = 4;
	
		Karatsuba karatsuba = new Karatsuba();
		
		int produto = karatsuba.calcule(u,v,n);
	
	System.out.println("O produto de " + u + " e " + v + " eh: " + produto);

	
	
	}



}