from karatsuba import karatsuba
    
u = 9999
v = 7777

produto = karatsuba(u, v, 4)
print("O produto de u e v é:", produto)


print((lambda x: x * x)(3))