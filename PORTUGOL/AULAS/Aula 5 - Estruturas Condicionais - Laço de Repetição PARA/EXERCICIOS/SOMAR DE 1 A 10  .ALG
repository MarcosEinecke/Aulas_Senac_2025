Algoritmo "Somar de 1 a 10  "

Var
   // Seção de Declarações das variáveis

   num: inteiro
   soma,cont,bora: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval ("Vamos somar os números de 1 a 10:")
   Escreval ("Aperta qualquer tecla para começar :)")
   leia(bora)


   num <- 1

   Para cont de 1 ate 10 faca
      Escreval (cont," ")
      num <- num + 1
      soma <- soma + cont

   fimpara
   Escreval ("Total = ", soma)

Fimalgoritmo