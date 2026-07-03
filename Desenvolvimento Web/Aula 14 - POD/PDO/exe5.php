<?php

session_start();


if (isset($_POST['nome'])) {

    $n = $_POST['nome'];
    $i = $_POST['idade'];
    $c = $_POST['curso'];
    $no = $_POST['nota'];

    $pdo = new PDO('sqlite:database.sqlite');

    $pdo->exec("INSERT INTO alunos(nome, idade, curso, nota) 
VALUES ('$n', '$i', '$c', '$no')");

    $_SESSION['mensagem'] = "Usuario cadastrado com sucesso!";
}



?>



<?php if (isset($_SESSION['mensagem'])): ?>
    <h1><?= $_SESSION['mensagem'] ?></h1>
<?php 

unset($_SESSION['mensagem']);
endif; ?>
<form action="" method="post">
    <label for="">Nome</label><br>
    <input type="text" name="nome" required><br>

    <label for="">Idade</label><br>
    <input type="text" name="idade" required><br>

    <label for="">Curso</label><br>
    <input type="text" name="curso" required><br>

    <label for="">Nota</label><br>
    <input type="text" name="nota" required><br>

    <button type="submit">Em viado</button><br>
</form>