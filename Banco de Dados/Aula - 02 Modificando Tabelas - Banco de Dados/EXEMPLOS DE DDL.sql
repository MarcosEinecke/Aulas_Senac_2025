-- felipe / Pedros / Ryan / João / isaac / marcos / luis

-- DDL - ALTER TABLE

-- MODICADORES DE TABELAS
-- Add column: Adicionar novas colunas

-- Estrutura / Sintaxe
-- ALTER TABLE nome_da_tabela
-- ADD COLUMN nome_da_coluna tipo_de_dado;

-- DROP COLUMN: REMOVER COLUNAS
ALTER TABLE cliente
DROP COLUMN apelido;

-- FIRST (PRIMEIRO) OU AFTER(DEPOIS/APÓS)
ALTER TABLE cliente
ADD COLUMN apelido varchar(10) AFTER nome;

-- MODIFY COLUMN 
ALTER TABLE cliente
MODIFY COLUMN apelido varchar(100);


-- CHANGE COLUMN: Renomear e alterar tipos e restrições
ALTER TABLE cliente
CHANGE COLUMN email `@` varchar(200);

-- RENAME TO: Renomear tabelas
ALTER TABLE cliente
RENAME TO clientes;

desc cursos;
select * from cursos;

-- //////////////////////////////

CREATE TABLE IF NOT EXISTS cursos(
nome varchar(30) not null unique,
descricao text,
carga int unsigned,
total_de_aulas int unsigned,
ano year default '2025'
) default charset = utf8;

-- UNIQUE: 
-- 1. Permite valores nulos / PK, não permite
-- 2. Garante que o valor da coluna será unica / PK também
-- 3. Posso aplicar em várias colunas / PK não pode, só em uma

-- UNSIGNED: Define apenas números positivos para tipos Int

-- ADICIONANDO PRIMARY KEY
ALTER TABLE cursos
ADD COLUMN idcursos int first;

ALTER TABLE cursos
ADD primary key(idcursos);
