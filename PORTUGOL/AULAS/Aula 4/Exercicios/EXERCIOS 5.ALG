Algoritmo "Exercios 5"


Var
// Seção de Declarações das variáveis 

largura, comprimento: real
area: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Vamos ver a classificação do seu terreno:")
Escreval ("Qual a largura do seu terreno?")
         leia(largura)
Escreval ("Qual o comprimento do seu terreno?")
         leia(comprimento)
Escreval (" largura=", largura, " comprimento=", comprimento)

area <- (largura * comprimento)

Escreval ("A area do seu terreno é", area,"m²")


//--------------------------------------------------------------------//

Se (area >= 500) então
    Escreval ("TERRENO VIP")
fimse

Se (area < 500) e (area >= 100) então
   Escreval (" TERRENO MASTER")
fimse

Se (area < 100) então
   Escreval (" TERRENO POPULAR")
fimse



Fimalgoritmo