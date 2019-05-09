use jogos;

create table atletlas (
idAtleta int primary key,
nome varchar (40),
modalidade varchar (40),
medalhas int);

drop table atletlas;

create table atletas (
idAtleta int primary key,
nome varchar (40),
modalidade varchar (40),
medalhas int);

-- o primeiro número do id é referente a modalidade --
insert into atletas values
(1500, 'João Teodoro', 'natação', 3),
(1501, 'Giovanna', 'natação', 4),
(1502, 'Bianca' , 'natação' , 2),
(2500, 'Fernanda' , 'karate' , 3),
(2501, 'agatha' , 'karate' , 5),
(3500, 'Lais' , 'ginasta' , 3),
(3501, 'fabiola', ' ginasta', 2); 

select * from atletas order by nome; -- mostrar toda a tabel e nomes em ordem alfabetica --

select nome,medalhas from atletas; -- mostrar apenas as colunas escolhidas --

select * from atletas where modalidade = 'natação'; -- mostrar tabela só de determinada modalidade  usar '' '' --

select * from atletas order by modalidade; -- mostrar tabela por ordem alfabética da modalidade  --

select * from atletas order by medalhas desc; -- mostrar tabelas por ordem de medalha decrescente --

select * from atletas where nome like  "g%"; -- mostrar tabelas por nomes que comecem com g --

select * from atletas where nome like '%a%'; -- mostrar tabelas por nomes que contenham a letra a  no nome --

select * from atletas where nome like '%o'; -- mostrar tabela por nomes que termine com a letra --

select * from atletas where nome like '%n_'; -- mostrar tabela por nomes que a penultima letra seja --

update atletas set medalhas = 6 where idAtleta = 1500; -- alterar campo (medalhas) usar sempre a chave primaria --

select * from atletas where idAtleta = 1500; -- mostrar o campo modificado determinado --

update atletas set modalidade= 'ginastica' where idAtleta = 2501; -- alterar campo (modalidade) --

select * from atletas where idAtleta = 2501; -- mostrar o campo modificado determinado --

update atletas set idAtleta = 3502 where idAtleta = 2501;  -- alterar modalidade --

select * from atletas; 

insert into atletas value  -- incluir novos valores nos campos --
(2501, 'Guilherme' , ' karate' , 4);

drop table atletas; -- apagar tabela --






 















 






