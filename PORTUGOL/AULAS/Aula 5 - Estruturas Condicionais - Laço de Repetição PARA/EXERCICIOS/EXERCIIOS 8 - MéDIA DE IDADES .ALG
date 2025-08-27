Algoritmo "Exerciios 8 - Média de idades "

Var
   // Seção de Declarações das variáveis

   i: inteiro
   idade, soma, media: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   soma<- 0

   Para i de 1 ate 5 faca
      Escreval ("Digite a idade da pessoa ",i,": ")
      leia(idade)
      soma <- soma + idade
   fimpara
   media <- soma /5
   Escreval ("A média das idades é: ",media:4:2)


Fimalgoritmo