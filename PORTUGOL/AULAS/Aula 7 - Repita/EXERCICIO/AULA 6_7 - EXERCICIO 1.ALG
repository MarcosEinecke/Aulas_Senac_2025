Algoritmo "Aula 6_7 - EXERCICIO 1"

Var
   // Seção de Declarações das variáveis
   num, soma: inteiro
   resposta: caractere
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...


   resposta <- "sim"

   enquanto (resposta = "sim") ou ( resposta = "Sim") faca
      limpatela
      soma <- 0
      num <- 0
      repita

         Escreval ("Digite um valores inteiros para somar:(digite 0 para parar)")
         leia(num)
         soma <- soma + num
      ate (num = 0)
      Escreval ("A soma dos valores é ",soma)
      Escreval (" Gostaria de somar novamente? Sim ou Não")
      leia(resposta)
   fimenquanto
Fimalgoritmo