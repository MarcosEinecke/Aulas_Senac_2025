Algoritmo "PROVA 15.08.2025 - EXERCICIO BASICO 21"

Var
   // Seção de Declarações das variáveis
   num, soma,i: inteiro
   resposta: caractere
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...


   resposta <- "sim"

   enquanto (resposta = "sim") ou ( resposta = "Sim")ou ( resposta = "SIM") faca
      limpatela

      soma <- 0
      num <- 0
      i <- 1
      repita
         Escreval ("")
         Escreval ("Digite o ",i,"° valor inteiro para somar:(digite 0 para parar)")
         leia(num)
         soma <- soma + num
         i <- i + 1
      ate (num = 0)
      limpatela
      Escreval ("")
      Escreval ("")
      Escreval ("A soma dos valores é ",soma)
      Leia(i)
      limpatela
      Escreval ("")
      Escreval ("")
      Escreval (" Gostaria de somar novamente? Sim ou Não")
      leia(resposta)
   fimenquanto
Fimalgoritmo