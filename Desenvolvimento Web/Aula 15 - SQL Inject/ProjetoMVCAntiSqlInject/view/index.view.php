<section class="bg-transparent ">

    <img class="w-full  mt-20" src="/view/img/Screenshot_1.jpg" alt="inicio">

    <div class="flex flex-col justify-center text-center items-center">

        <div class=" w-1/2  text-[1.0rem] mt-[2rem] text-justify   ">
            
            <br>
            <p>Bem-vindo ao seu portal definitivo de tecnologia! Somos dedicados a trazer para você as mais
                atualizadas notícias, análises aprofundadas e tendências emergentes do universo digital. Nosso
                objetivo é mantê-lo constantemente informado sobre as inovações que moldam o futuro, oferecendo
                conteúdo de qualidade que vai desde descobertas revolucionárias até insights valiosos sobre como
                a tecnologia impacta o nosso dia a dia. Explore nosso acervo completo e mergulhe em um mundo de
                conhecimento, desvendando os segredos da transformação digital e permanecendo sempre à frente
                das mudanças do mercado tecnológico.</p>


            <div class="flex justify-center">
                <video class="w-96   mt-8 rounded-2xl" src="/view/img/Indroducao.mp4" loop autoplay
                    muted></video>
            </div>

        </div>


        <div class="flex flex-col text-start w-1/2 text-[#333] ">
            <h2 class="text-3xl text-neutral-800 mt-4">📰 Últimas Notícias</h2>
            <br>
            <P>
                Fique por dentro das últimas notícias do mundo da tecnologia!
                Acompanhe as tendências, lançamentos e inovações que estão moldando o futuro digital.
                Explore análises aprofundadas, entrevistas exclusivas e insights valiosos sobre o impacto da
                tecnologia
                em nossas vidas.
                Mantenha-se informado e conectado com o universo tecnológico através do nosso portal, onde a
                informação é a chave para o futuro.



            </P>

        </div>
    </div>
    <br>
</section>




<section class="grid    grid-cols-4 gap-2  w-5/6  ml-32">

    <!-- Artigo -->


    <?php foreach ($artigos as $artigo) : ?>



        <div class="max-w-80 rounded-lg overflow-hidden bg-white shadow-md m-5 transition-transform duration-200 ease-in-out hover:-translate-y-1.5 ">
            <img class="w-full h-auto block" src="<?= $artigo->link ?> " alt="Imagem do artigo">
            <div class="">
                <h3 class="text-lg  text-center font-medium text-neutral-800 mb-2.5"> <?= $artigo->titulo ?> </h3>
                <p class="text-[0.9em] text-gray-500 mb-2.5 text-center"> <?= $artigo->dataPublicacao ?> </p>
                <p class="text-base text-gray-600 mb-  text-center">
                    <?= $artigo->descricao ?><br><br>


                    <button class="inline-block   px-3 py-2 bg-blue-600 text-white no-underline rounded" href="<?= $artigo->img ?>">Ver Post </button>
            </div>


        </div>


    <?php endforeach; ?>


</section>