Algoritmo "PROVA 15.08.2025 -  EXERCICIO AVANÇADO 25 "

Var
   // Seção de Declarações das variáveis

   numero, palpite, tentativas: inteiro
   op:inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Repita
      numero <- randi(101)
      tentativas <- 0

      //INTRODUÇÃO

      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                     JOGO DA ADIVINHAÇÃO                  ")
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

      escreval("            TENTE ADIVINHAR UM NÚMERO DE 1 A 100:               ")
      Escreval ("")
      Escreval ("")
      REPITA

         escreval ("Tentativa ",tentativas,":")
         Leia(palpite)
         enquanto (palpite <= 0) faca
            Escreval ("NÚMERO INVALIDO")
            escreval ("Tentativa ",tentativas,":")
            Leia(palpite)
         fimenquanto
         tentativas <-  tentativas + 1

         Se (palpite = numero) entao
            escreval("Parabéns! Você acertou em ",tentativas," tentativas")
            interrompa //sai do laço quando acerto o número
         senao
            Se(palpite < numero) entao
               Escreval ("O número é MAIOR. Tente novamente")
            senao
               escreval ("O número é MENOR. Tente novamente")
            fimse
         fimse

      ate (tentativas = 7)

      Se (palpite <> numero) entao
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("Você não conseguiu adivinhar o número. O número era ",numero)
         Leia(op)
         limpatela
         Escreval ("-----------------------------------------------------------")
         Escreval ("")
         Escreval ("                     TENTE NOVAMENTE                            ")
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
      fimse

   ate (op = 999)

Fimalgoritmo
