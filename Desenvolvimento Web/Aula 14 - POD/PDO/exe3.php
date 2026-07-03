<?php


$pdo = new PDO('sqlite:database.sqlite');

$pdo->exec('UPDATE  alunos SET curso = "Desenvolvimento Web" WHERE curso = "Informatica"');
