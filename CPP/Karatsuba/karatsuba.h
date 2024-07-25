// data 30/04/2024
#ifndef __KARATSUBA_H__

#define __KARATSUBA_H__

#include <cmath>

unsigned long long int  karatsuba(unsigned long long int u,unsigned long long int v,int n) {
	
	if (n<=3)
		return u*v;
	else{
		return [](int m, unsigned long long int p, unsigned long long int q, unsigned long long  int r, unsigned long long int s) {
            return karatsuba(p, r, m) * pow(10, 2 * m) + 
                   (karatsuba(p + q, r + s, m + 1) - karatsuba(p, r, m) - karatsuba(q, s, m)) * pow(10, m) + 
                   karatsuba(q, s, m);
        }((int)ceil(n / 2.0), (unsigned long long int)floor(u /pow(10, n / 2.0)), u % (unsigned long long int)pow(10, n / 2.0),(unsigned long long int)floor(v / pow(10, n / 2.0)), v % (unsigned long long int)pow(10, n / 2.0));

	}
}

#endif