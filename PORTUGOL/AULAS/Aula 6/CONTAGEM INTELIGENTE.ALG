Algoritmo "Melhor Aluno"


Var
   // Seção de Declarações das variáveis

   numAlunos, cont: inteiro
   nome, melhorAluno: caracter
   nota, maiorNota: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval ("ESCOLA SÓ DE GÊNIOS")
   Escreval ("--------------------")
   Escreval ("Quantos alunos tem turma?")
   Leia (numAlunos)


   cont <- 1
   maiorNota <- 0


   enquanto (cont <= numAlunos) faca
      Escreval ("--------------------")
      Escreval("ALUNO ", cont)
      Escreval ("Nome de ", nome, " : ")
      leia (nota)

      se (nota > maiorNota) entao
         maiorNota <- nota
         melhorNota <- nome
      fimse

      cont <- cont + 1
   fimenquanto
   Escreval ("--------------------")
   Escreval ("O melhor aluno foi o(a) ", melhorAluno, " com a nota ", maiorNota:4:2)


Fimalgoritmo