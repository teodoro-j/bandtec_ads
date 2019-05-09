drop database olimpiadas; 

create database olimpiadas; 

use olimpiadas; 

create table jogos (
ra int primary key auto_increment,
nome varchar (50),
modalidade varchar (50),
medalhas int) auto_increment=1000;

insert into jogos values
(null, 'joao teodoro' , 'esgrima' , 8),
(null, 'gustavo' , 'natacao' , 9);

select *from jogos;

select nome from jogos;

select * from jogos where modalidade like 'esgrima';

select * from jogos order by modalidade desc; 

insert into jogos (nome,modalidade) values
('isabel' , 'natacao'),
('melissa' , 'esgrima'); 

select * from jogos;

insert into jogos (nome, medalhas) values
('giulia' , 11);

select * from jogos; 

update jogos set modalidade='ginastica' where ra=1004; 

select * from jogos;

update jogos set medalhas=10 where ra in (1002, 1003);

select * from jogos; 

alter table jogos add column ano int;

select * from jogos; 

update jogos set ano=2016 where ra in (1000,1001,1002,1003,1004);

select * from jogos;

alter table jogos modify nome varchar (25), modify modalidade varchar (25);

select * from jogos;










 
 













