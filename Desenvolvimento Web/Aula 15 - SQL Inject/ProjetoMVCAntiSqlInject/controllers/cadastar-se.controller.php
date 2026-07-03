<?php


$mensagem = null;

if ($_SERVER['REQUEST_METHOD'] == 'POST') {


    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];

    $validacao = Validacao::validar([
        'nome' => ['required'],
        'email' => ['required', 'email'],
        'senha' => ['required']
    ], $_POST);


    if ($validacao->naoPassou()) {

        header("Location: /cadastar-se");
        exit();
    }

    if ('email') {
        $usuario = $database->query(
            sql: "select * from usuario where email = :email",
            params: ['email' => $_POST['email']]
        )->fetch();

        if ($usuario) {
            flash()->push('mensagem', "Email já cadastrado!");
            header("Location: /cadastar-se");
            exit();
        }
    }

    $database->query(
        sql: "insert into usuario (nome, email, senha) values
(:nome, :email, :senha)",
        params: [
            'nome' => $_POST['nome'],
            'email' => $_POST['email'],
            'senha' => password_hash($_POST['senha'], PASSWORD_DEFAULT)
        ]
    );
    flash()->push('mensagem', "Usuário registrado com sucesso!");
    $mensagem = "Obrigado $nome pelo seu cadastro";
    



}

view2('cadastar-se', compact('mensagem'));





