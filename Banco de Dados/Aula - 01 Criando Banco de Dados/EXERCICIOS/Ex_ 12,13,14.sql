-- CRIANDO DATABASE 


create database Cinema -- Comando para criar um Database
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 


-- CRIANDO UMA TABELA FILMES

create table Filmes (
id int not null auto_increment,
Titulo varchar(50)not null,
Diretor varchar(50),
Genero varchar(50)not null,
Duração time,
Classificação_Etaria enum('L','10','12','14','16','18'),
primary key (id)
)default charset = utf8mb4;


-- INSERINDO DADOS NA TABELA 

insert into Filmes values
(default,'Batman VS Superman', 'Zack Snyder', 'Ação','02:30','16'),
(default,'Homem de Aço', 'Zack Snyder', 'Ação','02:00','16');

