create database melhoresMusicas;

use melhoresMusicas;

create table musicas (
idMusica int primary key auto_increment,
titulo varchar (40),
artista varchar (40),
genero varchar (40)) auto_increment=500;

insert into musicas (titulo, artista, genero) values
('problemaSeu', 'pabloVittar', 'pop'),
('seuCrime', 'pabloVittar', 'pop'),
('badRomance' , 'ladyGaga', 'pop'),
('blueJeans' , 'lanaDelRey', 'indie'),
('videoGames' , 'lanaDelRay', 'indie'),
('lostOnYou' , 'lp' , 'folk'),
('secrets' , 'oneRepublic' , 'rock');


select * from musicas; 

select titulo, artista from musicas; 

select * from musicas where genero='indie'; 

select * from musicas where artista='pabloVittar'; 

select * from musicas order by titulo; 

select * from musicas order by artista desc; 

select * from musicas where titulo like 's%'; 

select * from musicas where titulo like '%u';

select * from musicas where titulo like '_i%';

select * from musicas where titulo like '%c_';

update musicas set genero='popALtern' where idMusica=502; 

select * from musicas; 

alter table musicas modify titulo varchar (50); 

desc musicas; 

delete from musicas where idMusica=506; 

select * from musicas;

drop table musicas; 