create database AlunoDisciplinaTurmaA;
use AlunoDisciplinaTurmaA;

-- criação da tabela Aluno
create table Aluno (
  ra int primary key auto_increment,
  nomeAluno varchar(45),
  bairro varchar(45)
  ) auto_increment = 53000;
  
-- criação da tabela Disciplina
create table Disciplina (
  idDisc int primary key auto_increment,
  nomeDisc varchar(45)
 ) auto_increment = 100;

-- criação da tabela associativa entre Aluno e Disciplina
-- esta tabela terá uma chave estrangeira para Aluno e uma chave estrangeira para Disciplina
-- a chave primária dessa tabela será composta por essas 2 chaves estrangeiras:fkRA e fkDisc
-- Obs: estamos assumindo que cada aluno só fará uma disciplina uma vez 
create table AlunoDisc (
   fkRa int, 
   foreign key (fkRa) references Aluno(ra),
   fkDisc int,
   foreign key (fkDisc) references Disciplina(idDisc),
   primary key(fkRa,fkDisc),
   nota decimal(4,2),
   qtdFalta int
 );
 
 -- insere dados de alunos
 insert into Aluno values
    (null, 'Maria Teixeira', 'Cambuci'),
    (null, 'José Oliveira', 'Vila Mariana'),
    (null, 'Katia Souza', 'Tatuapé'),
    (null, 'Claudio Silva', 'Paraíso');
 select * from Aluno;   

-- insere dados de disciplina
insert into Disciplina values
    (null, 'Banco de Dados'), (null,'Algoritmos'),
    (null, 'Arquitetura'), (null,'Pesquisa e Inovação');
select * from Disciplina;
    
-- insere dados na tabela associativa
insert into AlunoDisc values
    (53000,100,8,2), (53000,101,7.5,4), (53000,102,6,5),
    (53001,100,9,6), (53001,101,8, 10), (53001,103,6,7),
    (53002,100,8,4), (53002,102,7.5, 5), (53002,103,4,10),
    (53003,100,9,0), (53003,101,9.5,0), (53003,102,5,4);
select * from AlunoDisc; 

-- exibir os dados dos alunos e das disciplinas correspondentes,
-- além das notas e das quant de faltas de cada aluno em cada disc.
select * from Aluno, Disciplina, AlunoDisc 
   where fkRa = ra and fkDisc = idDisc;

-- exibir os dados dos alunos e das disciplinas correspondentes,
-- além das notas e das quant de faltas, mas sem repetir as colunas
-- fkRA e fkDisc
select Aluno.*, Disciplina.*, nota, qtdFalta 
   from Aluno, Disciplina, AlunoDisc 
   where fkRa = ra and fkDisc = idDisc;

-- exibir os dados dos alunos somente de Banco de Dados   
select Aluno.*, Disciplina.*, nota, qtdFalta 
   from Aluno, Disciplina, AlunoDisc 
   where fkRa = ra and fkDisc = idDisc and nomeDisc= 'Banco de Dados';

-- exibir os dados das disciplinas da aluna Katia Souza   
select Aluno.*, Disciplina.*, nota, qtdFalta 
   from Aluno, Disciplina, AlunoDisc 
   where fkRa = ra and fkDisc = idDisc and nomeAluno='Katia Souza';
   
select * from AlunoDisc;

-- exibe a soma da coluna nota e a soma da coluna qtdFalta da tabela AlunoDisc
select sum(nota), sum(qtdFalta) from AlunoDisc;

-- exibe a soma das notas e a soma das faltas, mas especificando os títulos das colunas do resultado do select
select sum(nota) as 'Soma das notas',
       sum(qtdFalta) as 'Soma das quant de faltas'
       from AlunoDisc;

-- exibe a média das notas e a média das faltas
select avg(nota) as 'Média das notas',
       avg(qtdFalta) as 'Média das faltas'
       from AlunoDisc;
       
-- exibe a menor nota e a maior nota da tabela AlunoDisc
select min(nota) as 'Menor nota',
       max(nota) as 'Maior nota' from AlunoDisc;
       
