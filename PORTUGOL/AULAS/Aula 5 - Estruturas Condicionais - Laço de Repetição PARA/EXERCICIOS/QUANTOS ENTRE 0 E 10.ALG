Algoritmo "QUANTOS ENTRE 0 E 10"

Var
   // Seção de Declarações das variáveis

   c,v,total,impar: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   para c <- 1 ate 6 faca
      escreval ("Digite um valor:")
      leia (v)
      se (v >= 0) e (v  <= 10) entao
         total <- total + 1
         se (v % 2=1) entao
            impar <- impar + v
         fimse
      fimse
   fimpara
   escreval ("Ao todo foram ",total, " valeroes de 0 e 10")
   escreval ("Nesse intervalo a soma de impares foi ",impar)

Fimalgoritmo