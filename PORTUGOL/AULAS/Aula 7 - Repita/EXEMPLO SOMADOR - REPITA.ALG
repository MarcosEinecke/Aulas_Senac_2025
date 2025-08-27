Algoritmo "EXEMPLO SOMADOR - REPITA"
/
Var
   // Seção de Declarações das variáveis

   valor,soma: inteiro
   resposta: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...


   //USANDO REPITA
   //soma <- 0
   //repita
   //Escreval ("Digite uma valor para ser somador: ")
   //leia(valor)
   //soma <- soma + valor
   // Escreval ("Você quer continuar? S ou N")
   //leia(resposta)
   //ate (resposta = "n")
   //Escreval ("A soma de todos os valores é: ",soma)

   //----------------------------------------------------------------------//


   //USANDO ENQUANTO
   soma <- 0
   resposta <- "s"
   enquanto (resposta = "s") ou (resposta = "S")faca
      Escreval ("Digite um valor somador: ")
      leia(valor)
      soma <- soma + valor
      Escreval ("Você quer continuar? s ou n")
      leia(resposta)
   fimenquanto
   Escreval ("A soma de todos os valores é: ",soma)

Fimalgoritmo