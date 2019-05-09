use jogos;

select * from atletas; 

create table país (
idPais int primary key auto_increment,
pais varchar (30),
capital varchar (30)) auto_increment=20;

select * from país; 

insert into país (pais, capital) values
('alemanha', 'berlin'),
('reinoUnido', 'londres'),
('australia', 'sidney'),
('irlanda', 'dublin'),
('urugaui', 'montevideo');

select * from país; 

alter table atletas add column fkPais int;

alter table atletas add foreign key (fkPais) references país (idPais); 

desc atletas; 

select * from país; 

select * from atletas;

update atletas set fkPais=20 where idAtleta=1500;

update atletas set fkPais=22 where idAtleta=1502;

update atletas set fkPais=24 where idAtleta=1501;

update atletas set fkPais=21 where idAtleta=2500;

update atletas set fkPais=23 where idAtleta=2501;

update atletas set fkPais=22 where idAtleta=3500;

update atletas set fkPais=23 where idAtleta=3501;

update atletas set fkPais=24 where idAtleta=3502;

select * from atletas; 

select * from país; 

select a.*, p.pais, capital from atletas as a, país as p where fkPais = idPais;

select a.*, p.pais, capital from atletas as a, país as p where fkPais= idPais and pais ='australia'; 


