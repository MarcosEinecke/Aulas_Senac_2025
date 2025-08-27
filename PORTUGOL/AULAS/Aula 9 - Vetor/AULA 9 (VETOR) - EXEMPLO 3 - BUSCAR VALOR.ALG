Algoritmo "AULA 9 (VETOR) - EXEMPLO 3 - BUSCAR VALOR"

Var
   // Seção de Declarações das variáveis
   achou: logico
   i,alvo: inteiro
   v: vetor [0..5] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

para i de 0 ate 5 faca
Escreva ("v[",i,"]: ")
Leia(V[i])
fimpara

Escreva("Valor para buscar: ")
Leia(alvo)

achou <- falso
para i de  0 ate 5 faca
se v[I] = alvo entao
Escreval ("Achei o ", alvo ," na posição ",i)
fimse
fimpara
Se nao (achou) entao
Escreva ("Valoe não encontrado.")
fimse


Fimalgoritmo