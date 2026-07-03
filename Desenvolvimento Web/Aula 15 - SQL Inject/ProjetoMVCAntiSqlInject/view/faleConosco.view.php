<div class=" w-3/5 bg-white/95 backdrop-blur-xl border border-white/50 rounded-[40px] shadow-2xl p-10">
    <h1 class="text-3xl font-semibold text-slate-900 text-center mb-2">Fale Conosco</h1>
    <p class="text-center text-slate-600 mb-10">Sua opinião é importante para nós!</p>

    <form class="space-y-6" action="registrar" method="post">
        <div>
            <label for="nome" class="block text-sm font-semibold text-slate-700 mb-2">Nome *</label>
            <input type="text" id="nome" name="nome"
                class="w-full rounded-3xl border border-slate-300 bg-white px-4 py-3 text-sm text-slate-900 placeholder-slate-400 shadow-sm transition focus:border-indigo-500 focus:outline-none focus:ring-2 focus:ring-indigo-200" />
        </div>
        <div>
            <label for="email" class="block text-sm font-semibold text-slate-700 mb-2">Email *</label>
            <input type="text" id="email" name="email"
                class="w-full rounded-3xl border border-slate-300 bg-white px-4 py-3 text-sm text-slate-900 placeholder-slate-400 shadow-sm transition focus:border-indigo-500 focus:outline-none focus:ring-2 focus:ring-indigo-200" />
        </div>

        <div>
            <label for="assunto" class="block text-sm font-semibold text-slate-700 mb-2">Assunto *</label>
            <input type="text" id="assunto" name="assunto"
                class="w-full rounded-3xl border border-slate-300 bg-white px-4 py-3 text-sm text-slate-900 placeholder-slate-400 shadow-sm transition focus:border-indigo-500 focus:outline-none focus:ring-2 focus:ring-indigo-200" />
        </div>

        <div>
            <label for="mensagem" class="block text-sm font-semibold text-slate-700 mb-2">Mensagem *</label>
            <textarea id="mensagem" name="mensagem" rows="6"
                class="w-full rounded-3xl border border-slate-300 bg-white px-4 py-3 text-sm text-slate-900 placeholder-slate-400 shadow-sm transition focus:border-indigo-500 focus:outline-none focus:ring-2 focus:ring-indigo-200 resize-y"></textarea>
        </div>


        <?php
        if (isset($_SESSION['validacoes'])) {
            flash()->push('validacoes', $_SESSION['validacoes']);
            foreach ($_SESSION['validacoes'] as $validacao) {
                echo "<p class='text-red-500 text-sm mb-2'>$validacao</p>";
            }
            unset($_SESSION['validacoes']);
        }
        ?>

        <?php

        if ($mensagem) {

            echo "<script>
        alert('$mensagem');
</script>";
        }
        ?>



        <button type="submit"
            class="w-full rounded-3xl bg-gradient-to-r from-indigo-600 to-violet-600 px-5 py-3 text-sm font-semibold text-white shadow-lg shadow-violet-500/30 transition duration-200 hover:-translate-y-0.5 hover:shadow-violet-500/40">
            Enviar Feedback
        </button>
    </form>

</div>