-- CRIANDO DATABASE COM CARACTER ESPECIAL E ACENTUAÇÃO 

create database Empresa
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 
;

-- CRIANDO UM TABELA FUNCIONARIOS 

create table Funcionarios (
id int not null auto_increment,
Nome varchar(50),
Cargo varchar(50),
Salario decimal (6,2),
Data_Admissão date,
primary key (id)
)default charset  = utf8mb4;


-- INSERINDO DADOS NA TABELA FUNCIONARIOS

insert into Funcionarios values
(default,'Jorge Amado','Vendedor','3500.00','2020-08-02');

