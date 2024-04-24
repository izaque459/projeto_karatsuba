

int main(){
	
	unsigned int produto,u,v;
	
	u=9999;
	v=7777;
	produto=1;

	produto = karatsuba(u,v,4);
	
	cout<<"O produto de u = "<<u<<" e v="<<v<<" eh "<<produto;

return 0;
}