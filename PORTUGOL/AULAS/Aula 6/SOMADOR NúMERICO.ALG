Algoritmo "Somador Númerico"

Var
   // Seção de Declarações das variáveis

   cont,num,soma,maior: inteiro
   op: caracter
   
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

  op <- "s"
   enquanto (op = "s") ou (op = "S") faca
   
   cont <- 1
   soma <- 0
   
   Enquanto (cont <= 5) faca
      escreval ("Digite o ", cont, " ° valor")
      leia (num)
      se (num > maior) entao
         maior <- num
      fimse
      cont <- cont + 1
      soma <- soma + num

   fimenquanto
   escreval ("A soma de todos os valores é ", soma)
   escreval ("O maior número digitado é ", maior)
   escreval ("Deseja conitinuar S/N ?")
   leia (op)


 fimenquanto
Fimalgoritmo