create database Carro;
use Carro;

create table Proprietarios(
id int not null auto_increment, 
nome varchar (30) not null,
idade int,
primary key (id)
)default charset = utf8mb4;


create table Carros(
id int not null auto_increment, 
marca varchar (30) not null,
modelo varchar (30) not null,
ano year,
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
(default, "Vitoria",24);    -- 8



insert	into Carros values
(default,'Toyota','Corolla',2015,6),
(default,'Honda','Civic',2009,5),
(default,'Reanout','Sandero',2012,3),
(default,'Volkswagen','Gol',2008,1),
(default,'Chevolet','Agile',2013,2),
(default,'Jeep','Renegade',2020,7),
(default,'Honda','Biz',2023,8),
(default,'Ford','Focus',2023,4);


-----------------------------------------------------------------------//-----------------------------------------//--------------------------------------------------------------------------------------------

-- EXERCICIOS :


Select * from Proprietarios;
Select * from Carros;
Desc Proprietarios;
Desc Carros;




--  16. Listar a marca e o modelo de todos os carros.

select c.id ,c.marca , c.modelo from carros as c ;  




--  17. Listar o nome dos proprietários e seus respectivos carros.

select  p.nome , c.marca, c.modelo from proprietarios as p inner join carros as c on  c.proprietarios_id = p.id;


--  18. Listar os carros fabricados antes de 2010.

select c.marca, c.modelo , c.ano from carros as c  where c.ano < 2010;


--  19. Listar os nomes dos proprietários que possuem carros da marca 'Toyota'.

select p.nome , c.marca, c.modelo , c.ano from carros as c inner join proprietarios as p on c.proprietarios_id = p.id where c.marca = 'Toyota';


--  20. Contar o número de carros por marca.

Select carros.marca,count(*) 'Total_carros_por_marca' from carros group by marca ;



--  21. Listar as marcas de carro que possuem mais de 5 carros cadastrados.

insert	into Carros values
(default,'Honda','HRV',2020,1),
(default,'Honda','CRV',2025,3),
(default,'Honda','Fit',2017,5),
(default,'Honda','City',2008,4);

insert	into Carros values
(default,'Honda','ZRV',2025,4);

Select c.marca 'Marca dos Carros',count(*) 'Total de carros por marca' from Carros as c group by c.marca having count(*) > 5; 


--  22. Atualizar o ano do carro com ID 3 para 2015.


update carros set ano = 2015 where id = 3;


--  23. Remover o carro com ID 7.

delete from carros where id = 7;



Select * from Proprietarios;
Select * from Carros;

