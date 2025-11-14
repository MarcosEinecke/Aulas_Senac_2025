create database Computador;
use Computador;



create table Usuarios(
id int not null auto_increment, 
nome varchar (30) not null,
email varchar (30) not null,
primary key (id)
)default charset = utf8mb4;




create table Computadores(
id int not null auto_increment, 
marca varchar (30) not null,
modelo varchar (30) not null,
processador varchar (30),
memoria_ram int,
usuario_id int,
foreign key (usuario_id) references Usuarios(id),
primary key (id)
)default charset = utf8mb4;




-----------------------------------------------------------------------//-----------------------------------------//--------------------------------------------------------------------------------------------


-- INSERINDO OS DADOS:

insert into Usuarios values
(default, 'Marcos ', 'marcos@gmail.com'),
(default, 'Pedro ', 'pedro@gmail.com'),
(default, 'Ryan ', 'Ryan@gmail.com'),
(default, 'Luis ', 'luis@gmail.com'),
(default, ' Felipe', 'Felipe@gmail.com'),
(default, 'João', 'joao@gmail.com');


insert into Computadores values 
(default, 'Dell ', 'Inpiron 5','Intel Core i3', 16 ,1),
(default, 'Acer ', 'Aspare 3','AMD Ryzen 5', 8 ,2),
(default, 'Positivo', 'Vision ','AMD Ryzen 7', 32 ,3),
(default, 'Acer ', 'Nitro 5','AMD Ryzen 5', 16,4),
(default, 'Acer', 'Nitro 3 ','AMD Ryzen 5', 16 ,5),
(default, 'Lenovo', 'Idealped','Intel Core i5', 16,6);


-----------------------------------------------------------------------//-----------------------------------------//--------------------------------------------------------------------------------------------


-- EXERCICIOS 


--  24. Listar o modelo e o processador de todos os computadores.

Select c.modelo 'Modelo do Notebook', c.processador 'Processadores ' from Computadores as c;


--  25. Listar o nome dos usuários e seus respectivos computadores.

Select u.nome, c.marca, c.modelo from Usuarios as u  inner join Computadores as c on c.usuario_id = u.id;


--  26. Listar os computadores com mais de 8GB de memória RAM.

Select c.marca, c.modelo from Computadores as c where memoria_ram > 8;

--  27. Listar os nomes dos usuários que possuem computadores da marca 'Dell'.

Select u.nome 'Nome', c.marca , c.modelo from Usuarios as u  inner join Computadores as c  on  c.usuario_id = u.id   where c.marca like  'Del%';


--  28. Contar o número de computadores por marca.

select c.marca'Marca dos Notebook',count(*) 'Modelos 'from Computadores as c group by c.marca;


--  29. Listar as marcas de computador que possuem menos de 3 computadores cadastrados.


select c.marca'Marca dos Notebook',count(*) 'Modelos 'from Computadores as c group by c.marca having count(*) < 3;


--   30. Atualizar o processador do computador com ID 2 para 'Intel Core i7'.

update Computadores set processador = 'Intel Core i7' where usuario_id = 2; 



--  31. Remover o computador com ID 6.


delete from Computadores where id = 6;






select * from Usuarios;
select  * from Computadores;






































