Algoritmo "AULA 8 (CASO)  - EXEMPLO 1 - MENU "

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
      enquanto (num > 5)  faca
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
      Escreval ("Aperte qualquer tecla pra sair..")
      leia(sair)
      limpatela
   ate (num = 4)  ou (num = 5)

Fimalgoritmo