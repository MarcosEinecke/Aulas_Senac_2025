create database java_crud_db;
use java_crud_db;

create table usuarios(
 id int(11) auto_increment primary key not null,
 nome varchar(100) not null,
 sobrenome varchar(100) not null,
 email varchar(100) not null,
 cidade varchar(100) not null
 )default charset = utf8mb4;
 
select	* from usuarios;

insert into usuarios (nome, sobrenome,email,cidade) values 
('Ryan','Gabriel da Rosa','gabrielryan@darosa','Tramandaí'),
('João','Pedro A Souza','xmen_joao@.com','Imbé'),
('Luis','Henrique Maica de Souza', 'maica.luis@henrique.com','Capão da Canoa');







