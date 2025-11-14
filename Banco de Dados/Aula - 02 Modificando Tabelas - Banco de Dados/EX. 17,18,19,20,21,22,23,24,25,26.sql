-- Exercícios de MySQL- Criação, Modificação e
--  Inserção de Dados (com foco em ALTER TABLE)

------------------------------------------------------------------------------------------------

-- 17.Crie um banco de dados chamado "rh".

create database rh
default character set utf8mb4
default collate utf8mb4_general_ci;

------------------------------------------------------------------------------------------------

--  18. Crie uma tabela "funcionarios" com as colunas: nome, cargo e salario.


create table funcionarios (

nome varchar(50),
cargo varchar(50),
salario decimal(6,2)
);

-----------------------------------------------------------------------------------------------------------

--  19. Adicione uma coluna "id" como chave primária com auto incremento no início da tabela "funcionarios".

ALTER TABLE funcionarios
ADD COLUMN idfuncionarios int first;

ALTER TABLE funcionarios
ADD primary key(idfuncionarios);




