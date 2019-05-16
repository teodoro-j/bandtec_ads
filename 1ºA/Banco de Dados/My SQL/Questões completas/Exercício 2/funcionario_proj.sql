create database  exercicioAula12;

use exercicioAula12;

create table departamento (
idDepto int primary key,
nomeDepto varchar (45),
idGerente int,
dataInicioGer date);

insert into departamento values 
(015, 'pesquisa', 2, '2008-05-22'),
(104, 'administracao', 7, '2005-01-01'),
(101, 'matriz', 8, '2001-06-19');

create table funcionarios (
idFunc int primary key,
nomeFunc varchar (30),
salario decimal (8.2),
sexo enum ('m','f'),
idSurpervisor int,
dataNasc date,
fkDepto int,
foreign key (fkDepto) references departamento (idDepto));

insert into funcionarios values
(1, 'joao silva', 3500, 'm', 2, '1985-01-09', 015),
(2, 'fernando wong', 4500, 'm', 8, '1975-12-08', 015),
(3, 'alice sousa', 2500, 'f', 7, '1988-01-19', 104),
(4, 'janice morais',4300, 'f', 8, '1970-06-20', 104),
(5, 'ronaldo lima', 3800, 'm', 1, '1982-09-15', 015),
(6, 'joice leite', 2500, 'f', 1, '1992-07-31', 015),
(7, 'antonio pereira', 2500, 'm', 4, '1989-03-29', 104),
(8, 'juliano brito',5500, 'm', null , '1957-11-10', 101);

create table projeto (
idProj int primary key,
nomeProj varchar (45),
localProj varchar (45),
fkDepto int,
foreign key (fkDepto) references departamento (idDepto));


insert into projeto values 
(1, 'produto x', 'santo andre', 015),
(2, 'projeto y', 'itu', 015),
(3, 'projeto z', 'sao paulo', 015),
(10, 'informacao', 'maua', 104),
(20, 'reorganizacao', 'sao paulo', 101),
(30, 'beneficios', 'maua',  104);

create table FuncProf (
fkFunc int,
foreign key (fkFunc) references funcionarios (idFunc),
fkProj int,
foreign key (fkProj) references projeto (idProj),
primary key (fkFunc, fkProj),
hora decimal (3.1));

insert into funcProf values 
(1,3,12.5),
(1,2,7.50),
(5,3,40.0),
(6,1,20.0),
(6,2,20.0),
(2,2,10.0),
(2,3,10.0),
(2,10,10.0),
(2,20,10.0),
(3,30,30.0),
(3,10,10.0),
(7,10,35.0),
(7, 30,5.00),
(4,30,20.0),
(4,20,15.0),
(8,20,null);
