Create Database ADSA;
use adsa;
-- comen´tario  -- 
create table Aluno (
  ra int primary key, 
  nome varchar(40), 
  bairro varchar(30)
  );
  
  insert into Aluno values
    (01191096, 'João', 'santo andre');
    -- exibir dados da Tabela-- 
select * from aluno;

insert into Aluno values
  (01191024, 'Messias', 'Jd das Flores'),
  (01191082, 'Oscar', 'Vila Olimpia'),
  (01191072, 'Bianca', 'Tatuape'),
  (01191036, 'Ryan', 'Parque Esmeralda'),
  (01191110, 'Romão', 'Itaquaquecetuba'),
  (01191091, 'Bruna', 'Guaianazes');
  
  select * from Aluno;
  
  -- exibir apenas os nomes dos alunos
  
  select nome from aluno ;
  
-- exibir apenas o ra e bairro dos alunos
  select ra,bairro from aluno;
  -- exibir apenas os dados dos alunos de ra = 01191096
  select * from aluno where ra =  01191096;
  select * from aluno where ra > 01191050;
  
  -- exibir os dados dos alunos em ordem alfabética
  select * from aluno order by nome;
  select * from aluno order by bairro;
  select * from aluno order by nome desc;
  select * from aluno where ra < 01191070 order by nome
;
  select * from aluno where nome like 'r%';
  
  select * from aluno where nome like '%a';
  select * from aluno where bairro like 'ita%';
  select * from aluno where nome like '_a%';
  
  
  select * from aluno where ra <> 01191096;
  
  
  update aluno set bairro='paraiso' where ra = 01191096;
  
  update aluno set nome='Ryan Silvestre', bairro='Paraiso'  where ra=  01191036;
  
  drop database adsa; -- apagar tudo --
  
  select * from aluno;
  
  
  
  
  
  
  
  
  

  
  
  
  
  