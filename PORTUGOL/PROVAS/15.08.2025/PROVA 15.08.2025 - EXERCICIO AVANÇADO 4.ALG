Algoritmo "PROVA 15.08.2025 - EXERCICIO AVANÇADO 4"

Var

   vz, cont,op: inteiro
   vReal,cotaDolar, vDolar: real

Inicio

   REPITA

      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                 CONVERSOR REAL PARA DOLAR                 ")
      Escreval ("")
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("            Aperte qualquer para continuar....             ")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("                                            ESC PARA SAIR  ")
      leia(op)
      Limpatela


      cotaDolar <- 5.50
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                 CONVERSOR REAL PARA DOLAR                 ")
      Escreval ("")
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      escreva ("Quantas vezes você quer converter?")
      leia (vz)
      cont <- 1
      limpatela
      enquanto (cont <= vz) faca
         Escreval ("-----------------------------------------------------------")
         Escreval ("")
         Escreval ("                 CONVERSOR REAL PARA DOLAR                 ")
         Escreval ("")
         Escreval ("-----------------------------------------------------------")
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("Qual o valor em reais?")
         leia (vReal)
         vDolar <- vReal / cotaDolar
         Escreval ("")
         Escreval ("")
         Escreval ("O valor convertido é U$ ", vDolar:4:2)
         cont <- cont + 1
         Leia(op)
         limpatela
      fimenquanto

 ate (op = 999)

Fimalgoritmo