use adsa; 

create table Aluno (
  ra int primary key, 
  nome varchar(40), 
  bairro varchar(30)
  );
  
  insert into Aluno values
  (01191024, 'Messias', 'Jd das Flores'),
  (01191082, 'Oscar', 'Vila Olimpia'),
  (01191072, 'Bianca', 'Tatuape'),
  (01191036, 'Ryan', 'Parque Esmeralda'),
  (01191110, 'Romão', 'Itaquaquecetuba'),
  (01191091, 'Bruna', 'Guaianazes');

select * from Aluno;

create table curso (
idCurso int primary key auto_increment,
nome varchar (40),
coordenador varchar (40)) auto_increment=100; 

insert into curso (nome, coordenador) values
('ads' , 'gerson'),
('redes' , 'alex'),
('bd' , 'marise'); 

select * from curso; 

-- linkar os dados da tabela --

alter table Aluno add column idCurso int;

select * from Aluno;

desc Aluno; 

-- linkar os dados das tabelas, comando 

alter table Aluno add foreign key (idCurso) references curso (idCurso); 

desc Aluno; 

select * from Aluno;

update Aluno set idCurso =100 where ra in (1191024, 1191036,1191082, 1191110);

select * from Aluno;

update Aluno set idCurso =101 where ra in (1191072, 1191091);

select * from Aluno;

select * from Aluno where idCurso = 100; 

select * from Aluno order by idCurso; 

select * from Aluno order by idCurso, nome desc; 

-- exibir os dados das duas tabelas 


select * from Aluno, curso; 

select * from Aluno, curso where Aluno.idCurso = curso.idCurso;

-- nomear temporatiamente sa tabelas ´pra fazer comnado menor 

select * from Aluno as a, curso as c where a.idCurso =c.idCurso;

select ra,a.nome, bairro, a.idCurso, c.nome, coordenador 
from Aluno as a, curso as c where a.idCurso =c.idCurso;

select a.*, c.nome, coordenador 
from Aluno as a, curso as c where a.idCurso =c.idCurso;

select a.* from Aluno as a, curso as c
 where a.idCurso =c.idCurso
 and c.nome = 'ads';
 
 create table disciplina (
 idDisc int primary key auto_increment,
 nomeDisc varchar (40),
 qtdHoras int,
 curso int,
 foreign key (curso) references curso (idCurso)) auto_increment=1000;
 
 insert into disciplina values
 (null, 'bancoDeDados', 5, 100),
 (null, 'rede' , 4, 101),
 (null, 'algoritmos' , 5, 102),
 (null, 'modelagem', 6, 100); 
 
 select * from disciplina; 
 
 delete from curso where idCurso=100; 
 
 
 
 
 

