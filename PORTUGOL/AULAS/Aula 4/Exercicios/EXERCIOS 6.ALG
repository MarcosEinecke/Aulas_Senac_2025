Algoritmo "Exercios 6"


Var
// Seção de Declarações das variáveis 

funcionario: caracter
salarioAtual,novoSalario, aumento,anos: real


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

Se (anos < 3) então
    aumento <- (salarioAtual * 0.03)
fimse

Se (anos >= 3)  e (anos < 10) então
    aumento <- (salarioAtual * 0.125)
fimse

Se (anos >= 10) então
    aumento <- (salarioAtual * 0.20)
fimse

//--------------------------------------------------------------------//

novoSalario <- (salarioAtual + aumento)

Escreval ("Seu aumeto é R$ ", aumento)
Escreval ("Seu novo salário é R$ ", novoSalario)


Fimalgoritmo