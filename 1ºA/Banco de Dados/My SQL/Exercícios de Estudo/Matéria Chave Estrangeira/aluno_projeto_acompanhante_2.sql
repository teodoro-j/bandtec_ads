create database projetoBandtec;

use projetoBandtec;

create table projeto (
idProjeto int primary key auto_increment,
nome varchar (20),
descricao varchar (50));

select * from projeto;

create table aluno (
ra int primary key,
nome varchar (30),
telefone varchar (15),
fkProjeto int,
foreign key (fkProjeto) references projeto (idProjeto));

select * from aluno;

create table acompanhante (
cod int,
rg int ,
nome varchar (50),
relacao varchar (20),
fkAluno int,
foreign key (fkAluno) references aluno (ra),
primary key (fkAluno, cod));

select * from acompanhante;

insert into projeto (nome, descricao) values
('farmacia', 'controle em farmacias'),
('museu', 'controle em museus'),
('foguete', 'conservar sementes');

insert into aluno (ra, nome, telefone, fkProjeto) values 
(096, 'joao' , 1234, 1),
(077, 'guilherme', 2341, 2),
(052, 'fabiola', 2345, 2),
(042, 'giulia', 2371, 2),
(066, 'bianca', 2354, 1),
(087, 'ivone', 2635, 3),
(021, 'giovanna', 9198, 3),
(123, 'gustavo', 6273, 1),
(003, 'mariana', 4546, 3),
(033, 'luis', 3787, 2);

alter table aluno add column representante int, add foreign key (representante) references aluno (ra);

update aluno set representante=42 where ra in (3, 21,52,66);

update aluno set representante=33 where ra in (42,77,87);

update aluno set representante=66 where ra in (33, 96, 123);

insert into acompanhante values
(1, 2021, 'lucas' , 'amigo', 3),
(2, 2122, 'matheus', 'primo', 3),
(1, 2123, 'thiago', 'namorado', 52),
(1, 2124, 'maria', 'mae', 66),
(2 ,2125, 'talita', 'cunhada', 66),
(1, 2126, 'vitoria', 'irma', 77),
(1, 2127, 'cleonaldo', 'pai', 96),
(1, 22128, 'frederico', 'irmao', 123),
(2, 2129, 'leticia', 'prima', 123),
(1, 2130, 'madalena', 'tia', 87);

select * from projeto;

select * from acompanhante;

select * from aluno;

select a.*, p.nome, descricao from aluno as a, projeto as p where fkProjeto=idProjeto; 

select a.*, ac.nome, relacao from aluno as a, acompanhante as ac where fkAluno=ra;

select a.*, al.nome, al.telefone from aluno as a, aluno as al where a.representante=al.ra;

select a.*, p.nome, descricao from aluno as a, projeto as p where fkProjeto=idProjeto and idProjeto=1;

select a.*, p.nome, descricao, ac.nome, relacao from aluno as a, projeto as p, acompanhante as ac where fkProjeto=idProjeto and fkAluno=ra;





