create database filmesProva;

use filmesProva;

create table diretor (
idDiretor int primary key auto_increment,
nomeDiretor varchar (45),
pais varchar (45),
nascimento date );

insert into diretor (nomeDiretor,pais,nascimento) values 
('fabiola', 'bolivia', '1989-09-23'),
('guilherme', 'brasil', '2001-07-20'),
('giulia', 'brasil', '2001-03-01');

select * from diretor;

create table filme (
idFilme int primary key auto_increment,
nomeFilme varchar(45),
generoFilme varchar (45),
fkDiretor int,
foreign key (fkDiretor) references diretor (idDiretor)) auto_increment=1000;

insert into filme (nomeFilme, generoFilme,fkDiretor) values 
('viagens pelo mundo', 'documentario', 1),
('noitada', 'comedia', 2),
('embriagues', 'comedia', 3),
('baliando', 'romance', 2);

select * from filme;

create table ator (
idAtor int primary key auto_increment,
nomeAtor varchar (45)) auto_increment=100;

insert into ator (nomeAtor) values
('joao'),
('bianca'),
('fernanda'),
('vitoria');

select * from ator;

create table filmeAtor (
fkFilme int,
foreign key (fkfilme) references filme (idFilme),
fkAtor int,
foreign key (fkAtor) references ator (idAtor),
personagem varchar (45),
salario decimal (8.2),
primary key (fkFilme, fkAtor)); 

insert into filmeAtor values
(1000, 102, 'estudante boliviana', 35000.00),
(1001, 101, 'filha da protagonista', 45000.00),
(1003,  103, 'dancarina', 60000.00),
(1002, 100, 'motorista da ambulancia', 10000.00),
(1002, 103, 'protagonista alcoolizada', 40000.00);

select * from filmeAtor;

select * from diretor join filme on fkDiretor=idDiretor;

select avg(salario) as 'media', sum(salario) as 'soma' from filmeAtor;

select min(salario) as 'menor valor pago', max(salario) as 'maior valor pago' from filmeAtor;

select * from filme join filmeAtor on fkFilme=idFilme join ator on fkAtor=idAtor;

select * from filme join filmeAtor on fkFilme=idFilme join ator on fkAtor=idAtor where idFilme=1002;

select * from filme join filmeAtor on fkFilme=idFilme join ator on fkAtor=idAtor join diretor on fkDiretor=idDiretor;

select fkFilme, avg(salario) as 'media', sum(salario) as 'soma' from filmeAtor group by fkFilme;

select fkAtor, avg(salario) as 'media', sum(salario) as 'soma' from filmeAtor group by fkAtor;

select fkFilme, min(salario) as 'menor valor', max(salario) as 'maior valor' from filmeAtor group by fkFilme;

select fkAtor, min(salario) as 'menor valor', max(salario) as 'maior valor' from filmeAtor group by fkAtor;




