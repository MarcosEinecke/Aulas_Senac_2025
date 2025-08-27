algoritmo "Exercicío 23"
var
   angulo_graus, angulo_radianos, resultado_seno: real

inicio
   escreva("Digite o ângulo em graus: ")
   leia(angulo_graus)

   // Converte graus para radianos
   angulo_radianos := angulo_graus * (3.14159 / 180)

   // Calcula o seno do ângulo
   resultado_seno := seno(angulo_radianos)

   escreva("O seno de ", angulo_graus, " graus é: ", resultado_seno)
fimalgoritmo