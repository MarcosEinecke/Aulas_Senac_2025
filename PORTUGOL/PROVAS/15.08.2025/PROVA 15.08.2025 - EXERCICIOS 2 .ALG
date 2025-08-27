Algoritmo "PROVA 15.08.2025 - EXERCICIOS 2 "

Var
   // Seção de Declarações das variáveis
   Nome,ende: caractere
   op: inteiro
   data: caractere
   salario: real
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   //--------------------------------------------------------------------//
   Nome <- "Nenhum nome cadastrado"
   ende <- "Nenhum endereço cadastrado"
   data <- "Nenhum data de nascimento cadastrado"
   //--------------------------------------------------------------------//


   REPITA
      limpatela
      se (op = 0) entao
         Escreval ("********************************************")
         Escreval ("            CADASTRO DE FUNCIONÁRIO         ")
         Escreval ("********************************************")
         Escreval ("")
         Escreval ("")
         Escreval ("1 - CADASTRAR")
         Escreval ("")
         Escreval ("2 - CONSULTA")
         Escreval ("")
         Escreval ("3 - SAIR")
         Escreval ("")
         Leia(op)
         limpatela
      fimse

      //----------------------------------------------------------------------//

      Escreval ("********************************************")
      Escreval ("            CADASTRAR                       ")
      Escreval ("********************************************")
      Escreval ("")

      Se (op = 1) entao
         Escreval ("Qual o nome do funcionário? ")
         Leia(Nome)

         enquanto (Nome = "") faca
            limpatela
            Escreval ("********************************************")
            Escreval ("            CADASTRAR                       ")
            Escreval ("********************************************")
            Escreval ("")
            Escreval ("Qual o nome do funcionário? ")
            Leia(Nome)
         fimenquanto

         Escreval ("")
         Escreval ("Qual a data de nascimento?")
         Leia(data)

         enquanto (data = "") faca
            limpatela
            Escreval ("********************************************")
            Escreval ("            CADASTRAR                       ")
            Escreval ("********************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("Qual a data de nascimento?")
            Leia(data)
         fimenquanto

         Escreval ("")
         Escreval ("Qual o endereço?")
         Leia(ende)

         enquanto (ende = "") faca
            limpatela
            Escreval ("********************************************")
            Escreval ("            CADASTRAR                       ")
            Escreval ("********************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("Qual o endereço?")
            Leia(ende)
         fimenquanto
         
         Escreval ("")
         Escreval ("Qual o salário?")
         Leia(salario)

         enquanto (salario <> "") faca
            limpatela
            Escreval ("********************************************")
            Escreval ("            CADASTRAR                       ")
            Escreval ("********************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("Qual o salário?")
            Leia(salario)
         fimenquanto

         Escreval ("")
         limpatela
         Escreval ("")
         Escreval ("")
         Escreval ("********************************************")
         Escreval ("            CADASTRAR REALIZADO             ")
         Escreval ("********************************************")
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("0 - MENU")
         Escreval ("3 - SAIR")
         Leia(op)
      fimse

      //-----------------------------------------------------------------------//

      Se (op = 2) entao
         limpatela
         Escreval ("********************************************")
         Escreval ("                 CONSULTA                   ")
         Escreval ("********************************************")
         Escreval ("")
         Escreval ("NOME: ",Nome)
         Escreval ("")
         Escreval ("DATA DE NASCIMENTO: ",data)
         Escreval ("")
         Escreval ("ENDEREÇO: ",ende)
         Escreval ("")
         Escreval ("SALÁRIO: R$ ",salario)
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("0 - MENU")
         Escreval ("3 - SAIR")
         Escreval ("")
         Leia(op)
      fimse
      limpatela
   ate (op = 3)

   Escreval ("")
   Escreval ("")
   Escreval ("")
   Escreval ("")
   Escreval ("********************************************")
   Escreval ("                 ATÉ LOGO:)                 ")
   Escreval ("********************************************")
   Escreval ("")
   Escreval ("")
   Escreval ("")
   Escreval ("")

Fimalgoritmo