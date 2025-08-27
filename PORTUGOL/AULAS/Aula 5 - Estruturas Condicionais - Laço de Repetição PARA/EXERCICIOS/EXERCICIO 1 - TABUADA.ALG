Algoritmo "Exercicio - Tabuada  "

Var
   // Seção de Declarações das variáveis

   num,cont,vz: inteiro
   continuar: caracter
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   continuar <- "s"
   enquanto (continuar = "s") faca
      limpatela
      Escreval ("Gerador de tabuada")
      Escreval ("Qual o número você gostaria de fazer a tabuada ?")
      Leia(num)
      Escreval ("Até qual número você gostaria de mutiplicar?")
      Leia(vz)

      Para  cont de 1  ate vz  faca
         Escreval (num," X ", cont," = ", num*cont)
      fimpara
      Escreval ("Sua tabuada está pronta")
      Escreval ("Você gostaria de gerar outra tabuada? S(Sim)/N(Não)")
      Leia(continuar)
   fimenquanto

Fimalgoritmo