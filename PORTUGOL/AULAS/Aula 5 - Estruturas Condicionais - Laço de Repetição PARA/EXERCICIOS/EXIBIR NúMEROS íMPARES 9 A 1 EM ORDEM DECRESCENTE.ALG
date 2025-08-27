Algoritmo "Exibir números ímpares 9 a 1 em ordem decrescente"

Var
   // Seção de Declarações das variáveis

   num: inteiro
   cont,bora: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval ("Vamos os números que tem de 9 a 1:")
   Escreval ("Aperta qualquer tecla para começar :)")
   leia(bora)


   num <- 9

   Para cont de 1 ate 9 faca
      num <- num - 1
      se (num % 2 = 1) entao
         Escreval (num,"  ")
      fimse
   fimpara

Fimalgoritmo