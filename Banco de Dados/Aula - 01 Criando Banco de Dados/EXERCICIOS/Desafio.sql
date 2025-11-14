-- DESAFIO   JOGOS

create database Jogos 
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 


create table pessoas(
id int not null  auto_increment,-- Vai ser incrementado um valor automático

Jogo varchar(50)not null,-- *Campo obrigatório*
Plataforma date,-- 10/09/2025 Data invertido (modelo EUA)
Gênero enum('M','F','O'),
Desenvolvedora decimal(5,2), -- |1|0|2,|3|5| - 5 é a quantidade de casas e 2 a qtd após a vírgula 
altura decimal(3,2), -- |1,|8|0| 
nacionalidade varchar(20) default 'Brasil',
primary	key (id) -- algo único 
)default charset = utf8mb4;
