-- CRIANDO DATABASE 


create database Musica -- Comando para criar um Database
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 



-- CRIANDO UMA TABELA MUSICA 

create table Albuns (
id int not null auto_increment,
Nome varchar(50)not null,
Artista  varchar(50),
Ano_lançamento  int,
Genero varchar(50),
primary key (id)
)default charset = utf8mb4;



select *from Albuns;

