Algoritmo "Aula 6_7 - EXERCICIO 2"

Var
   // Seção de Declarações das variáveis
   media,num,soma : real
   cont: inteiro
   resposta: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...


   soma <- 0
   cont <- 1
   resposta <- "sim"

   Enquanto ( resposta = "sim") ou (resposta = "Sim") faca
      limpatela


      //REPITA


      repita
         Escreval ("Calcule sua media, informe as sua notas:")
         leia(num)
         Se (num > 10) ou (num < 0)entao
            repita
               escreval("Informe uma numero de 0 a 10:")
               Escreval ("Calcule sua media, informe as sua notas:")
               leia(num)
            ate (num > 0 ) ou (num < 10)
         senao
            soma <- soma + num
            cont <- cont + 1

         fimse

      ate (cont >= 5)

      //MEDIA

      media <- soma / 4
      Escreval ("A sua média nas provas é ",media)
      Escreval("Deseja calcular outra mádia? Sim ou Não")
      Leia (resposta)
   fimenquanto




Fimalgoritmo