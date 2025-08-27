//Exercício 3: Classificação de Triângulos
//Criar um algoritmo que leia três lados de um triângulo e classifique-o como equilátero, isósceles ou escaleno


Algoritmo "AULA 8 - EXERCICIO 3"

Var
   // Seção de Declarações das variáveis

   ladoA,ladoB,ladoC: real
   op:inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   REPITA
      Limpatela

      //INICIO
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("               CLASSIFICAÇÃO DE TRIÂNGULOS                 ")
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

      Escreval ("INFORME O TAMANHO DOS 3 LADOS DO TRIÂNGULO: ")
      Leia(ladoA,ladoB,ladoC)
      Limpatela
      Escreval ("INFORME O TAMANHO DOS 3 LADOS DO TRIÂNGULO: ")
      Escreval ("")
      Escreval ("")
      Escreval  ("Lado A =",ladoA)
      Escreval  ("Lado B =",ladoB)
      Escreval  ("Lado C=",ladoC)


      //CASO

      se (a <= 0) ou (b <= 0) ou (c <= 0)entao
         Escreval("Lados inválidos: todos devem ser positivos.")
      senao
         // Desigualdades do triângulo
         se ( (a < b + c) e (b < a + c) e (c < a + b) ) entao
            // Codifica o tipo para usar no 'escolha'
            se (a = b) e (b = c) entao
            tipo <- 3     // equilátero
            senao
               se ( (a = b) ou (a = c) ou (b = c) ) entao
               tipo <- 2  // isósceles
               senao
               tipo <- 0  // escaleno
               fimse
            fimse

            // Seleção por caso
            escolha tipo
            caso 3
               escreval("Triângulo equilátero.")
            caso 2
               escreval("Triângulo isósceles.")
            caso 0
               escreval("Triângulo escaleno.")
            outrocaso
               escreval("Tipo desconhecido.")
            fimescolha
         senao
            escreval("Os valores NÃO formam um triângulo.")
         fimse
      fimse
      limpatela
      
   ate (op = 0)
Fimalgoritmo