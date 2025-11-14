-- MANIPULAÇÃO DE LINHAS: UPDATE, DELETE E TRUNCATE 


create database megabazar;


create table antiquario (
id int not null auto_increment primary key,
categoria varchar(30),
tipo varchar(30),
quantidade int,
ano year

)default charset = utf8mb4;


insert into antiquario  values
(default, 'Múzica','Disco de Viniu',40,1960),
(default,'Espelho','Vrido',20,1980),
(default,'Vingo James','Fita k7',10,1990),
(default,'Xícara','Argila',40,1985),
(default,'Bebidja','Vodica',10,1991);


select*from antiquario;


update antiquario 
set categoria = 'Música'
where id = '6';


update antiquario 
set categoria = 'Espelho', quantidade = 40, ano = 1999 , tipo = 'Vidro'
where id = 7;

-- ///////////////////////////////////////////////////////////////////////////////////////

delete from antiquario   -- DELETE SERVE PARA APAGAR A LINHA INTEIRA 
where ano > 1990
limit 1;


truncate table antiquario ;




