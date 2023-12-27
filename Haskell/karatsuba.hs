-- data: 26/12/2023
-- a função karatsuba tem objetivo de multiplicação de numeros naturais , pelo algoritmo karatsuba e ofman
-- grandes de forma rapida com uso, por exemplo, em criptografia
karatsuba :: Integer -> Integer -> Int -> Integer
karatsuba u v n
          | n <= 3  = u * v
          | otherwise = karatsuba p r m * (10 ^ (2 * m)) + (karatsuba (p + q) (r + s) (m + 1) - karatsuba p r m - karatsuba q s m) * (10 ^ m) + karatsuba q s m
  where  m = n `div` 2
         q = u `mod` (10 ^ m)
         s = v `mod` (10 ^ m)
         r = v `div` (10 ^ m)
         p = u `div` (10 ^ m)
 