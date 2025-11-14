-- Criando o banco de dados principal
CREATE DATABASE entretenimento;
USE entretenimento;

-- ===========================
-- 🧩 DESENHOS ANIMADOS
-- ===========================
CREATE TABLE desenhos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    criador VARCHAR(100),
    ano_lancamento INT
);

CREATE TABLE personagens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT,
    desenho_id INT,
    FOREIGN KEY (desenho_id) REFERENCES desenhos(id)
);

-- ===========================
-- 🎵 MÚSICA
-- ===========================
CREATE TABLE artistas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    genero VARCHAR(50)
);

CREATE TABLE albuns (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    ano_lancamento INT,
    artista_id INT,
    FOREIGN KEY (artista_id) REFERENCES artistas(id)
);

-- ===========================
-- 📚 LIVROS
-- ===========================
CREATE TABLE autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nacionalidade VARCHAR(50)
);

CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    genero VARCHAR(50),
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES autores(id)
);



-- DESENHOS
INSERT INTO desenhos (nome, criador, ano_lancamento)
VALUES ('Rick and Morty', 'Dan Harmon', 2013),
       ('Os Simpsons', 'Matt Groening', 1989),
       ('Adventure Time', 'Pendleton Ward', 2010);

INSERT INTO personagens (nome, idade, desenho_id)
VALUES ('Rick Sanchez', 70, 1),
       ('Morty Smith', 14, 1),
       ('Homer Simpson', 39, 2),
       ('Bart Simpson', 10, 2),
       ('Finn', 17, 3),
       ('Jake', 32, 3),
       ('Personagem Solto', 25, NULL);

-- MÚSICA
INSERT INTO artistas (nome, genero)
VALUES ('Daft Punk', 'Eletrônico'),
       ('Radiohead', 'Rock'),
       ('Chico Buarque', 'MPB');

INSERT INTO albuns (titulo, ano_lancamento, artista_id)
VALUES ('Discovery', 2001, 1),
       ('OK Computer', 1997, 2),
       ('In Rainbows', 2007, 2),
       ('Construção', 1971, 3),
       ('Álbum Perdido', 1995, NULL);

-- LIVROS
INSERT INTO autores (nome, nacionalidade)
VALUES ('Machado de Assis', 'Brasileiro'),
       ('George Orwell', 'Britânico'),
       ('Clarice Lispector', 'Brasileira'),
       ('Autor Desconhecido', NULL);

INSERT INTO livros (titulo, genero, autor_id)
VALUES ('Dom Casmurro', 'Romance', 1),
       ('1984', 'Distopia', 2),
       ('A Hora da Estrela', 'Ficção', 3),
       ('Livro Sem Autor', 'Fantasia', NULL);
       
       
-------------------------------------------------------------------------------------------------------- 
                           
-- 1. Listar o nome dos personagens e o nome do desenho a que pertencem. 
select * from desenhos;
select * from personagens;       
       
select p.nome, d.nome from personagens as p  inner join	desenhos as d on p.desenho_id = d.id;

---------------------------------------------------------------------------------------------------------------------

-- 2. Listar o nome dos álbuns e o nome do artista correspondente. 
select * from albuns;
select * from artistas;
       
select a.titulo, ar.nome from  albuns as a inner join artistas as ar on  a.artista_id = ar.id;

-----------------------------------------------------------------------------------------------------------------------------
-- 3. Listar o título dos livros e a nacionalidade do autor. 
select * from autores;
select * from livros;

select a.nome, l.titulo from  autores as a inner join livros as l on l.autor_id = a.id;


------------------------------------------------------------------------------------------------------------------------------
-- 4. Listar todos os personagens, mesmo que não estejam associados a um desenho. 
select * from desenhos;
select * from personagens;

select d.nome, p.nome from  personagens as p left join desenhos as d on  p.desenho_id = d.id;

----------------------------------------------------------------------------------------------------------------------------------
-- 5. Listar todos os desenhos, mesmo que não tenham personagens associados. 
select * from desenhos;
select * from personagens;

select d.nome, p.nome from  personagens as p left join desenhos as d on  p.desenho_id = d.id;

-------------------------------------------------------------------------------------------------------------------------------------
-- 6. Listar todos os álbuns, mesmo que não estejam associados a um artista. 
select * from albuns;
select * from livros;

select a.titulo, ar.nome from  albuns as a left join artistas as ar on  a.artista_id = ar.id;

-------------------------------------------------------------------------------------------------------------------------------------
-- 7. Listar todos os artistas, mesmo que não tenham álbuns lançados. 

select * from albuns;
select * from artistas;

select a.titulo,ar.nome from  albuns as a left join artistas as ar on  a.artista_id = ar.id;


---------------------------------------------------------------------------------------------------------------------------------------
-- 8. Listar todos os livros, mesmo que não estejam associados a um autor.             
select * from autores;
select * from livros;

select l.titulo,a.nome from  livros as l left join autores as a on  l.autor_id = a.id;

-----------------------------------------------------------------------------------------------------------------------------------------
-- 9. Listar todos os autores, mesmo que não tenham livros publicados. 
select * from autores;
select * from livros;

select a.nome,l.titulo from  autores as a left join livros as l on  l.autor_id = a.id;

-----------------------------------------------------------------------------------------------------------------------------------------
-- 10. Listar os nomes dos personagens e dos desenhos, mas apenas para os personagens que têm mais de 18 anos.
select * from desenhos;
select * from personagens;

select p.nome,d.nome,p.idade from  personagens as p inner join desenhos as d on p.desenho_id = d.id   where p.idade >= 18;

--------------------------------------------------------------------------------------------------------------------------------------------
-- 11. Listar os títulos dos álbuns lançados antes de 2000 e o nome do artista. 
select * from albuns;
select * from artistas;

select a.titulo,a.ano_lancamento,ar.nome from  albuns as a inner join artistas as ar on a.artista_id = ar.id  where a.ano_lancamento >= 2000;

-------------------------------------------------------------------------------------------------------------------------------------------------
-- 12. Listar os títulos dos livros de autores brasileiros. 
select * from autores;
select * from livros;

select l.titulo,a.nome,a.nacionalidade from  livros as l inner join autores as a on l.autor_id = a.id where a.nacionalidade in('Brasileira' ,'Brasileiro');

-------------------------------------------------------------------------------------------------------------------------------------------
-- 13. Listar os nomes dos personagens e dos desenhos, ordenados pelo nome do desenho em ordem alfabética. 
select * from desenhos;
select * from personagens;

select p.nome `Nome_Dos_Personagens` , d.nome `Nome_Dos_Desenhos` from personagens as p inner	join  desenhos as d on p.desenho_id = d.id order by d.nome asc;

-----------------------------------------------------------------------------------------------------------------------------------------------------
-- 14. Listar os títulos dos álbuns e o nome do artista, ordenados pelo ano de lançamento do álbum em ordem decrescente. 
select * from albuns;
select * from artistas;

select a.titulo, ar.nome, a.ano_lancamento from albuns as a inner join artistas as ar on a.artista_id = ar.id order by ano_lancamento desc;

---------------------------------------------------------------------------------------------------------------------------------------------------------
-- 15. Listar os títulos dos livros e o nome do autor, ordenados pelo título do livro em ordem alfabética.
select * from autores;
select * from livros;

select l.titulo, a.nome from autores as a inner join livros as l on l.autor_id = a.id order by titulo asc ;

------------------------------------------------------------------------------------------------------------------------------------------------------------
-- 16. Contar quantos personagens pertencem a cada desenho.
select * from desenhos;
select * from personagens;


select  

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
