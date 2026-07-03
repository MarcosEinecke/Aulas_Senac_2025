<?php


$pdo = new PDO('sqlite:database.sqlite');

$pdo->exec('DELETE FROM alunos WHERE id = 3');
