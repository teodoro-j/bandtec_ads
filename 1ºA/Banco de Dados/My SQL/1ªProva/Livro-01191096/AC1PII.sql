create database livro; 

use livro;

create table Livro (
idLivro int primary key auto_increment,
titulo varchar (40),
autor varchar (35),
genero varchar (30)) auto_increment=500;

insert into Livro (titulo,autor, genero) values
('crepusculo' , 'sMeyer' , 'romance'),
('culpaDasEstrela' , 'jGeen' , 'romance'),
('cidadeDePapel' , 'jGreen' , 'romance'),
('harryPotter' , 'jkRowling' , 'aventura'),
('senhorDosAneis' , 'tolkien' , 'aventura'),
('cronicasDeNarnia' , 'cwLweis' , 'aventura'),
('capitaesDaAreia' , 'jorgeAmado' , 'drama'); 

select * from Livro; 

select titulo, genero from Livro; 

select * from Livro where genero='romance'; 

update Livro set autor='jGreen' where idLivro=501;

select * from Livro  where autor ='jGreen'; 

select * from Livro order by  titulo; 

select * from Livro order by autor desc; 

select * from Livro where titulo like 'c%';

select * from Livro where autor like '%s'; 

select * from Livro where genero like '_v%';

select * from Livro where titulo like '%e_'; 

update Livro set genero='drama' where idLivro=501; 

select * from Livro; 

delete from Livro where idLivro=506; 

select * from Livro;

drop table Livro; 

















