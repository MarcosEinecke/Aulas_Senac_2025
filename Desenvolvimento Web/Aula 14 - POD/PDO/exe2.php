<?php

$pdo = new PDO('sqlite:database.sqlite');

$alunos = $pdo->query('SELECT count(*) as Quantidade FROM alunos')->fetchAll();

var_dump($alunos);
