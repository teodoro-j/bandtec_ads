
use melhoresmusicas; 

create table album (
idAlbum int primary key auto_increment,
nome varchar (40),
gravadora varchar (30)) auto_increment=30;

select * from musicas;  

insert into album (nome, gravadora) values
('KO', 'SNZ'),
('monster', 'sony'),
('american' , 'sony'),
('onYou', 'VPS'); 

select * from album; 

alter table musicas add column fkAlbum int;

alter table musicas add foreign key (fkAlbum) references album (idAlbum);

select * from musicas; 

update musicas set fkAlbum =30 where idMusica in (500,501); 

update musicas set fkAlbum=31 where idMusica = 502; 

update musicas set fkAlbum=32 where idMusica in (503,504); 

update musicas set fkAlbum=33 where idMusica=505; 

select m.*, a.nome, gravadora from musicas as m, album as a where fkAlbum=idAlbum; 

select m.*, a.nome, gravadora from musicas as m, album as a where fkAlbum=idAlbum and nome='KO';

select m.*, a.nome, gravadora from musicas as m, album as a where fkAlbum=idAlbum and gravadora='sony';





