<!-- Lista de Artigos -->

<br><br><br><br>


<h1 class="text-3xl text-neutral-800 mt-4 text-center items-center">📰 Últimas Notícias </h1>

<section class="grid    grid-cols-4 gap-2">

    <!-- Artigo -->


    <?php foreach ($artigos as $artigo) : ?>



        <div class="max-w-80 rounded-lg overflow-hidden bg-white shadow-md m-5 transition-transform duration-200 ease-in-out hover:-translate-y-1.5 ">
            <img class="w-full h-auto block" src="<?= $artigo->link ?> " alt="Imagem do artigo">
            <div class="">
                <h3 class="text-lg p-7 text-center font-medium text-neutral-800 mb-2.5"> <?= $artigo->titulo ?> </h3>
                <p class="text-[0.9em] text-gray-500 mb-2.5 text-center"> <?= $artigo->dataPublicacao ?> </p>
                <p class="text-base text-gray-600 mb-  text-center">
                    <?= $artigo->descricao ?><br><br>


                    <button class="inline-block   px-3 py-2 bg-blue-600 text-white no-underline rounded" href="<?= $artigo->img ?>">Ver Post </button>
            </div>


        </div>


    <?php endforeach; ?>


</section>