<?php

 $pesquisar = $_REQUEST['pesquisar'] ?? '';

$artigos = $database->artigos($pesquisar);




view('noticias', compact('artigos'));


