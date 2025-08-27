Algoritmo "Exercicios "

Var
   // Seção de Declarações das variáveis

   n,i, cont:inteiro


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval ("Digite um número: ")
   leia(n)

   para i de 1 ate n faca
      se (n % i = 0) entao
         cont <- cont + 1
      fimse
   fimpara
   se (cont = 2) entao
      escreval ("O número ",n," é primo")
   senao
      Escreval ("O número ",n," não é primo")
   fimse


Fimalgoritmo