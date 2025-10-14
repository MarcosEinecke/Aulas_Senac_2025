
-- CRIANDO DATABASE COM CARACTER ESPECIAL E ACENTUAÇÃO 

create database Biblioteca
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 
;


--  CRIANDO TABELA LIVROS COM AUTO INCREMENTO

create table Livros (
id int not null auto_increment,
Titulo varchar(50)not null,
Autor varchar(50)not null,
Ano_Publicação int ,
Disponivel boolean ,
primary key (id)
)default charset  = utf8mb4;


-- INSERINDO LIVROS NA TABELA

insert into Livros values 
(default,'Harry Potter 1','J. K. Rowling','1997',true),
(default,'Harry Potter 2','J. K. Rowling','1998',false),
(default,'Harry Potter 3','J. K. Rowling','1999',false),
(default,'Harry Potter 4','J. K. Rowling','2000',false);










-- drop table Livros;--
desc livros;
select *from livros;

