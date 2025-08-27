Algoritmo "Consersor Reais para Dolares"

Var
   // Seção de Declarações das variáveis

   vz, cont: inteiro
   vReal,cotaDolar, vDolar: real



Inicio

cotaDolar <- 5.57
   escreva ("Quantas vezes você quer converter?")
   leia (vz)
   cont <- 1
   enquanto (cont <= vz) faca
      Escreval ("Qual o valor em reais?")
      leia (vReal)
      vDolar <- vReal / cotaDolar
      Escreval ("O valor convertido é U$ ", vDolar:4:2)
      cont <- cont + 1
   fimenquanto



Fimalgoritmo