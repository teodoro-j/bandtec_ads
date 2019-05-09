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

insert into Curso values
('DAS', 'Gerson'),
('TI', 'Alex'),
('BD', 'Celia'); 

update Curso set nomeCurso='ADS' where nomeCurso='DAS';

select * from Curso;

alter table Aluno add  idCurso int foreign key references Curso(idCurso); 

select * from Aluno;

update Aluno set idCurso=100 where idAluno=1191003;
update Aluno set idCurso=110 where idAluno=1191072;
update Aluno set idCurso=120 where idAluno=1191096;

select * from Aluno, Curso where Aluno.idCurso=Curso.idCurso; -- mostrar as duas tabelas juntas --

select idAluno, nome, bairro, Curso.idCurso, nomeCurso, coordenador from ALuno, Curso where Aluno.idCurso=Curso.idCurso; -- mostrar as duas tabelas 
sem repetir--

select Aluno.*, Curso.idCurso, nomeCurso, coordenador from ALuno, Curso where Aluno.idCurso=Curso.idCurso; -- maneira com menos código --

select idAluno, nome, bairro, Curso.idCurso, nomeCurso, coordenador from ALuno, Curso where Aluno.idCurso=Curso.idCurso and nomeCurso= 'BD';
