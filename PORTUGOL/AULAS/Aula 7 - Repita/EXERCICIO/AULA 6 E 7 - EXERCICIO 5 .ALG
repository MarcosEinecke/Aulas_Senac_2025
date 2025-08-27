Algoritmo "AULA 6 E 7 - EXERCICIO 5 "

Var
   // Seção de Declarações das variáveis

   numero, palpite, tentativas: inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   numero <- randi(101)
   tentativas <- 0

   escreval("Tente adivinhar o número de 1 a 100")

   REPITA

      escreval ("Tentativa ",tentativas,":")
      Leia(palpite)
      enquanto (palpite <= 0) faca
         Escreval ("NÚMERO INVALIDO")
         escreval ("Tentativa ",tentativas,":")
         Leia(palpite)
      fimenquanto
      tentativas <-  tentativas + 1

      Se (palpite = numero) entao
         escreval("Parabéns! Você acertou em ",tentativas," tentativas")
         interrompa //sai do laço quando acerto o número
      senao
         Se(palpite < numero) entao
            Escreval ("O número é MAIOR. Tente novamente")
         senao
            escreval ("O número é MENOR. Tente novamente")
         fimse
      fimse

   ate (tentativas = 7)

   Se (palpite <> numero) entao
      Escreval ("Você não conseguiu adivinhar o número. O número era ",numero)
   fimse

Fimalgoritmo


Exercício 5: Jogo de adivinhação com repita
Criar um jogo de adivinhação onde o programa gera um número aleatório entre 1 e 100, e o usuário tenta adivinhar. O programa deve fornecer dicas (maior ou menor) e contar as tentativas. O jogo termina quando o usuário acerta o número.




