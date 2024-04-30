import Karatsuba

main :: IO ()
main = do
  let resultado = karatsuba 9999 7777 4
  putStrLn ("O resultado da multiplicação é: " ++ show resultado)
