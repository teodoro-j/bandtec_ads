create database petshop;

use petshop;

create table cliente (
idCliente int primary key auto_increment,
nome varchar (50),
telefone varchar (15),
sexo enum ('m','f'),
bairro varchar (30));

create table pet (
idPet int primary key auto_increment,
especie varchar (30),
nome varchar (30),
raça varchar (30),
nascimento date,
fkCliente int,
foreign key (fkCliente) references cliente (idCliente) ) auto_increment=101;

insert into cliente (nome, telefone, sexo, bairro) values
('bianca barranco', '9897-9897', 'f', 'tatuape'),
('bruno barranco', '9798-9798', 'm' , 'taatuape'),
('Fabiola', '9697-9697',  'f' , 'itaquera'),
('joao teodoro', '9796-9796', 'm', 'abc'),
('fernanda', '9495-9495', 'f', 'zsul'),
('guilherme', '9394-9394' , 'm', 'abc');

select * from cliente; 

insert into pet (especie, nome, raça, nascimento, fkCliente) values 
('cachorro', 'lilica', 'lhasa apso', '2006/12/22', 1),
('cachorro', 'lolla', 'shihtzu', '2010/02/24', 2),
('cachorro', 'teddy', 'labrador', '2007/02/21', 3),
('gato', 'sebastiao', 'preto', '2009/02/03', 5),
('gato', 'mauricete', 'caramelo', '2003/08/05', 5),
('gato', 'fofa', 'rua', '2010/05/23', 5),
('gato','lupita', 'caramelo', '2018/03/23', 6),
('gato', 'mia', 'preto', '2010/05/24', 6),
('coelho', 'bill clinton', 'rabbit', '2001/05/25', 4),
('toquinha', 'tartaruga', 'marinha', '2003/04/07', 4);

select * from pet;

select * from cliente;

desc cliente;

alter table cliente modify column nome varchar (40); -- altera a coluna da tabela

select * from pet where especie='gato';  -- mostrar apenas gatos

select nome, nascimento from pet;

select * from pet order by nome;

select * from cliente order by bairro desc;

select * from pet where nome like 't%';

select * from cliente where nome like '%barranco';

update cliente set telefone=98975674 where idCliente = 3; -- olhar depois

select * from cliente;

select p.*, c.nome, telefone, sexo, bairro from pet as p, cliente as c where fkCliente=idCliente;

select * from cliente where sexo='f';

alter table cliente drop column sexo; 

select * from cliente;

delete from pet where idPet=106;

select * from pet;

drop table cliente;
drop table pet;
















