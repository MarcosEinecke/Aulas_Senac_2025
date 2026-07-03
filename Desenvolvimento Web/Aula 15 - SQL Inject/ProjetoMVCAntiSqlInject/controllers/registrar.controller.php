<?php



if ($_SERVER['REQUEST_METHOD'] == 'POST') {


    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $assunto = $_POST['assunto'];
    $mensagem = $_POST['mensagem'];


    $validacao = Validacao::validar([
        'nome' => ['required'],
        'email' => ['required', 'email'],
        'assunto' => ['required', 'min:8', 'max:64'],
        'mensagem' => ['required', 'min:8', 'max:255']
    ], $_POST);


    if ($validacao->naoPassou()) {
        $_SESSION['validacoes'] = $validacao->validacoes;
        header('location: /faleConosco');
        exit();
    }



    $database->query(
        sql: "insert into faleConosco (nome, email, assunto,mensagem) values
(:nome, :email, :assunto ,:mensagem)",
        params: [
            'nome' => $_POST['nome'],
            'email' => $_POST['email'],
            'assunto' => $_POST['assunto'],
            'mensagem' => $_POST['mensagem']
        ]
    );
    flash()->push('mensagem', "Feedback registrado com sucesso!");
    $mensagem = "Obrigado $nome pelo seu feedback";

    view2('faleConosco', compact('mensagem'));
    exit();
}


header('Location:  /faleConosco?mensagem=FeedBack realizado com sucesso!');
exit;
