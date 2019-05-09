create database alunoDisciplina;

use alunoDisciplina; 

create table aluno (
ra int primary key auto_increment,
nomeAluno varchar (45),
bairro varchar (45))auto_increment=5300;

create table disciplina (
idDisciplina int primary key auto_increment,
nomeDisciplina varchar (45))auto_increment=100;

create table alunoDisciplina (
fkra int,
foreign key (fkra) references aluno (ra),
fkdisc int,
foreign key (fkdisc) references disciplina (idDisciplina),
primary key (fkra, fkdisc),
nota decimal (4,2),
faltas int);

insert into aluno (nomeAluno, bairro) values
('bianca', 'tatuape'),
('fabiola', 'itaquera'),
('fernanda', 'osasco'),
('guilherme', 'sao caetano'),
('gustavo', 'santo andre'),
('vitoria', 'santo andre');

select * from aluno;

insert into disciplina (nomeDisciplina) values 
('bd'),
('algo'),
('arq'),
('socio'),
('ti');

select * from disciplina;

insert into alunoDisciplina values
(5300, 100, 9, 0),
(5300, 101, 10, 0),
(5300, 102, 8.70, 0),
(5301, 100, 9.80, 0),
(5301, 101, 7.80, 0),
(5301, 102, 7, 0);

select * from alunoDisciplina;

select * from aluno, disciplina, alunoDisciplina where fkra=ra and fkdisc=idDisciplina;

select aluno.*, discsiiplina.*, nota, faltas from aluno, disciplina, alunoDisciplina 
where fkra=ra and fkdisc=idDisciplina;

select aluno.*, disciplina.*, nota, faltas from aluno, disciplina, alunoDisciplina 
where fkra=ra and fkdisc=idDisciplina and nomeDisciplina='bd';

select aluno.*, disciplina.*, nota, faltas from aluno, disciplina, alunoDisciplina 
where fkra=ra and fkdisc=idDisciplina and nomeAluno='bianca';

select sum(nota), sum(faltas) from alunoDisciplina;

select sum(nota) as 'soma das notas', sum(faltas) as 'soma das fatas'from alunoDisciplina; 

select avg(nota) as 'Média das notas', avg(faltas) as 'Média das faltas'from alunoDisciplina;

select min(nota) as 'Menor nota', max(nota) as 'Maior nota'from alunoDisciplina;

select min(faltas) as 'Menor falta', max(faltas) as 'Maior falta'from alunoDisciplina;

select min(faltas) as 'Menor qtd de faltas', max(faltas) as 'Maior qtd de faltas' from alunoDisciplina group by fkDisc;


select fkDisc as idDisciplina, min(nota) as 'Menor nota',max(nota) as 'Maior nota' from alunoDisciplina group by fkDisc;

select fkDisc as nome, min(nota) as 'Menor nota', max(nota) as 'Maior nota' from alunoDisciplina group by fkDisc;

select fkRa as RA, min(nota) as 'Menor nota', max(nota) as 'Maior nota' from alunoDisciplina group by fkDisc;

select fkRa as RA, min(nota) as 'Menor nota', max(nota) as 'Maior nota' from alunoDisciplina
group by fkRa;

select fkDisc as idDisciplina, avg(nota) as 'Média das notas' from alunoDisciplina 
group by fkDisc;

select nota from alunoDisciplina;

select distinct nota from alunoDisciplina;

select count(nota) as 'Quant de notas' from alunoDisciplina;

select count(distinct nota) as 'Quant de notas distintas'from alunoDisciplina;

select fkDisc as idDisciplina, count(nota) as 'Quant de notas' from alunoDisciplina 
group by fkDisc;
 
 select fkDisc as idDisciplina, count(distinct nota) as 'Quant de notas distintas'
 from alunoDisciplina group by fkDisc;

update alunoDisciplina set nota=10 where fkra=5301 and fkDisc=100;



 

