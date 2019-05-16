create database projeto_inovacao;

use projeto_inovacao; 

create table grupo (
idGrupo int primary key auto_increment,
nomeGrupo varchar(45),
descricao varchar (45));

insert into grupo (nomeGrupo, descricao) values 
('artOfThings','museu'),
('pharmaSensors', 'farmacia');

create table aluno (
ra int primary key,
aluno varchar (45),
email varchar(45),
fkGrupo int,
foreign key (fkGrupo) references grupo (idGrupo));

insert into aluno values 
(1096, 'joao', 'joaoteodoro@bandtec.com.br',2),
(1072, 'bianca', 'bianca.barranco@bantec.com.br', 1),
(1065, 'vitoria', 'vitoria.cristina@bandtec.com.br', 2),
(1087, 'fabiola', 'fabiola.yugar@bandtec.com.br',1),
(1038, 'giulia', 'guilia.maia@bandtec.com.br', 2),
(1021, 'emanuelle', 'emanele.manu@bandtec.com.br', 1);

create table professor (
idProf int primary key auto_increment,
nomeProf varchar (45),
disciplina varchar(45))auto_increment=10000;

insert into professor (nomeProf, disciplina) values
('vera', 'coordenadora'),
('celia', 'bd'),
('yoshi', 'algoritmos'),
('maise', 'arqComp'),
('thiago', 'socio');

create table grupoProfessor (
fkGrupo int,
foreign key (fkGrupo) references grupo (idGrupo),
fkProf int,
foreign key (fkProf) references professor (idProf),
primary key (fkGrupo, fkProf),
dia date,
hora time,
nota int,
prof_1 int,
foreign key (prof_1) references professor (idProf),
prof_2 int,
foreign key (prof_2) references professor (idProf));


insert into grupoProfessor values 
(1,10000,'2019-06-03', '18:00', 9, 10001, 10003),
(2, 10000, '2019-06-03', '19:00',9, 10002, 10004);

select * from grupo;

select * from professor;

select * from grupo, aluno where fkGrupo=idGrupo;
select g.*, a.* from grupo as g, aluno as a where fkGrupo=idGrupo;
select * from grupo join aluno on fkGrupo=idGrupo;

select * from grupo, aluno where fkGrupo=idGrupo and idGrupo=1;
select g.*, a.* from grupo as g, aluno as a where fkGrupo=idGrupo and idGrupo=1;
select * from grupo join aluno on fkGrupo=idGrupo and idGrupo=1;

select avg(nota) from grupoProfessor;

select min(nota) 'nota minima', max(nota) 'nota maxima' from grupoProfessor;

select sum(nota) from grupoProfessor;

select * from professor, grupo, grupoProfessor where fkProf=idProf and fkGrupo=idGrupo;
select p.*, g.*, gP.* from professor as p, grupo as g, grupoProfessor as gP where fkProf=idProf and fkGrupo=idGrupo;
select p.*, g.*, gP.dia, hora, nota, prof_1, prof_2 from professor as p, grupo as g, grupoProfessor as gP 
where fkProf=idProf and fkGrupo=idGrupo;
select * from professor join grupo join grupoProfessor on fkProf=idProf and fkGrupo=idGrupo;

select * from professor, grupo, grupoProfessor where fkProf=idProf and fkGrupo=idGrupo and idGrupo=1;
select p.*, g.*, gP.* from professor as p, grupo as g, grupoProfessor as gP where fkProf=idProf and fkGrupo=idGrupo and idGrupo=1;
select p.*, g.*, gP.dia, hora, prof_1, prof_2 from professor as p, grupo as g, grupoProfessor as gP where fkProf=idProf 
and fkGrupo=idGrupo and idGrupo=1;
select * from professor join grupo join grupoProfessor on fkProf=idProf and fkGrupo=idGrupo and idGrupo=1;

select * from grupo join grupoProfessor on fkGrupo=idGrupo and fkProf=10000;
 
 select distinct a.aluno from aluno as a join grupoProfessor join professor on fkProf=idProf
 join grupo on  a.fkGrupo=idGrupo where idProf=10000;
 
-- SELECTE 13 E 14 DUVIDAS1!!!

select count(distinct nota) as 'qtd de notas distintas' from grupoProfessor;




