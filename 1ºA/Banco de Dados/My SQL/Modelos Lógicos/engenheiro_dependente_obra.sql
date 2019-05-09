create database civil;

use civil;

create table engenheiro (
crea int primary key auto_increment,
nomeEng varchar (45),
sexo enum ('f','m'))auto_increment=1000;

create table dependente (
id int ,
nome varchar (45),
nascimento date,
relacionamento varchar (45),
fkEng int,
foreign key (fkEng) references engenheiro (crea),
primary key (fkEng, id));

create table obra (
idObra int primary key auto_increment,
nomeObra varchar (45),
localObra varchar (45));

create table trabalho (
fkCrea int,
foreign key (fkCrea) references engenheiro (crea),
fkObra int,
foreign key (fkObra) references obra (idObra),
primary key (fkCrea, fkObra), 
horas int);


