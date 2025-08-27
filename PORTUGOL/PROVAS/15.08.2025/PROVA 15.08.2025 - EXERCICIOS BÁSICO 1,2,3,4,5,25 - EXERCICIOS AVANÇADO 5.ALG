Algoritmo "PROVA 15.08.2025 - EXERCICIOS BÁSICO 1,2,3,4,5 - EXERCICIOS AVANÇADO 5"

Var
   // Seção de Declarações das variáveis
   Nome,ende,login,loginTeste: caractere
   op,senha,numero: inteiro
   data: caractere
   salario: real
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   //--------------------------------------------------------------------//
   Nome <- "Nenhum nome cadastrado"
   ende <- "Nenhum endereço cadastrado"
   data <- "Nenhum data de nascimento cadastrado"
   login <- "Marcos"

   //--------------------------------------------------------------------//


   REPITA
      limpatela


      //LOGIN
      REPITA
         REPITA
            Limpatela
            Escreval ("INFOME O NOME DE QUEM VAI SER O DONO DO CÓDIGO:")
            Leia(login)
         ATE (login <> "")
         REPITA
            Limpatela
            Escreval ("**********************************************************")
            Escreval ("                            LOGIN                         ")
            Escreval ("**********************************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("                 Dica: login é o nome do criador do código")
            Leia(loginTeste)
         ATE (login = loginTeste)
      ATE (loginTeste <> "")
      Limpatela


      //SENHA
      REPITA
         Escreval ("**********************************************************")
         Escreval ("")
         Escreval ("")
         Escreval ("                            SENHA                         ")
         Escreval ("")
         Escreval ("")
         Escreval ("                                 Dica: É o ano que estamos")
         Escreval ("**********************************************************")
         Escreval ("")
         Escreval ("")
         Escreval ("PARA DESCOBRIR A SENHA VOCÊ VAI PRECISAR FAZER UMA SOMA,DE")
         Escreval ("2 NÚMEROS INTEIROS,ONDE O RESULTADO É A SENHA.BOA SORTE!")
         Escreval ("")
         Escreval ("")
         Escreval ("")
         Escreval ("Informe o primeiro número: ")
         Leia(numero)
         senha <- numero
         Escreval ("Informe o segundo número: ")
         Leia(numero)
         senha <- numero + senha
         Escreval ("")
         SE (senha = 2025) ENTAO
            Limpatela
            Escreval ("**********************************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("                       SEJA BEM VINDO                     ")
            Escreval ("                               ",login                    )
            Escreval ("")
            Escreval ("                                                          ")
            Escreval ("**********************************************************")
            Escreval ("")
            Leia(op)
         SENAO
            Limpatela
            Escreval ("**********************************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("                  VOCÊ FALHOU MISERAVELMENTE              ")
            Escreval ("                        TENTA DE NOVO                     ")
            Escreval ("")
            Escreval ("                                                          ")
            Escreval ("**********************************************************")
            Escreval ("")
            Leia(op)
         fimse

      ATE (senha = 2025)
      se (op = 0) entao
         Limpatela
         Escreval ("**********************************************************")
         Escreval ("                   CADASTRO DE FUNCIONÁRIO                ")
         Escreval ("**********************************************************")
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


         //----------------------------------------------------------------------//

         Escreval ("*************************************************************")
         Escreval ("                              CADASTRAR                      ")
         Escreval ("*************************************************************")
         Escreval ("")

         Se (op = 1) entao
            Escreval ("Qual o nome do funcionário? ")
            Leia(Nome)

            enquanto (Nome = "") faca
               limpatela
               Escreval ("*******************************************************")
               Escreval ("                       CADASTRAR                       ")
               Escreval ("*******************************************************")
               Escreval ("")
               Escreval ("Qual o nome do funcionário? ")
               Leia(Nome)
            fimenquanto

            Escreval ("")
            Escreval ("Qual a idade do funcionário?")
            Leia(data)

            enquanto (data = "") faca
               limpatela
               Escreval ("*******************************************************")
               Escreval ("                         CADASTRAR                     ")
               Escreval ("*******************************************************")
               Escreval ("")
               Escreval ("")
               Escreval ("Qual a idade do funcionário?")
               Leia(data)
            fimenquanto

            Escreval ("")
            Escreval ("Qual o endereço?")
            Leia(ende)

            enquanto (ende = "") faca
               limpatela
               Escreval ("*******************************************************")
               Escreval ("                       CADASTRAR                       ")
               Escreval ("*******************************************************")
               Escreval ("")
               Escreval ("")
               Escreval ("Qual o endereço?")
               Leia(ende)
            fimenquanto

            Escreval ("")
            Escreval ("Qual o salário?")
            Leia(salario)

            enquanto (salario = "") faca
               limpatela
               Escreval ("*******************************************************")
               Escreval ("                       CADASTRAR                       ")
               Escreval ("*******************************************************")
               Escreval ("")
               Escreval ("")
               Escreval ("Qual o salário?")
               Leia(salario)
            fimenquanto

            Escreval ("")
            limpatela
            Escreval ("")
            Escreval ("")
            Escreval ("**********************************************************")
            Escreval ("                     CADASTRAR REALIZADO                  ")
            Escreval ("**********************************************************")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("0 - MENU")
            Escreval ("ESC - SAIR")
            Leia(op)
         fimse

         //-----------------------------------------------------------------------//

         Se (op = 2) entao
            limpatela
            Escreval ("**********************************************************")
            Escreval ("                          CONSULTA                        ")
            Escreval ("**********************************************************")
            Escreval ("")
            Escreval ("NOME: ",Nome)
            Escreval ("")
            Escreval ("IDADE: ",data)
            Escreval ("")
            Escreval ("ENDEREÇO: ",ende)
            Escreval ("")
            Escreval ("SALÁRIO: R$ ",salario)
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("")
            Escreval ("0 - MENU")
            Escreval ("ESC - SAIR")
            Escreval ("")
            Leia(op)
         fimse
         fimse
         limpatela
      ATE (op = 999)



      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("****************************************************************")
      Escreval ("                                ATÉ LOGO:)                      ")
      Escreval ("****************************************************************")
      Escreval ("")
      Escreval ("")
      Escreval ("")
      Escreval ("")

Fimalgoritmo