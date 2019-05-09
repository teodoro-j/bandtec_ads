create table Aluno (
idAluno int primary key,
nome varchar (40),
bairro varchar(35) );

select * from aluno; 

insert into Aluno values
(1191003, 'Maria da Silva', 'Tatuape');

insert into Aluno values
(1191096, 'João Teodoro' , 'Santo André'),
(1191072, 'Bianca Barranco', 'Tatuape');

select * from Aluno order by nome;

select * from Aluno where bairro = 'Tatuape';

update Aluno set bairro='Tatuapé' where bairro='Tatuape'; 

-- identity é o auto_incremente no MySQL, e os números entre parenteses serve pra falar qual número começa e de quanto em quanto vai pular --
create table Curso(
idCurso int primary key identity(100,10),
nomeCurso varchar (30),
coordenador varchar (30)); 

select * from Curso;


