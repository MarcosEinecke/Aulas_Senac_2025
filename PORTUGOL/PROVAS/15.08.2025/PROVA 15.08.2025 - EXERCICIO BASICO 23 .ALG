Algoritmo "PROVA 15.08.2025 - EXERCICIO BASICO 23 "

Var
   // Seção de Declarações das variáveis
   num: inteiro
   opcao: caractere
   sair: caractere
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   REPITA

      Escreval ("=========================")
      Escreval ("   MENU DO PROGRAMA      ")
      Escreval ("=========================")
      Escreval ("Escolha uma opção: ")
      Escreval ("[1] Novo arquivo")
      Escreval ("[2] Salvar")
      Escreval ("[3] Salvar como...")
      Escreval ("[4] Sair do programa")
      Escreval ("[5] Fechar o programa e desligar o PC")
      Escreval ("")
      Leia(num)

      //----------------------------------------------------------------//
      enquanto (num > 5) ou ( num = 0)  faca
         se (num > 5) ou ( num < 1) entao
            limpatela
            Escreval ("        DIGITE UM NÚMERO VÁLIDO.               ")
            leia(num)
            fimse
            limpatela
            Escreval ("=========================")
            Escreval ("   MENU DO PROGRAMA      ")
            Escreval ("=========================")
            Escreval ("Escolha uma opção: ")
            Escreval ("[1] Novo arquivo")
            Escreval ("[2] Salvar")
            Escreval ("[3] Salvar como...")
            Escreval ("[4] Sair do programa")
            Escreval ("[5] Fechar o programa e desligar o PC")
            Escreval ("")
            Escreval ("")
            Escreval ("                                ESC PARA SAIR ")
            Leia(num)
            limpatela
         fimenquanto
         //----------------------------------------------------------------//
         escolha num
         caso 1
            opcao <- "Novo Arquivo Criado"
         caso 2
            opcao <- "Arquivo Salvo"
         caso 3
            opcao <- "Arquivo Salvo como Cópia"
         caso 4
            opcao <- "Você saiu do programa"
         caso 5
            opcao <- "Seu PC está sendo desligado"
         fimescolha
         limpatela
         Escreval ("---------------------------")
         Escreval (opcao)
         Escreval ("---------------------------")
         Escreval ("Aperte qualquer tecla para voltar ao menu..")
         leia(sair)
         limpatela
      ate (num = 4)  ou (num = 5)

Fimalgoritmo