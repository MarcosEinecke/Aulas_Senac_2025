-- Exercícios de MySQL- Criação, Modificação e
-- Inserção de Dados (com foco em ALTER TABLE)



-- 1. CREIE UM BANCO DE DADOS "ECOMMERCE" COM SUPORTE A CARACTERES ACENTUADOS.

create database ecommerce
default character set utf8mb4 -- Comando para aceitar o carcter especial
default collate utf8mb4_general_ci; -- Comando para aceitar acentuação 

use ecommerce; 
-------------------------------------------------------------------------------------------------


-- 2 CRIE UMA TABELA "PRODUTOS" COM AS COLUNAS: ID (CHAVE PRIMÁRIA COM AUTO INCREMENTO),NOME E PREÇO.

create table produtos (
id int not null  auto_increment,-- Vai ser incrementado um valor automático

nome varchar(50),
preco decimal (4,2),

primary key (id)
)default charset = utf8mb4;


desc produtos;
select*from produtos;

---------------------------------------------------------------------------------------------------------

-- 3. ADICIONE UMA COLUNA "DESCRICAO" À TABELA "PRODUTOS" APÓS A COLUNA "NOME". 

ALTER TABLE produtos
ADD COLUMN descricao varchar(50) AFTER nome;

----------------------------------------------------------------------------------------------------------

-- 4. INSIRA UM PRODUTO NA TABELA "PRODUTOS" COM OS SEGUINTES DADOS: NOME = "CAMISETA",DESCRICAO = "CAMISETA DE ALGODÃO,TAMANHO M", PRECO = 29.90.

insert into produtos values
(default,'MARCOLA','Camiseta de algodão, tamanho M','29.90');


------------------------------------------------------------------------------------------------------------

-- 5. REMOVA A COLUNA "DESCRICAO" DA TABELA "PRODUTO".

ALTER TABLE produtos 
DROP COLUMN descricao;

---------------------------------------------------------------------------------------------------------------

-- 6. CRIE UMA TABELA "CLIENTE" COM AS COLUNAS: ID (CHAVE PRIMÁRIA COM AUTO INCREMENTO) E NOME.

create	table clientes (
id int not null  auto_increment,-- Vai ser incrementado um valor automático
nome varchar(50),

primary key (id)
)default charset = utf8mb4;


desc clientes;
select*from clientes;


--------------------------------------------------------------------------------------------------------------------

-- 7. ADICIONE AS COLUNAS "EMAIL" E  "TELEFONE" À TABELA "CLIENTES",SENDO "EMAIL" A PRIMEIRA COLUNA E "TELEFONE" APÓS O "NOME".alter


ALTER TABLE clientes
ADD COLUMN email varchar(50) first;

ALTER TABLE clientes
ADD COLUMN  telefone bigint after nome;

-----------------------------------------------------------------------------------------------------------------------------

-- 8. MODIFIQUE A COLUNA "TELEFONE" PARA ACEITAR APENAS VALORES POSITIVOS.
  

ALTER TABLE clientes 
modify COLUMN telefone bigint UNSIGNED;

-----------------------------------------------------------------------------------------------------------------------------------

-- 9. INSIRA DOIS CLIENTES NA TABELA "clientes".alter

insert into clientes values
("Shaulin_Matador_de_Porco@gmail.com",default,"Matador",51980508723),
("Flavinho_do_Pneu@gmail.com",default,"Flavinho",51994548385);


---------------------------------------------------------------------------------------------------------------------------------------

-- 10. RENOMEIE A TABELA "CLIENTES" PARA "USUARIOS".

ALTER TABLE clientes 
RENAME TO usuarios;


