<?php

 $pesquisar = $_REQUEST['pesquisar'] ?? '';

$artigos = $database->artigos($pesquisar);




view('minhasNoticias', compact('artigos'));


