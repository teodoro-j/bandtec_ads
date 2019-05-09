create database musicas1;

use musicas1; 

create table musicasFavoritas (
id int primary key auto_increment, 
nome varchar (40),
artista varchar (40),
genero varchar (40)) auto_increment=300; 

insert into musicasFavoritas (nome,artista, genero) values 
('thankUNext' , ' arianaGrande' , 'pop'),
( 'NASA' , 'arianaGrande' , 'pop'),
( 'secrets', 'oneRepublic' , 'rock'),
( 'better' , 'oneRepublic' , 'rock' ),
( 'clock' , 'coldPlay' , 'rock'),
( 'burnToDie' , 'lanaDelRey', 'indie' ),
( 'auqrela' , 'toquinho' , 'mpb');

select * from musicasFavoritas;

select nome, artista from musicasFavoritas;

select * from musicasFavoritas where genero='rock'; 

select * from musicasFavoritas where artista='oneRepublic';

select * from musicasFavoritas order by  nome; 

select * from musicasFavoritas order by artista desc; 

select * from musicasFavoritas where nome like 'b%'; 

select * from musicasFavoritas where nome like'%e';

select * from musicasFavoritas where nome like '_e%'; 

select * from musicasFavoritas where nome like '%t_'; 

update musicasFavoritas set genero='rock/pop' where id in (303, 302, 304); 

select* from musicasFavoritas; 

alter table musicasFavoritas modify column genero varchar (50); 

desc musicasFavoritas; 

delete from musicasFavoritas where id = 304; 

select * from musicasFavoritas; 

drop table musicasFavoritas; 











