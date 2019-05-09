create database Filmes;

use Filmes;

create table filme (
idFilme int primary key,
titulo varchar (50),
genero varchar (25),
diretor varchar (30));

select * from filme;

insert into filme values
( 1, 'Nasce uma estrela' , ' drama' , ' Bradley Cooper');

-- nova forma de inserir dados --

insert into filme (idFilme,titulo) values  -- apenas esses dados em específico --
(2, ' Tarzan ');

select * from filme;

insert into filme (titulo, idFilme) values -- se mudar a ordem, tem que nomear a ordem --
( "Pantera Negra" , 3 ) ;

insert into filme (idFilme, titulo) values -- idem execução anterior --
(4 , 'Star Wars' ),
(5 , ' Avatar ' ),
(6 , ' Creed' ),
(7 , ' Titanic' );

select * from filme;

update filme set diretor='James Cameron' where idFilme=5 or idFilme= 7; -- quando quer aletera dois ao mesmo tempo ---

select * from filme;

update filme set genero='aventura' where idFilme in (3, 4, 5, 6);  -- alterar mais campos ao mesmo tempo, porem mais rapido --

select * from filme;

update filme set diretor= 'Ryan K' where idFilme in (2,3,4,6);

update filme set genero='desenho' , diretor='Bryan' where idFilme= 2; -- alterar campos diferentes ao mesmo tempo --

select * from filme;

update filme set genero='romance' where idFilme = 7;
 
 select * from filme;
 
select * from filme order by diretor; 

select * from filme order by diretor, titulo; -- exibir a tabela com 2 critérios --

select * from filme order by diretor desc , titulo desc; -- exibir a tabela com 2 criterios em ordem decrecente --

select * from filme where diretor like '%Cameron'; -- exibir tabela com o sobrenome específico --

alter table filme add column ano int; -- inserir um novo campo na tabela -- 

desc filme; -- ou describe (nome da tabela) e exibi a estrutura da tabela--

alter table filme modify titulo varchar (50); -- alterar tipo e quandidade qde caracteres da columa tipo--

alter table filme drop column ano ; -- deleta coluna específica -- 

select * from filme;  

delete from filme where idFilme = 2 ; -- deletar campo do id em específico --

select * from filme;

create table Pessoa (
idPessoa int primary key auto_increment, -- usa-se o auto_increment na chava primaria para criar código automatico ---
nome varchar (50),
dataNasc date);

select * from Pessoa; 

insert into Pessoa values -- usa-se o null no lugar do id pra não precisar crias código --
(null, 'Rogerio', '94-05-20');

insert into Pessoa values
(null, 'Claudio', '00-04-21'),
(null, 'Mariana' , '85-02-13');

insert into Pessoa (nome, dataNasc) values -- como ja esta automatico o id, seleciona o que vai incluir --
('Maria', '59-06-22');


select * from Pessoa; 

alter table Pessoa auto_increment=10; -- para alterar de onde começa o código automatico --

insert into Pessoa values
(null, 'Fabio', '75-08-22'),
(null, 'Samuel', '06-03-16'),
(null, 'Lucas' , '10-04-08');

select * from Pessoa; 

-- mesmo configurando que é auto increment é possivel inserir no codigo em branco -- 

Create table Teste (
id int primary key auto_increment,
nome varchar (50) ) auto_increment=1000;  -- pra cirar tabela com código já pre-definido --

insert into Teste values 
(null, 'Ola'),
(null, 'Mundo');

select * from Teste;