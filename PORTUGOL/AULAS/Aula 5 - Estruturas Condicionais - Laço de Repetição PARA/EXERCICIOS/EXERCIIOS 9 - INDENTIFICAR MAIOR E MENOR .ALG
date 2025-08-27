Algoritmo "Exerciios 9 - Indentificar maior e menor "

Var
   // Seção de Declarações das variáveis

   i: inteiro
   numero,maior,menor: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval ("Digite o número 1:")
   Leia(numero)
   maior <- numero
   menor <- numero

   para i de 2 ate 7 faca
      Escreval ("Digite o número ",i,": ")
      leia(numero)
      se (numero > maior) entao
         maior <- numero
      fimse
      se (numero < menor) entao
         menor <- numero
      fimse
   fimpara

   Escreval("O maior valor é: ", maior)
   Escreval ("O menor valor é: ", menor)


Fimalgoritmo