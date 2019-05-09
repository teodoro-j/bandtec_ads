create database musicas;

use musicas;

create table favoritas (
cod int primary key auto_increment,
nome varchar (15),
artista varchar (30),
ano int
); 

select * from favoritas; 

drop table favoritas;

create table favoritas (
cod int primary key auto_increment,
nome varchar (15),
artista varchar (30),
ano int
) auto_increment=1000;

insert into favoritas (nome,artista) values 
('secrets', 'weeknd'),
('angela' , 'thelumineers'),
('better' , 'onerepublic'); 

select nome from favoritas;

select * from favoritas;

insert into favoritas (artista) values
('pablo'),
('pablo'),
('pablo');

select * from favoritas; 

update favoritas set nome='ko' where cod=1003;

update favoritas set nome='problemaseu' where cod=1004;

select * from favoritas;

update favoritas set nome='seucrime' where cod=1005;

select * from favoritas;

update favoritas set ano=2017 where cod=1003;

update favoritas set ano=2018 where cod in (1004,1005); 

select * from favoritas;

update favoritas set ano=2018 where cod in (1000,1002); 

update favoritas set ano=2016 where cod=1001; 

insert into favoritas (nome, artista, ano) values
('veneno' , 'anitta', 2019);

select * from favoritas order by artista; 

delete from favoritas where cod=1005; 

 select *from favoritas; 
 insert into favoritas values
 (1005, 'seucrime' , 'pablo', 2018);
 
 select * from favoritas; 
 
 delete from favoritas where cod=1006; 
 
 select * from favoritas; 
 
 alter table favoritas modify nome varchar(25), modify artista varchar (25); 
 
 select * from favoritas; 
 
 select nome, artista from favoritas; 
 
 select nome, artista from favoritas order by nome desc;
 
 select nome, artista from favoritas order by nome,  artista  desc; 
 
 select nome, artista from favoritas order by nome desc, artista desc;
 
 select * from favoritas where artista='pablo'; 
 
 select * from favoritas; 
 
 select * from favoritas where nome like '%e%'; 
 
 select * from favoritas where artista like '%o';
 
 select artista from favoritas;
 
 select * from favoritas where ano like '2018'; 
 
  select * from favoritas where artista='pablo';
  
  
  
 
 
 
 


