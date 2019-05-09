create database projeto;
use projeto;

create table longin(
longin varchar (60) primary key,
senha varchar(40)
);

create table cadastro(
CPF int primary key,
nome varchar (60),
telefone int,
celular int,
email varchar(60),
sexo char (2),
data_nascimento date,
usuario varchar (40),
senha varchar (40),
cidade varchar(30),
estado varchar (30),
pais varchar (30)
);














