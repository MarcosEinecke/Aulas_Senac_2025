<?php


class DB
{

// Criação do atributo $Db que vai receber o obj do tipo PDO
    public $db;

    public function __construct()
    {
        //Criando o obj do tipo PDO
        $this->db = new PDO('sqlite:database.sql');
    }


    public function livros()
    {

        //Cria a query para selecionar todos os livros
        $query = $this->db->query("select * from livros");
        //executa a query dentro do DB e retorna o resultado para a variavel $ITEMS
        $items = $query->fetchAll();

        //Retorna um array de obj que é criado a partir da função Make
        return array_map(fn($item) => Livro::make($item), $items);
    }



    public function livro($id)
    {
        //Cria a query para selecionar o livro com o ID que recebemos
        $query = $this->db->query("select * from livros where id = " . $id);

        //Recebe o livro e guarda na variavel items
        $items = $query->fetchAll();

        //cria um obj do tipo livro passando pela função Make
        return array_map(fn($item) => Livro::make($item), $items)[0];
    }
}
