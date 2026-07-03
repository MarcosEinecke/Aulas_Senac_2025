<div class="p-2 rounded border-stone-800 border-2 bg-stone-900">

    <div class="flex">

        <div class="w-1/3">Imagem</div>

        <div class="space-y-1">

            <a href="/livro.php?id=<?= $artigo->id ?>" class="font-semibold hover:underline"><?= $artigo->titulo ?></a>
            <div class="text-xs italic"><?= $artigo->$dataPublicacao ?></div>
            <div class="text-xs italic">⭐⭐⭐⭐⭐(3 Avaliações)</div>

        </div>

    </div>

    <div class="text-sm mt-2"><?= $artigo->descricao ?></div>

</div>