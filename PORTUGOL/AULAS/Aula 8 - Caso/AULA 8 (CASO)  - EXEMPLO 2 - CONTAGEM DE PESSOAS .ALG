Algoritmo "AULA 8 (CASO)  - EXEMPLO 2 - CONTAGEM DE PESSOAS "

Var
   // Seção de Declarações das variáveis
   sexo,continuar: caractere
   idade,corCabelo,homensCastanhos,mulheresLoiras: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   homensCastanhos <- 0
   mulheresLoiras <- 0


   REPITA

      Escreval ("Qual é o sexo? [M/F/O]: ")
      Leia(sexo)
      Escreval ("Qual é a idade? ")
      Leia(idade)
      Escreval ("Qual é a cor do cabelo? ")
      Escreval ("1. Preto")
      Escreval ("2. Castanho")
      Escreval ("3. Loiro")
      Escreval ("4. Ruivo")
      Leia (corCabelo)

      se (sexo = "m")entao
         sexo <- "M"
      senao
         se (sexo = "f") entao
            sexo <- "F"
         fimse
      fimse

      Escolha sexo
      caso "M"
         se (idade >= 18) entao
            escolha corCabelo
            caso 2
               homensCastanhos <- homensCastanhos + 1
            fimescolha
         fimse

      caso "F"
         se (idade >= 25) ou (idade <= 30)entao
            escolha corCabelo
            caso 3
               mulheresLoiras <- mulheresLoiras + 1
            fimescolha
         fimse
      fimescolha
      Escreval("Quer continuar? [S/N]: ")
      Leia(continuar)
   ate (continuar = "N") ou (continuar = "n")

   Escreval ("Total de homens com mais de 18 anos e cabelos castalhos: ",homensCastanhos)
   Escreval ("Total de mulheres entre 25 e 30 anos e cabelos loiros: ",mulheresLoiras)


Fimalgoritmo