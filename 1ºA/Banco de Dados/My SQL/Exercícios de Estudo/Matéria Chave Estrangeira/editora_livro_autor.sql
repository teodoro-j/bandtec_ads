create database editoras;

use editoras;



create table editora (
idEditora int primary key auto_increment,
nome varchar (30),
cidade varchar (50),
fundada date );

insert into editora values
();

create table autor (
idAutor int primary key auto_increment,
nome varchar (50),
sexo enum ('f' , 'm'),
nacionalidade varchar (50));

create table livro (
idLivro int primary key auto_increment,
nome varchar (50),
genero varchar (50),
ano date,
fkEditora int,
fkLivro int,
foreign key (fkEditora) references editora (idEditora),
foreign key (fkAutor) references autor (idAutor));

insert into editora values
();


select e.*, a.nome, sexo, nacionalidade, l.nome, genero, ano from editora as e, autor as a, livro as l where idEditora=fkEditora
and idAutor=fkAutor; 






