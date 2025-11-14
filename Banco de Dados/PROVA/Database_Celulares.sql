create database Celular;
use	Celular;



create table Proprietarios(
id int not null auto_increment, 
nome varchar (30) not null,
idade int,
primary key (id)
)default charset = utf8mb4;




create table Celulares(
id int not null auto_increment, 
marca varchar (30) not null,
modelo varchar (30) not null,
sistema_operacional varchar (30),
proprietarios_id int,
foreign key (proprietarios_id) references Proprietarios(id),
primary key (id)
)default charset = utf8mb4;


-----------------------------------------------------------------------//-----------------------------------------//--------------------------------------------------------------------------------------------

-- INSERINDO DADOS:

insert into Proprietarios values
(default, "Marcos",25),  -- 1
(default, "João",22),    -- 2
(default, "Luis",23),     -- 3
(default, "Everton",35),  -- 4
(default, "Vini",40),     --  5
(default, "Leonardo",32), -- 6
(default, "Felipe",21),    -- 7
(default, "Vitoria",24),    -- 8
(default, "Marcelo",25); -- 9

insert into Celulares values
(default, "Samsung",'S25 Ultra','Android',1),  -- 1
(default, "Samsung",'S25 ','Android',2),  -- 2
(default, "Samsung",'S25 Plus','Android',3),  -- 3
(default, "Xiaomi",'Poco F3','Android',4),  -- 4
(default, "iPhone",'17','IOS',5),  -- 5
(default, "iPhone",'15','IOS',6),  -- 6
(default, "iPhone",'14','IOS',7),  -- 7
(default, "iPhone",'13','IOS',8),  -- 8
(default, "iPhone",'17','IOS',9);  -- 9




-----------------------------------------------------------------------//-----------------------------------------//--------------------------------------------------------------------------------------------

-- EXERCICIOS :



--  32. Listar a marca e o modelo de todos os celulares.

Select c.marca 'Marca  dos Celulares', c.modelo 'Modelo dos Celulares' from Celulares as c;


--  33. Listar o nome dos proprietários e seus respectivos celulares.


Select p.nome, c.marca, c.modelo from Proprietarios as p  inner join Celulares as c on c.proprietarios_id = p.id;


--  34. Listar os celulares com sistema operacional 'Android'.


Select c.marca, c.modelo from Celulares as c where sistema_operacional = 'Android';

-- 35. Listar os nomes dos proprietários que possuem celulares da marca 'Samsung’

Select p.nome, c.marca, c.modelo from Celulares as c inner join Proprietarios as p on c.proprietarios_id = p.id where marca like 'Samsun%';


--  36. Contar o número de celulares por sistema operacional.

select c.marca'Marca dos Celulares',count(*) 'Sistema Operacional 'from Celulares as c group by c.marca;

--  37. Listar os sistemas operacionais que possuem mais de 10 celulares cadastrados.

select c.sistema_operacional 'Sistema Operacional' ,count(*) 'Quantidade de Celulares'from Celulares as c group by c.sistema_operacional having count(*) > 10; -- Questão pede +10

select c.sistema_operacional 'Sistema Operacional' ,count(*) 'Quantidade de Celulares'from Celulares as c group by c.sistema_operacional having count(*) <  10; --  Coloquei com  -10 para tu testar 


--  38. Atualizar o sistema operacional do celular com ID 4 para 'iOS'.


update Celulares set sistema_operacional = 'IOS' where proprietarios_id = 2; 


--  39. Remover o celular com ID 9.


delete from Celulares where id = 16; -- Vou deletar o id 16 , pq minha tabela está bugado o primeiro é o ID 10.




Select * from Proprietarios;
Select * from Celulares;







