create database melhoresFilmes;

use melhoresFilmes;

create table filmesFavoritos (
id int primary key auto_increment,
nome varchar (30),
genero varchar (30)) auto_increment=1000;

select * from filmesFavoritos;

insert into filmesFavoritos (nome, genero) values
('NasceUmaEstrela', 'DramaRomance'),
('aOrigem', 'ficcao'),
('harryPotter', 'ficcaoAventura'),
('senhorDosAneis', 'ficcao'),
('extraordinario', 'drama'),
('adeline', 'romance'),
('drStrange', 'ficcaoAventura'),
('thePurge', 'ficcaoSuspense');


select * from filmesFavoritos;

select nome from filmesFavoritos;

select nome, genero from filmesFavoritos order by nome;

alter table filmesFavoritos add column ano int;

select * from filmesFavoritos; 

update filmesFavoritos set ano= 2018 where id in (1000, 1004, 1006); 

select * from filmesFavoritos;

update filmesFavoritos set ano = 2001 where id in ( 1002, 1003);

update filmesFavoritos set ano = 2016 where id in (1005, 1006, 1007); 

select * from filmesFavoritos;

update filmesFavoritos set ano = 2006 where id=1001;  

select * from filmesFavoritos order by ano desc; 

alter table filmesFavoritos modify gemero varchar (15); 

alter table filmesFavoritos drop column genero; 

select * from filmesFavoritos;

desc filmesFavoritos;

alter table filmesFavoritos add column genero varchar (15); 

select * from filmesFavoritos; 

desc filmesFavoritos;

alter table filmesFavoritos modify nome varchar (15); 

desc filmesFavoritos;

select * from filmesFavoritos; 

select nome from filmesFavoritos where nome like '%p%';

select * from filmesFavoritos where nome like 'h%';

select * from filmesFavoritos where ano like '20%';

select * from filmesFavoritos where ano like '%1_'; 

 alter table filmesFavoritos add column topPreferidos int;   

select * from filmesFavoritos; 

select * from filmesFavoritos order by nome;