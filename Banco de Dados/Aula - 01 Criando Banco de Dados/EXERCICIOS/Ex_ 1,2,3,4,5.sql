
create database Escola
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 
;

--  CRIANDO TABELA  ALUNOS

create table Alunos(
id int not  null auto_increment,-- Vai ser incrementado um valor automático

Nome varchar(50)not null,
Data_nacimento date,
Turma varchar(2)not null,
Email varchar(50),
primary key (id)
)default charset  = utf8mb4;

-- INSERIR INFORMAÇÕES ALUNOS

insert into Alunos values
(default,'João Silva','2005-03-15','8A','joao.silva@email.com'),
(default,'Luiza','2005-05-22','8B','luiza@email.com'),
(default,'Jonas','2004-07-15','9A','jonas@email.com'),
(default,'Marcos','2006-03-05','6A','marcos@email.com');

-- CRIANDO TABELA PROFESSORES 

create table Professores (
id int not null auto_increment,

Nome varchar(50)not null,
Diciplina varchar(50)not null,
Salario decimal(5,2)not null,
primary key (id)
)default charset = utf8mb4;


-- INSERIR INFORMAÇÕES PROFESSORES 


insert into Professores values
(default,'Ana','Matematica','999.00'),
(default,'Luis','Português','999.00');







select *from Professores;-- Selecionando todas as informações da tabela pessoas
desc Alunos;