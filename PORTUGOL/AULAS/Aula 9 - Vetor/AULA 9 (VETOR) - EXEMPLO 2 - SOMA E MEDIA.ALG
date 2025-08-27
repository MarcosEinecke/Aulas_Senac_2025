Algoritmo "AULA 9 (VETOR) - EXEMPLO 2 - SOMA E MEDIA"

Var
   // Seção de Declarações das variáveis
   media: real
   i,soma: inteiro
   v: vetor [0..4] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   //soma <- 0

   para i de 0  ate 4 faca
      Escreva ("Digite v[",i,"]:")
      Leia(v[i])
      soma <- soma + V[i]
      fimpara

    media <- soma / 5
   Escreval("Soma = ",soma)
   Escreval("Média = ",media:2)


Fimalgoritmo