//Exercício 1: Calculadora Simples
//Criar uma calculadora simples que permita ao usuário escolher entre as operações de soma, subtração, multiplicação e divisão.
//O programa deve ler dois números e, de acordo com a escolha do usuário, realizar a operação e exibir o resultado.

Algoritmo "AULA 8 - EXERCICIO 1"

Var
   // Seção de Declarações das variáveis
   cont,opcao:caractere
   soma,num:real
   op:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   REPITA

      soma <- 0
      num <- 0

      Limpatela
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("                       CALCULADORA                         ")
      Escreval ("")
      Escreval ("-----------------------------------------------------------")
      Escreval ("")
      Escreval ("Qual operação aritimética você gostaria de usar?")
      Escreval ("")
      Escreval ("1. ADIÇÃO")
      Escreval ("2. SUBTRAÇÃO")
      Escreval ("3. MUTIPLICAÇÃO")
      Escreval ("4. DIVISÃO")
      Escreval ("5. SAIR")
      Escreval ("")
      Leia(op)
      Limpatela

//---------------------------------------------------------------------------//

      Escolha op
      Caso 1
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Escreval ("                       VAMOS SOMAR                         ")
         Escreval ("")
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Limpatela
         Escreval ("Infome 2 números para o calculo: ")
         Escreval ("")
         Escreval ("Qual o primeiro número?")
         Leia(num)
         soma <- soma + num
         Escreval ("Qual o segundo  número?")
         Leia(num)
         soma <- soma + num
         Escreval ("")
         Escreval ("")
         Escreval ("A soma dos números informado é",soma)
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("5. SAIR")
         Escreval ("0. MENU")
         Escreval ("")
         Leia(op)

//--------------------------------------------------------------------------//

      Caso 2
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Escreval ("                       VAMOS SUBTRAÇÃO                         ")
         Escreval ("")
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Limpatela
         Escreval ("Infome 2 números para o calculo: ")
         Escreval ("")
         Escreval ("Qual o primeiro número?")
         Leia(num)
         soma <- soma + num
         Escreval ("Qual o segundo  número?")
         Leia(num)
         soma <- soma - num
         Escreval ("")
         Escreval ("")
         Escreval ("A subtração dos números informado é",soma)
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("5. SAIR")
         Escreval ("0. MENU")
         Escreval ("")
         Leia(op)

//--------------------------------------------------------------------------//


      Caso 3
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Escreval ("                       VAMOS MUTIPLICAR                         ")
         Escreval ("")
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Limpatela
         Escreval ("Infome 2 números para o calculo: ")
         Escreval ("")
         Escreval ("Qual o primeiro número?")
         Leia(num)
         soma <- soma + num
         Escreval ("Qual o segundo  número?")
         Leia(num)
         soma <- soma * num
         Escreval ("")
         Escreval ("")
         Escreval ("A mutiplicação dos números informado é",soma)
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("5. SAIR")
         Escreval ("0. MENU")
         Escreval ("")
         Leia(op)

//--------------------------------------------------------------------------//


      Caso 4
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Escreval ("                       VAMOS DIVIDIR                         ")
         Escreval ("")
         Escreval ("---------------------------------------------------------")
         Escreval ("")
         Limpatela
         Escreval ("Infome 2 números para o calculo: ")
         Escreval ("")
         Escreval ("Qual o primeiro número?")
         Leia(num)
         soma <- soma + num
         Escreval ("Qual o segundo  número?")
         Leia(num)
         soma <- soma / num
         Escreval ("")
         Escreval ("")
         Escreval ("A divisão dos números informado é",soma)
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("5. SAIR")
         Escreval ("0. MENU")
         Escreval ("")
         Leia(op)

//--------------------------------------------------------------------------//
      fimescolha
   ate ( op = 5)


Fimalgoritmo


Exercício 1: Calculadora Simples
Criar uma calculadora simples que permita ao usuário escolher entre as operações de soma, subtração, multiplicação e divisão.
O programa deve ler dois números e, de acordo com a escolha do usuário, realizar a operação e exibir o resultado.


