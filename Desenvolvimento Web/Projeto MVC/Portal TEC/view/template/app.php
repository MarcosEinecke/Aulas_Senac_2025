<html lang="pt-BR">

<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal Tec</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="Style.css">
    <script src="tailwind.config.js"></script>

</head>

<body>
    <header>
        <div>
            <img src="/view/img/inicio.jpg" alt="Logo do Portal Tec" class="logo">
        </div>
        <nav>
            <a href="index">Início</a>
            <a href="#sobre">Sobre</a>
            <a href="Noticias">Notícias</a>
            <a href="contato" target="_blank">Fale Conosco</a>

        </nav>

    </header>


    <?php require "view/{$view}.view.php"; ?>





    <br><br><br>
    <div id="sobre">

        <footer>
            <p> Todos os direitos reservados Portal TEC 2026.</p>
        </footer>
    </div>
</body>

</html>