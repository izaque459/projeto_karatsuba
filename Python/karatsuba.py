def karatsuba(u, v, n):
    if n <= 3:
        return u * v

    m = int(n / 2)
    p = int(u / (10**m))
    q = u % (10**m)
    r = int(v / (10**m))
    s = v % (10**m)

    pr = karatsuba(p, r, m)
    qs = karatsuba(q, s, m)
    y = karatsuba(p + q, r + s, m + 1)

    uv = pr * (10**(2 * m)) + (y - pr - qs) * (10**m) + qs
    return uv


