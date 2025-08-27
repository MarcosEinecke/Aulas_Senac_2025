Algoritmo "Execicios 2"

Var
// Seção de Declarações das variáveis 

Distancia: real
Passagem: real



Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

algoritmo "calculo_preco_passagem"

var
    distancia: real
    preco: real

inicio
    escreva("Informe a distância da viagem em Km: ")
    leia(distancia)

    se distancia <= 200 entao
        preco := distancia * 0.50
    senao
        preco := distancia * 0.45
    fimse

    escreva("O preço da passagem será de R$", preco)
fimalgoritmo


Fimalgoritmo