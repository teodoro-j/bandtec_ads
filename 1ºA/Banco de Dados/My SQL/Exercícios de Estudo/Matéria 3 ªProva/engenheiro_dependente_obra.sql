create database civil;

use civil;

create table engenheiro (
crea int primary key auto_increment,
nomeEng varchar (45),
sexo enum ('f','m'),
salario decimal (7,2))auto_increment=1000;

insert into engenheiro (nomeEng, sexo, salario) values 
('bianca', 'f', 4000.00),
('fabiola', 'f', 4000.00),
('guilherme', 'm', 3870.00);

select * from engenheiro;

create table dependente (
id int ,
nome varchar (45),
nascimento date,
relacionamento varchar (45),
fkEng int,
foreign key (fkEng) references engenheiro (crea),
primary key (fkEng, id));

insert into dependente values
(1, 'celia', '1980-08-07', 'mae', 1000),
(2, 'marcos', '1978-06-08', 'pai', 1000),
(1, 'margarita', '1980-05-25', 'mae', 1001),
(1, 'lucas', '2000-03-04', 'namorado', 1002),
(2, 'giovanni', '1999-09-8', 'irmao', 1002);

select * from dependente;

create table obra (
idObra int primary key auto_increment,
nomeObra varchar (45),
localObra varchar (45));

insert into obra (nomeObra, localObra) values
('pharma sense', 'farmacia'),
('art of things', 'museu'),
('lovelace', 'foguete');

select * from obra;


create table trabalho (
fkCrea int,
foreign key (fkCrea) references engenheiro (crea),
fkObra int,
foreign key (fkObra) references obra (idObra),
primary key (fkCrea, fkObra), 
horas int);

insert into trabalho values
(1000, 2, 100),
(1000, 3, 30),
(1001, 1, 100),
(1001, 2, 300),
(1002, 3, 300);

select * from trabalho;

select engenheiro.*, dependente.* from engenheiro, dependente where fkEng=crea;

select engenheiro.*, dependente.* from engenheiro, dependente where fkEng=crea and crea=1000;

select engenheiro.*, dependente.* from engenheiro, dependente where fkEng=crea and 
relacionamento='mae';

select engenheiro.*, obra.*, trabalho.horas from engenheiro, obra, trabalho where
fkCrea=crea and fkObra=idObra;

select obra.*, engenheiro.*, trabalho.horas from obra, engenheiro, trabalho
 where fkCrea=crea and fkObra=idObra and idObra=2;
 
 select engenheiro.*, dependente.*, obra.*, trabalho.horas from engenheiro, dependente, obra, trabalho
 where crea=FkEng and crea=FkCrea and idObra=fkObra;
 
  select engenheiro.*, dependente.*, obra.*, trabalho.horas from engenheiro, dependente, obra, trabalho
 where crea=FkEng and crea=FkCrea and idObra=fkObra and crea=1000;
 
  select engenheiro.*, dependente.*, obra.*, trabalho.horas from engenheiro, dependente, obra, trabalho
 where crea=FkEng and crea=FkCrea and idObra=fkObra and idObra=3;
 
 select sum(salario) from engenheiro;
 
 select avg(salario) as 'media dos salarios' from engenheiro;
 
 select min(salario) as 'menor salario', max(salario) as 'maior salario' from engenheiro; 
 
 select distinct salario from engenheiro;
  
 select count(distinct salario) as 'salario distintos' from engenheiro;

 
 