-- exibe a menor qtd de faltas e a maior qtd de faltas da tabela AlunoDisc
select min(qtdFalta) as 'Menor qtd de faltas',
       max(qtdFalta) as 'Maior qtd de faltas' from AlunoDisc;       
   
-- exibe a menor nota e a maior nota da tabela AlunoDisc, agrupado por disciplina
-- ou seja, exibe a menor nota e a maior nota de cada disciplina 
select min(nota) as 'Menor nota',
       max(nota) as 'Maior nota' from AlunoDisc group by fkDisc;

-- exibe o idDisciplina, a menor nota e a maior nota de cada disciplina
select fkDisc as idDisciplina,
       min(nota) as 'Menor nota',
       max(nota) as 'Maior nota' from AlunoDisc group by fkDisc;

-- exibe o RA, a menor nota e a maior nota de cada aluno (agrupado por fkRa)
select fkRa as RA,
       min(nota) as 'Menor nota',
       max(nota) as 'Maior nota' from AlunoDisc group by fkRa;
       
-- exibe o idDisciplina e a média das notas de cada disciplina
select fkDisc as idDisciplina,
   avg(nota) as 'Média das notas' from AlunoDisc group by fkDisc;
   
-- exibe a coluna nota da tabela AlunoDisc
select nota from AlunoDisc;

-- exibe a coluna nota, mas somente as notas distintas da tabela AlunoDisc
-- não aparece as notas repetidas
select distinct nota from AlunoDisc;

-- exibe a quantidade de notas da tabela AlunoDisc
select count(nota) as 'Quant de notas' from AlunoDisc;

-- exibe a quantidade de notas distintas da tabela AlunoDisc
select count(distinct nota) as 'Quant de notas distintas'
       from AlunoDisc;
       
-- exibe o idDisciplina, a quantidade de notas de cada disciplina
select fkDisc as idDisciplina,
  count(nota) as 'Quant de notas' from AlunoDisc group by fkDisc; 
  
-- exibe o idDisciplina, a quantidade de notas distintas de cada disciplina
select fkDisc as idDisciplina,
  count(distinct nota) as 'Quant de notas distintas' 
  from AlunoDisc group by fkDisc; 
   
select * from AlunoDisc;

-- atualiza a quantidade de faltas do aluno 53000 e disciplina 100
update AlunoDisc set qtdFalta=4 where fkRa= 53000 and fkDisc=100;   



--------------------------------------------------------------------------------------
 create table curso (
 idCurso int primary key auto_increment,
 nomeCurso varchar (45),
 coordenador varchar (45)) auto_increment=1000;

 
 insert into curso (nomeCurso, coordenador) values 
 ('ads', 'gerson'),
 ('redes', 'alex'),
 ('bd', 'celia');
 
 select * from Curso;
 
 select * from Aluno;
 
 alter table Aluno add fkCurso int, add foreign key (fkCurso) references Curso(idCurso);
 
update Aluno set fkCurso=1000 where ra in (53000, 53001);

update Aluno set fkCurso=1001 where ra=53002;

select * from Aluno, curso where fkCurso=idCurso;

select * from Aluno join curso on fkCurso=idCurso;

select * from Aluno inner join curso on fkCurso=idCurso;

select * from Aluno inner join curso on fkCurso=idCurso where nomeCurso='ads';

select * from Aluno left join curso on fkCurso=idCurso;

select * from Aluno right join curso on fkCurso=idCurso;

select * from Aluno, Disciplina, AlunoDisc 
   where fkRa = ra and fkDisc = idDisc;

   select * from Aluno join AlunoDisc on fkRa=ra join Disciplina on fkDisc=idDisc;
   
   Select Aluno.*, Disciplina.*, nota, qtdFalta from Aluno join AlunoDisc on 
   fkRa=ra join Disciplina on fkDisc=idDisc;
   
   select * from Aluno join curso on fkCurso=idCurso join AlunoDisc on fkRa=ra join Disciplina on fkDisc=idDisc;
   
    select * from Aluno left join curso on fkCurso=idCurso join AlunoDisc on fkRa=ra join Disciplina on fkDisc=idDisc;
   
select * from curso;

start transaction;

delete from curso where idCurso=1002;

 select * from curso;
 
 rollback;

commit;
