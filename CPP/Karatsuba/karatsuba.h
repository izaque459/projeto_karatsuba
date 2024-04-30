#ifndef __KARATSUBA_H__

#define __KARATSUBA_H__

#include <cmath>

unsigned int  karatsuba(unsigned int u,unsigned int v,int n) {
	
	if (n<=3)
		return u*v;
	else{
		return [](int m, unsigned int p, unsigned int q, unsigned int r, unsigned int s) {
            return karatsuba(p, r, m) * pow(10, 2 * m) + 
                   (karatsuba(p + q, r + s, m + 1) - karatsuba(p, r, m) - karatsuba(q, s, m)) * pow(10, m) + 
                   karatsuba(q, s, m);
        }(n / 2, u / pow(10, n / 2), u % (unsigned int)pow(10, n / 2), v / pow(10, n / 2), v % (unsigned int)pow(10, n / 2));

	}
}

#endif