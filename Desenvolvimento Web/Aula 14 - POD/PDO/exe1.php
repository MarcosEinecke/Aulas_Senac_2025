<?php 

$pdo = new PDO('sqlite:database.sqlite');

$pdo->exec("INSERT INTO alunos(nome, idade, curso, nota) 
VALUES ('Neymar', 20, 'Informatica', 8.5)");
