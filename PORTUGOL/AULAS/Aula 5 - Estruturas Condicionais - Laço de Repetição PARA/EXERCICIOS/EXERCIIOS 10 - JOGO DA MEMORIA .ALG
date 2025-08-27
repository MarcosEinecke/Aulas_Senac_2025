Algoritmo "Exerciios 10 - Jogo da memoria "

Var
   // Seção de Declarações das variáveis

   numero, palpite, tentativas: inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   numero <- randi(100)
   tentativas <- 0

   escreval("Tente adivinhar o número de 1 a 100")


   para tentativas de 1 ate 7 faca
      escreval ("Tentativa ",tentativas,":")
      Leia(palpite)


      Se (palpite = numero) entao
         escreval("Parabéns! Você acertou em ",tentativas," tentativas")
         interrompa //sai do laço quando acerto o número
      senao
         Se(palpite < numero) entao
            Escreval ("O número é maior.")
         senao
            escreval ("O número é menor.")
         fimse
      fimse
   fimpara

   Se (palpite <> numero) entao
      Escreval ("Você não conseguiu adivinhar o número. O número era ",numero)
   fimse

Fimalgoritmo