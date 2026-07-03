<html lang="pt-BR">

<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal TEC</title>
    <script src="https://cdn.tailwindcss.com"></script>

    <script src="tailwind.config.js"></script>

</head>

<body class="font-sans leading-relaxed">
    <header class="bg-[#4632a0e7] text-white flex items-center justify-between fixed top-0 w-full h-20 ">
        <div>
            <img src="/view/img/inicio.jpg" alt="Logo do Portal Tec" class="w-[60px] ml-5 rounded-[1.5rem] " alt="Logo">
        </div>
        <nav>
            <a href="index" class="text-white no-underline font-bold text-lg mx-4">Início</a>
            <a href="#sobre" class="text-white no-underline font-bold text-lg mx-4">Sobre</a>


            <?php if (isset($_SESSION['auth'])) { ?>

                <a href="minhasNoticias" class="text-white no-underline font-bold text-lg mx-4">Minhas Noticias</a>

            <?php } else { ?>
                <a href="noticias" class=" text-white no-underline font-bold text-lg mx-4">Notícias</a>
            <?php } ?>



            <a href="faleConosco" class=" text-white no-underline font-bold text-lg mx-4" target="_blank">Fale Conosco</a>

        </nav>

        <?php if (isset($_SESSION['auth'])) { ?>
            <div class="flex items-center">
                <span class="mr-4">Olá, <?= $_SESSION['auth']->nome; ?></span>
                <a href="logout" class="text-white no-underline font-bold text-lg mx-4">Sair</a>
            </div>
        <?php } else { ?>
            <div><a href="login" class=" text-white no-underline font-bold text-lg mx-4" target="_blank">Entrar</a></div>
        <?php } ?>



    </header>

    <div>

        <?php require "view/{$view}.view.php"; ?>

    </div>

    <div id="sobre">

        <footer class="bg-[#4632a0] bg-opacity-[0.9] text-white text-center p-4">
            <p> Todos os direitos reservados Portal TEC 2026.</p>
        </footer>
    </div>
</body>

</html>