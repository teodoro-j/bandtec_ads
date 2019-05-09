create database adsa1; 

use adsa1;

create table empresa (
idEmpresa int primary key auto_increment,
empresa varchar (30),
representante varchar (30)) auto_increment=10;

insert into empresa (empresa, representante) values
('easynvest', 'vitor'),
('stefanini', 'rodrigo'),
('primeUp', 'ana'),
('cip', 'gilberto');

select * from empresa;

create table instOrigem (
idOrigem int primary key auto_increment,
origem varchar (40),
bairro varchar (40)) auto_increment=20;

insert into instOrigem (origem, bairro) values
('oswaldoCruz', 'centro'),
('etec' , 'scs'),
('furg' , 'sul'),
('objetivo' , 'centro');

select * from instOrigem; 

create table alunos (
ra int primary key,
nome varchar (50),
e_mail varchar (50),
fkOrigem int,
fkEmpresa int,
hobby varchar (30),
foreign key (fkOrigem) references instOrigem (idOrigem),
foreign key (fkEmpresa) references empresa (idEmpresa)); 

select * from alunos;

insert into alunos values
(01191096, 'joao' , 'joao.alfredoteodoro@gmail.com' , 22 , 10 ,  'series'), 
(01191105, ' lais' , 'lais.silva@bandtec.com.br'  , 23 , 12 , 'musicas'),
(01191056, 'guilherme', 'guilherme.mingardi@bandtec.com.br' , 21 , 10 ,  'natacao'),
(01191072, 'bianca' ,  'bianca.barranco@bandtec.com.br' , 20 , 11 , 'filmes'),
(01191026, 'fernanda' , 'fernanda.esteves@bandtec.com.br' , 21 , 13  , 'livros'),
(01191088, 'giovanna' , 'giovanna.nabandtec.com.br' , 23 , 11 , 'cabelo');

select * from alunos; 

select a.*, o.origem, bairro, e.empresa, representante from alunos as a, instOrigem as o, empresa as e where fkOrigem=idOrigem and fkEmpresa=idEmpresa;
 
select a.*, o.origem, bairro, e.empresa, representante from alunos as a, instOrigem as o, empresa as e where fkOrigem=idOrigem and fkEmpresa=idEmpresa and empresa='easynvest';

select a.*, o.origem, bairro, e.empresa, representante from alunos as a, instOrigem as o, empresa as e where fkOrigem=idOrigem and fkEmpresa=idEmpresa and fkEmpresa=11;

select a.*, o.origem, bairro, e.empresa, representante from alunos as a, instOrigem as o, empresa as e where fkOrigem=idOrigem and fkEmpresa=idEmpresa and origem='etec';  



