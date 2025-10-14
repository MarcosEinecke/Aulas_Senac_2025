-- Como criar um bando de dados

create database cadastro -- Comando para criar um Database
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 


use	cadastro;

create table pessoas(
id int not null  auto_increment,-- Vai ser incrementado um valor automático

nome varchar(50)not null,-- *Campo obrigatório*
nascimento date,-- 10/09/2025 Data invertido (modelo EUA)
sexo enum('M','F','O'),
peso decimal(5,2), -- |1|0|2,|3|5| - 5 é a quantidade de casas e 2 a qtd após a vírgula 
altura decimal(3,2), -- |1,|8|0| 
nacionalidade varchar(20) default 'Brasil',
primary	key (id) -- algo único 
)default charset = utf8mb4;

desc pessoas; -- Describe (descrição da tabela)
select *from pessoas;-- Selecionando todas as informações da tabela pessoas


-- INSERINDO DADOS
-- 1) Maneira padrão


insert into pessoas
(id,nome,nascimento,sexo,peso,altura,nacionalidade)
values
(default,'Jailson','2025/12/30','M','85.6','1.85',default);

-- 2) Maneira Simplificada

insert into pessoas values
(default,'Paulo Guina','1998/03/05','M','90.4','1.95',default);


-- 3) Maneira Dinâmica
insert into pessoas values
(default,'MARCOLA','200/03/07','M','85.0','1.81',default),
(default,'Isaac','2003/03/03','O','50.4','1.65',default),
(default,'Xis-men','2001/04/05','M','90.4','1.65',default),
(default,'Gaguinho','2007/03/05','M','80.4','1.80',default),
(default,'Soldado','2006/04/24','M','75.4','1.75',default);




-- drop table pessoas; -- 

-- drop database cadastro;--


