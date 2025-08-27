Algoritmo "AULA 9 (VETOR) - EXEMPLO 4 - VETOR COM ENQUANTO E REPITA"

Var
   // Seção de Declarações das variáveis

   i: inteiro
   v: vetor [0..4] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   {
   // USANDO ENQUANTO

   enquanto (i <= 4) faca
      Escreva ("Digite v[",i,"]: ")
      leia(v[i])
      i <- i+1
   fimenquanto

   }


   //USANDO REPITA

   i <- 0
   REPITA
      Escreva ("Digite v[",i,"]: ")
      leia(v[i])
      i <- i+1
   ate i > 4


Fimalgoritmo