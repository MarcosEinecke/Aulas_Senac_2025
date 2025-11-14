create database videolocadora;

create table usuarios (

id int not null auto_increment,
nome varchar(50) not null,
primary	key(id)
)default charset = utf8mb4;


create table filmes(
idfilme int not null  auto_increment,
nome varchar(100) not null,
ano year,
primary key(idfilme)
)default charset = utf8mb4;


insert into usuarios (nome) values
('Perigo'),('Ryan'),('João');

insert into filmes (nome,ano) values
('O Senhor dos Anéis',2001), ('Matrix',1999),('A Origem',2010);

select * from filmes;
select* from usuarios;


alter table usuarios 
add column filme_preferido int;

-- Defininfo filme 2 para o usuario 1
update usuarios set filme_preferido = '2' where id = '1';

alter table usuarios
add foreign key(filme_preferido) references filmes(idfilme);



-- INNER JOIN: Combinar as tabelas
select u.nome, f.nome, f.ano  from usuarios as u inner join filmes as f  on  f.idfilme = u.filme_preferido;  -- Combinando as tabelas usuarios e filmes, exibindo apenas os usuarios que possuem um filme preferido.



-- LEFT JOIN: Inclui todos os usuários
select u.nome, u.filme_preferido,f.nome,f.ano 
-- Incluindo todos os usuários no resultado, mesmo que não tenham
-- filme preferido. Para esses usuários , as colunas  relacionadas 
-- aos filmes terão o valor NULL
from usuarios as u left join filmes as f on f.idfilme = u.filme_preferido;



-- RIGHT JOIN: Incluir todos os filmes 
select u.nome, u.filme_preferido, f.nome,f.ano
from usuarios as u right join filmes as f
on f.idfilme = u.filme_preferido;


create table usuarios_assiste_filme(
id int not null auto_increment,
data date,
idusuario int,
idfilme int,
primary key (id),
foreign key(idusuario) references usuarios(id),
foreign key(idfilme) references  filmes(idfilme)
)default charset = utf8mb4;



insert into usuarios_assiste_filme values 
(default,'2004-03-01','1','2'),
(default,'2023-05-10','1','3'),
(default,'2022-12-25','2','3'),
(default,'2021-08-15','3','2'),
(default,'2020-06-30','3','1');

select *from usuarios_assiste_filme;


select u.nome,f.nome from
usuarios u join usuarios_assiste_filme uaf
on u.id = uaf.idusuario
join filmes	f 
on f.idfilme = uaf.idfilme;

-- REMOVER A CHAVE ESTRANGEIRA 

update usuarios set filme_preferido = null where id = 1;


