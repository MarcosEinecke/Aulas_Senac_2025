<?php


class Livro
{


    public $id;
    public $titulo;
    public $autor;
    public $descricao;
    public $img;



    public static function make($item)
    {

        $livro = new self();
        $livro->id = $item['id'];
        $livro->titulo = $item['titulo'];
        $livro->descricao = $item['descricao'];
        $livro->img = $item['img'];

        return $livro;
    }
}
