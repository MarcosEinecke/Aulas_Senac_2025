<section>


    <div class="w-full h-fit bg-white rounded-lg shadow dark:border md:mt-0 sm:max-w-md xl:p-0 dark:bg-gray-800 dark:border-gray-700">
        <div class="  flex flex-col items-center justify-center px-6 py-8 mx-auto mt-4 lg:py-0">
            <a href="index" class="  flex items-center mb-6 text-2xl font-semibold text-gray-900 dark:text-white">
                <img class="w-72 rounded-lg " src="/view/img/login2.png" alt="logo">

            </a>
            <div class="p-6 space-y-4 md:space-y-6 sm:p-8">
                <h1 class="text-xl font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white">
                    Cadastre-se sua conta.
                </h1>
                <form class="space-y-4 md:space-y-6" action="" method="POST">


                    <div>
                        <label for="nome" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Nome</label>
                        <input type="text" name="nome" id="nome" class="bg-gray-50 border border-gray-300 text-gray-900 rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500 " placeholder="Seu nome">
                    </div>

                    <div>
                        <label for="email" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Seu email</label>
                        <input type="email" name="email" id="email" class="bg-gray-50 border border-gray-300 text-gray-900 rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500 " placeholder="nome@email.com">
                    </div>

                    <div>
                        <label for="senha" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Senha</label>
                        <input type="password" name="senha" id="senha" placeholder="••••••••" class="bg-gray-50 border border-gray-300 text-gray-900 rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                    </div>



                    <div>
                        <?php if ($mensagem = flash()->get('validacoes')) : ?>
                            <?php foreach ($mensagem as $m): ?>
                                <div class="bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded relative" role="alert">
                                    <span class="block sm:inline"><?= $m; ?></span>
                                </div>
                            <?php endforeach; ?>
                        <?php endif; ?>

                        <?php if ($mensagem = flash()->get('mensagem')) : ?>
                            <script>
                                alert('<?= $mensagem ?>');
                            </script>
                        <?php endif; ?>
                       


                    </div>


                    <button type="submit" class="w-fullbg-gray-50 border hover:scale-105 border-gray-300 text-white rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">Entrar</button>
                    <p class="text-sm font-light text-white  dark:text-gray-400">
                        Já tem conta? <a href="login" class=" text-blue-500 font-medium text-primary-600 hover:underline dark:text-primary-500">Faça login </a>
                    </p>
                </form>
            </div>
        </div>
    </div>
</section>