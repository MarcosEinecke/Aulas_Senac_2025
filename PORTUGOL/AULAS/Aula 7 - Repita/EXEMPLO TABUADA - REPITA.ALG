Algoritmo "EXEMPLO TABUADA - REPITA"
/
Var
   // Seção de Declarações das variáveis

   cont, n, r: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   cont <- 1
   n <- 7
   repita
      r <- n * cont
      Escreval (n," x ",cont," = ",r)
      cont <- cont + 1
   ate (cont > 10)


Fimalgoritmo