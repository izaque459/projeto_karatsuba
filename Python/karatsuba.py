'''
    data: 28/12/2023
    a função karatsuba tem objetivo de multiplicação de numeros naturais , pelo algoritmo karatsuba e ofman
    grandes de forma rapida com uso, por exemplo, em criptografia
'''
#uso de função lambda com uma funcao a ser retornada
karatsuba = lambda u, v, n: u*v if (n <= 3) else (
                    lambda m,p,q,r,s: karatsuba(p, r, m)* (10**(2 * m)) + (karatsuba(p + q, r + s, m + 1) - karatsuba(p, r, m) - karatsuba(q, s, m))* (10**m) + karatsuba(q, s, m)
                    )(

                        int(n / 2),
                        int(u / (10**int(n / 2))),
                        u % (10**int(n / 2)),
                        int(v / (10**int(n / 2))),
                        v % (10**int(n / 2))
                        )
    