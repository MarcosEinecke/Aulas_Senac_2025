Algoritmo "Exercios 4"


Var
// Seção de Declarações das variáveis 

ProvaA, ProvaB: real
Media: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval ("Vamos ver se você está aprovado,reprovado ou de recuperção:")
Escreval ("Infome a sua nota da Prova A e Prova B ?")
Leia (ProvaA, ProvaB)
     Escreval (" ProvaA= ", ProvaA, " ProvaB= ", ProvaB)

Media <- ((ProvaA + ProvaB)/2))
     Escreval (" Media= ", Media)

Se (Media >= 7.0) então
    Escreval ("APROVADO")
fimse

Se (Media < 7.0) e (Media >= 5.0) então
    Escreval ("RECUPERAÇÃO")
fimse

Se (Media < 5.0) então
    Escreval ("REPROVADO")
fimse





Fimalgoritmo