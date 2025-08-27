Algoritmo "Exercios 6"


Var
// Seção de Declarações das variáveis 

funcionario: caracter
salarioAtual,anos: real
aumento1,aumento2, aumento3: real
salarioNovo1, salarioNovo2, salarioNovo3: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Vamos ver seu novo salário:")
Escreval("Qual seu nome?")
    leia(funcionario)
Escreval("Qual seu salário atual?")
    leia(salarioAtual)
Escreval("Qual seu tempo de empresa(informar em anos)?")
    leia(anos)

//--------------------------------------------------------------------//

aumento1 <- (salarioAtual * 0.03)
aumento2 <- (salarioAtual * 0.125)
aumento3 <- (salarioAtual * 0.20)


//-----------------------------------------------------------------------//


Se (anos < 3) então
    Escreval ("Seu aumento é R$ ", auemnto1)
fimse

Se (anos >= 3)  e (anos < 10) então
    Escreval ("Seu aumento é R$ ", aumento2)
fimse

Se (anos >= 10) então
    Escreval ("Seu aumento é R$ ", aumento3)
fimse

//--------------------------------------------------------------------//

novoSalario1 <- (salarioAtual + aumento1)
novoSalario2 <- (salarioAtual + aumento2)
novoSalario3 <- (salarioAtual + aumento3)


Se (anos < 3) então
    Escreval ("Seu novo salário é R$ ", salarioNovo1)
fimse

Se (anos >= 3)  e (anos < 10) então
    Escreval ("Seu novo salario é R$ ", salarioNovo2)
fimse

Se (anos >= 10) então
    Escreval ("Seu novo salario é R$ ", salarioNovo3)
fimse





Fimalgoritmo