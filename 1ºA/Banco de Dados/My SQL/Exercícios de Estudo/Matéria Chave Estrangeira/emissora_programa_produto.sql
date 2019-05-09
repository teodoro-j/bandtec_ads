create database televisao;

use televisao;

create table emissora (
idEmissora int primary key auto_increment,
nome varchar (50),
telefone varchar (50),
fundada date );

insert into emissora (nome, telefone, fundada) values 
('globo', '4637-4839', '1980-05--3'),
('sbt', '3784-0923' , '1987-02-08');

select * from emissora;

create table programa (
idPrograma int primary key auto_increment,
nome varchar (50),
genero varchar (50),
horario time,
fkEmissora int,
foreign key (fkEmissora) references emissora (idEmissora) );

insert into programa (nome, genero, horario, fkEmissora) values 
('ratinho', 'noticiario', 20-00-00, 2),
('xuxa', 'talkShow', 19-00-00, 2),
('ladyNigth', 'talkShow', 23-00-00, 1);

select * from programa;

create table produtos (
idProduto int,
nome varchar (50),
marca varchar (50),
fkPrograma int,
foreign key (fkPrograma) references programa (idPrograma),
primary key (fkPrograma, idProduto) );

insert into produtos values
(10, 'perfume', 'jequiti', 1),
(20, 'camera', 'tekpix', 2),
(30, 'omega3', 'top', 3);

select * from produtos;

select nome, telefone from emissora where nome like 's%';

select * from programa order by genero desc;

select * from programa where genero='talkShow';

select * from emissora where nome like '%b_';

select * from emissora order by fundada;

update programa set genero='cotidiano' where idPrograma = 1;

select e.*, p.nome, genero, horario from emissora as e, programa as p where idEmissora =fkEmissora;

select e.*, p.nome, genero, horario from emissora as e, programa as p where e.nome='sbt' and idEmissora = fkEmissora;

select pr.*, p.nome, marca from programa as pr, produtos as p where fkPrograma=idPrograma; 

select pr.*, p.nome, marca from programa as pr, produtos as p where pr.nome='xuxa' and fkPrograma=idPrograma; 

select e.*, pr.nome, genero, horario, p.nome, marca from emissora as e, programa as pr, produtos as p where idEmissora=fkEmissora
and idPrograma=fkPrograma;

delete from produtos where idProduto=20;

drop table produtos;





