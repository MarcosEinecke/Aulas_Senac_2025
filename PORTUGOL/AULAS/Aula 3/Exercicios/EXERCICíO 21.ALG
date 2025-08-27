algoritmo "Exercicío 21"
var
   numero, valor_absoluto: real

inicio
   escreva("Digite um número real: ")
   leia(numero)

   se numero < 0 entao
      valor_absoluto := -numero
   senao
      valor_absoluto := numero
   fimse

   escreva("O valor absoluto é: ", valor_absoluto)
fimalgoritmo