create database AulaReforco;
use AulaReforco;

-- criação da tabela Turma
create table Turma (
   idTurma char(5) primary key,
   semestre int
);

-- criação da tabela Aluno
create table Aluno (
   ra int primary key,
   nome varchar(40),
   fkTurma char(5), -- coluna que será a chave estrangeira para Turma
   foreign key (fkTurma) references Turma(idTurma) -- configuração da chave estrangeira
);

-- insere dados na tabela Turma
insert into Turma values
   ('1ADSA', 1) , ('1ADSB', 1), ('2ADSA', 2), ('2ADSB', 2);
   
select * from Turma;

-- insere dados na tabela Aluno
insert into Aluno values
   (01191064, 'Amanda', '1ADSA'),
   (01191098, 'Gustavo', '1ADSA'),
   (01191068, 'Aron', '1ADSB'),
   (01191077, 'Letícia', '1ADSA'),
   (01191076, 'Noronha', '1ADSA'),
   (01191079, 'Beatriz', '1ADSB'),
   (01191071, 'Marcio', '1ADSB');
select * from Aluno; 

-- Exibir os dados das turmas e dos alunos correspondentes
select * from Turma  ,   Aluno where fkTurma = idTurma;
-- idem, usando join
select * from Turma join Aluno on    fkTurma = idTurma;

-- exibir os dados das turmas e dos alunos sem repetir
-- a informação fkTurma
select t.*, ra, nome from Turma as t, Aluno 
      where fkTurma = idTurma;  
select t.*, ra, nome from Turma as t join Aluno 
      on fkTurma = idTurma;
      
-- formas erradas de fazer o select de 2 tabelas      
select * from Turma join Aluno; -- join de 2 tabelas sem on
select * from Turma,Aluno;      -- select de 2 tabelas sem where

-- exibir os dados somente da turma 1ADSA e os dados dos seus alunos
select * from Turma, Aluno where fkTurma = idTurma
       and idTurma = '1ADSA';
-- exibir os dados da turma e os dados somente da Amanda
select * from Turma, Aluno where fkTurma = idTurma
       and nome = 'Amanda';
       
-- exibir os dados das turmas e dos alunos correspondentes
-- e também as turmas que não tem alunos associados
select * from Turma left join Aluno on fkTurma = idTurma;
-- exibir os dados das turmas e dos alunos correspondentes
-- e também as turmas que não tem alunos associados
select * from Aluno right join Turma on fkTurma = idTurma;

-- criar a tabela Professor
create table Professor (
  idProf int primary key,
  nomeProf varchar(45)
);

-- insere dados na tabela Professor
insert into Professor values 
  (1, 'Marise'), (2, 'Alex'), (3, 'Celia');
select * from Professor;  

-- cria a tabela associativa entre Professor e Aluno
-- essa tabela resulta do relacionamento muitos-para-muitos entre Professor e Aluno
-- a chave primária é composta pela chave estrangeira para professor e pela chave
-- estrangeira para aluno
-- obs.: o certo aqui seria acrescentar uma coluna que indica o semestre letivo (20191)
--       e fazer essa coluna também parte da chave primária composta, senão cada professor
--       só pode dar aula para um aluno uma vez, do jeito que foi implementado
create table ProfAluno (
   fkProf int,
   foreign key(fkProf) references Professor(idProf),
   fkRa int,
   foreign key(fkRa) references Aluno(ra),
   primary key(fkProf, fkRa),
   disciplina varchar(40),
   nota decimal(4,2)
 );
-- insere dados na tabela ProfAluno
insert into ProfAluno values
  (1,01191064,'ArqComp',7), (1,01191098,'ArqComp',8.5),
  (2,01191064,'TI',8), (2,01191068,'TI',8),
  (3,01191098,'BD',7.5), (3,01191076,'BD',10);
select * from ProfAluno;  

-- exibir os dados dos alunos, dos professores, 
-- das disciplinas e notas   
select * from Aluno, Professor, ProfAluno 
    where ra = fkRa and idProf = fkProf;
-- idem ao anterior usando join
select * from Aluno join ProfAluno on ra = fkRa
                    join Professor on idProf = fkProf;

-- exibir os dados somente da prof Marise e seus alunos
select * from Aluno, Professor, ProfAluno 
    where ra = fkRa and idProf = fkProf 
    and nomeProf = 'Marise';
select * from Aluno join ProfAluno on ra = fkRa
                    join Professor on idProf = fkProf
                    where nomeProf = 'Marise';

-- exibir os dados dos professores, das disciplinas e notas,
-- mas somente da aluna Amanda                    
select * from Aluno, Professor, ProfAluno 
    where ra = fkRa and idProf = fkProf 
    and nome = 'Amanda';
select * from Aluno join ProfAluno on ra = fkRa
                    join Professor on idProf = fkProf
                    where nome = 'Amanda';
                    
select * from ProfAluno;                    
                    
-- exibir a soma de todas as notas de ProfAluno
select sum(nota) as TotalNotas from ProfAluno;
select sum(nota) as 'Total das Notas' from ProfAluno;

-- exibir a média de todas as notas de ProfAluno  
select avg(nota) as 'Média das Notas' from ProfAluno;

-- exibir a menor nota e a maior nota de ProfAluno
select min(nota) as 'Menor nota', 
       max(nota) as 'Maior nota' from ProfAluno; 

-- exibir a menor nota e a maior nota agrupado por aluno
select min(nota) as 'Menor nota', 
       max(nota) as 'Maior nota' from ProfAluno group by fkRa;

-- exibir o ra, a menor nota e a maior nota de cada aluno (agrupado por aluno)       
select fkRa, min(nota) as 'Menor nota', 
       max(nota) as 'Maior nota' from ProfAluno group by fkRa;

-- exibir o ra e a média das notas agrupados por aluno       
select fkRa, avg(nota) as 'Média das notas' from ProfAluno group by fkRa;
  
-- exibir o idProf e a média das notas agrupados por professor
select fkProf, avg(nota) as 'Média das notas' 
       from ProfAluno group by fkProf;     

-- exibir a quantidade de notas de ProfAluno
select count(nota) as 'Quantidade de notas' from ProfAluno;

-- exibir a quantidade de notas distintas de ProfAluno
select count(distinct nota) as 'Quantidade de notas distintas' from ProfAluno;

       