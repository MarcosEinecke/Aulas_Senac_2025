Algoritmo "EXEMPLO CONTANDO NEGATIVOS - REPITA"
/
Var
   // Seção de Declarações das variáveis
   num,cont, totalN: inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   cont <- 1
   totalN <- 0
   repita
      Escreval ("Digite um número: ")
      leia(num)
      Se (num < 0) entao
         totalN <- totalN + 1
      fimse
      cont <- cont + 1
   ate(cont > 5)
   Escreval ("Foram digitados ", totalN," valores negativos")

Fimalgoritmo