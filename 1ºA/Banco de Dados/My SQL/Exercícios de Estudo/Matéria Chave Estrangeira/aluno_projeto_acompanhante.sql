create database projetoBandtec;

use projetoBandtec;

create table projeto (
idProjeto int primary key auto_increment,
nome varchar (20),
drescicao varchar (50));

alter table projeto drop column drescicao ;

select * from projeto;

alter table projeto add column descricao varchar (60);

create table acompanhante (
rg int primary key,
nome varchar (50),
relacao varchar (20));

create table aluno (
ra int primary key,
nome varchar (30),
telefone varchar (15),
fkProjeto int,
fkRg int,
foreign key (fkProjeto) references projeto (idProjeto),
foreign key (fkRg) references acompanhante (rg));

alter table aluno add column representante int, add foreign key (representante) references aluno (ra);

select * from aluno;

desc aluno;

insert into projeto (nome, descricao) values
('farmacia', 'controle em farmacias'),
('museu', 'controle em museus'),
('foguete', 'conservar sementes');

select * from acompanhante;

insert into acompanhante values
(2021, 'lucas' , 'amigo'),
(2122, 'matheus', 'primo'),
(2123, 'thiago', 'namorado'),
(2124, 'maria', 'mae'),
(2125, 'talita', 'cunhada'),
(2126, 'vitoria', 'irma'),
(2127, 'cleonaldo', 'pai'),
(2128, 'frederico', 'irmao'),
(2129, 'leticia', 'prima'),
(2130, 'madalena', 'tia');

select * from acompanhante;

select * from aluno; 

insert into aluno (ra, nome, telefone, fkProjeto, fkRg) values 
(096, 'joao' , 1234, 1, 2124),
(077, 'guilherme', 2341, 2, 2021),
(052, 'fabiola', 2345, 2, 2122),
(042, 'giulia', 2371, 2,  2123),
(066, 'bianca', 2354, 1, 2125),
(087, 'ivone', 2635, 3, 2126),
(021, 'giovanna', 9198, 3, 2127),
(123, 'gustavo', 6273, 1, 2128),
(003, 'mariana', 4546, 3, 2129),
(033, 'luis', 3787, 2, 2130);

select * from aluno;

update aluno set representante=42 where ra in (3, 21,52,66);

update aluno set representante=33 where ra in (42,77,87);

update aluno set representante=66 where ra in (33, 96, 123);

select * from projeto;

select * from acompanhante;

select * from aluno;

select a.*, p.nome, descricao from aluno as a, projeto as p where fkProjeto=idProjeto; 

select a.*, ac.nome, relacao from aluno as a, acompanhante as ac where fkRg=rg;

select a.*, al.nome, al.telefone from aluno as a, aluno as al where a.representante=al.ra;

select a.*, p.nome, descricao from aluno as a, projeto as p where fkProjeto=idProjeto and idProjeto=1;

select a.*, p.nome, descricao, ac.nome, relacao from aluno as a, projeto as p, acompanhante as ac where fkProjeto=idProjeto and fkRg=rg;





