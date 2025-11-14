-- Exercícios de MySQL- Criação, Modificação e
--  Inserção de Dados (com foco em ALTER TABLE)

------------------------------------------------------------------------------------------------
-- 11. CRIE UM BANCO DE DADOS CHAMADO "LIVRARIA".


create database livraria
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 

use livraria; 

-------------------------------------------------------------------------------------------------

-- 12. CRIE UMA TABELA "LIVROS" COM AS COLUNAS: TITULO,AUTOR E ANO_PUBLICACAO.
-- 13. ADICIONE UMA COLUNA "ID" COMO CHAVE PRIMARIA COM AUTO INCREMENTO NO INICIO DA TABELA "LIVROS".

create table  livros (
id int not null  auto_increment,-- Vai ser incrementado um valor automático

Titulo varchar(50),
Autor varchar(50),
Ano_de_Publicacao year(4),


primary key (id)
)default charset = utf8mb4;


--------------------------------------------------------------------------------------------------------------------

-- 14. ADICIONE UMA COLUNA "ESTOQUE"(TIPO INT) À TABELA "LIVROS" COM VALOR PADRAO 0.

ALTER TABLE livros
ADD COLUMN estoque int;

------------------------------------------------------------------------------------------------------------------------

-- 15. Insira três livros na tabela "livros".

insert into livros values 
(default,'Branca de Neve','Irmões Grimm',1990,4),
(default,'Neve Branca','Irmões Grimm',1992,9),
(default,'Branca de Neve 2','Irmões Grimm',1995,5);

desc livros;
select*from livros;

--------------------------------------------------------------------------------------------------------------------------

-- 16.  16. Remova a tabela "livros" se ela existir.

DROP TABLE IF EXISTS livros








