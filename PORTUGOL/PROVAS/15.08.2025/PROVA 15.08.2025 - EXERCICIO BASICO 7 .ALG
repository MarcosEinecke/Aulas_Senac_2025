Algoritmo "PROVA 15.08.2025 - EXERCICIO BASICO 7 "

Var
   // Seção de Declarações das variáveis

   i,tentativas: inteiro
   numero,maior,menor: real
   op:inteiro
Inicio
   // INDRODUÇÃO
   REPITA

      numero <- 10

      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                   BRINCANDO COM NÚMEROS                   ")
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

      //PERGUNTAS

      ENQUANTO (numero = 10 ) ou (numero = 20)  faca
         Escreval ("Digite um número vamos se é maior que 10 e menor que 20:")
         Escreval ("                   NÃO USAR 10 E 20                     ")
         Leia(numero)
         limpatela
      FIMENQUANTO

      Escreval ("")
      Escreval ("")
      
      se (numero > 10) e  (numero < 20) entao
         Escreval ("Sim,o número ",numero," é maior que 10 e menor que 20.")
      senao
         Escreval ("Não,o número ",numero," não é maior que 10 e menor que 20.")
      fimse

      Leia(op)
      limpatela

      //FINAL

      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("               SE QUISER TENTAR NOVAMENTE                  ")
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

   ate (op = 999)


Fimalgoritmo