Create database ADSA; 
use adsa;
Create Table Alunos (
ra int primary key,
nome varchar (30),
email varchar (50),
InstituiçãodeOrigem varchar (50),
Empresadeinteresse varchar (20),
hobby varchar (15));

insert into Alunos values 
(011191096, 'João Teodoro' , 'joao.teodoro@bandtec.com.br', 'Américo Brasiliense', 'Easynvest', 'séries'),
(011191075, 'Guilherme' , 'guilherme.min@bandtec.com.br', 'Jorge Street', 'Outsystem', 'séries'),
(011191021, 'Manu' , 'manu.araujo@bandtec.com.br', '	Jorge Street', 'Stefanini', 'séries'),
(011191034, 'Vitória' , 'vitoria.cristina@bandtec.com.br', 'Jorge Street', 'Stefanini', 'jogar'),
(011191095, 'Giovanna' , 'giovanna.souza@bandtec.com.br', 'Mariano de Oliveira', 'Tivit', 'jogar');

select * from Alunos order by nome;

Create table Dados_das_Empresa (
Codigo int primary key,
nomedaempresa varchar (40),
representante varchar (40));

select * from Dados_das_Empresa;


insert into Dados_das_Empresa values
(1000, 'easynvest', 'Rodrigo'),
(1001, 'Stefanini', 'Gilberto'),
(1002, 'Outsystem', 'Ana'),
(1003, 'Tivit', 'Renato'),
(1004, 'CIP' , 'Ronaldo');

Create table Dados_da_Instituicao_Ensino (
Codigo Int primary key,
Instituicao_de_Origem varchar (40),
Bairro varchar (15));

insert into Dados_da_Instituicao_Ensino values
(2000, 'Americo Brasiliense' , 'Santo Andre'),
(2001, 'Mariano de Oliveira', 'Zona Norte'), 
(2002, 'Jorge Street', 'São Caetano'), 
(2003, 'UFABC', 'Santo André'),
(2004, 'Oswaldo Cruz', 'Zona Leste');

select * from Dados_da_Instituicao_Ensino ;




