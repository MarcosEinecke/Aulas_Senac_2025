algoritmo "Exercicío 1"
var

nome, sexo: caracter

valorCompras, desconto, ValorFinal: real


inicio

Escreval ("ATENÇÃO!")
Escreval ("Estamos com uma promoção de Dia da Mulher")
Escreval ("Mulheres ganham 13% de desconto em qualquer peça")
Escreval ("Homens também ganham, porém 5%")
Escreval ("Aproveitem")


Escreval ("Qual seu nome?")
Leia(nome)

Escreval ("Qual seu sexo(Masculino/Feminino)?")
Leia (sexo)

Escreval ("Qual o valor da sua compra?")
leia (valorCompras)


Se (sexo = "Masculino" ) entao
   desconto <- (valorCompras * 0.05)
          senão  (sexo = "Feminino" ) entao
             desconto <- (valorCompras * 0.13)
          
fimse

       valorFinal <- valorCompras - desconto
       
Escreval ("Parabéns: ", nome)
Escreval ("Você ganhor R$ ", desconto)
Escreval ("Sua compra deu  ", valorFinal)



fimalgoritmo