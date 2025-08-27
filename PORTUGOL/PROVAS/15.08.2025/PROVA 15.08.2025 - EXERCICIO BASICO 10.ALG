Algoritmo "PROVA 15.08.2025 - EXERCICIO BASICO 10"

Var
   A,op: inteiro
   B: inteiro
   C: inteiro
Inicio

   REPITA
      //INTRODUÇÃO

      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                VERIFICADOR DE NÚMERO POSITIVO             ")
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


      Escreval("Informe 3 números inteiros:")
      Escreval("Vamos verificar se os 3  são POSITIVOS")
      leia (A,B,C)
      limpatela

      Escreval ("A=", a, " B=" , B, " C= " , C)

      se (A > 0) e (B > 0) e (C > 0)entao
         escreval("VERDADEIRO, todos os núemros são POSITIVOS.")
      senao
         escreval("FALSO, os 3 números não são POSITIVOS.")
      fimse
      Leia(op)
      
   ATE (op = 999)
Fimalgoritmo