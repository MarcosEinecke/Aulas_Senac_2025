Algoritmo "AULA 9 (VETOR) - EXEMPLO 5 - CONTAR PARES"

Var
   // Seção de Declarações das variáveis

   i,qtdPares: inteiro
   v: vetor [0..7] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Para i de 0 ate 7 faca
      Escreva ("Digite v[",i,"]: ")
      leia(v[i])
      fimpara
      
      
      Escreval ("-------------------------------")
         Para i de 0 ate 7 faca
      Se v[i] % 2 = 0 entao
      qtdPares <- qtdPares + 1
      fimse
      fimpara
      
      Escreva ("Quatidade de pares: ", qtdPares)
      

Fimalgoritmo