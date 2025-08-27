Algoritmo "AULA 9 - EXERCICO 1 - APROVADO E REPROVADO"

//  1) Leia 5 notas (real),calcule a média e mostre quantas notas foram maiores
// ou iguais a 7.


Var
   // Seção de Declarações das variáveis

   prova: vetor [1..5] de real
   soma, media: real
   i: inteiro
   op,nome: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   REPITA
      Limpatela

      //INICIO
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                     BOLETIM ONLINE                        ")
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

      Escreval("Qual seu nome?")
      Leia(nome)
      Escreval ("")
      Escreval ("")
      Para i de 1 ate 5 faca
         Repita
            Escreva ("Digite a nota da prova[",i,"]:")
            Leia(prova[i])
            Se (prova[i] > 10) ou (prova[i] < 0)entao
               Escreval ("A nota é de 0 a 10. Tente novamente")
               Leia(op)
            fimse
            limpatela
         ate (prova[i] > -1) e (prova[i] < 11)
         soma <- soma + prova[i]
      fimpara

      media <- soma /5

      Escreval ("")
      Escreval ("")
      Escreval ("")
      Se (media >= 7) entao
         Escreval ("Parabéns ",nome,", sua média é ",media, " você está APROVADO.")
      fimse
      Se (media < 7) entao
         Escreval ("Que pena ",nome,", sua média é ",media, " você foi REPROVADO>:")
      fimse

      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("           Aperte qualquer para ir pro inicio....       ")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("                                          ESC PARA SAIR  ")
      leia(op)


   ate ( op = 1,22)

Fimalgoritmo