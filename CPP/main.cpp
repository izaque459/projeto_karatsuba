#include <iostream>
#include "Karatsuba/karatsuba.h"
using namespace std;

int main(){
	
	unsigned long long int produto,u,v;
	
	u=9999;
	v=7777;

	produto = karatsuba(u,v,4);
	
	cout<<"O produto de u = "<<u<<" e v="<<v<<" eh "<<produto<<"\n";

return 0;
}