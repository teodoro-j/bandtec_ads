create database futebol ;

use futebol;

create table times (
idTime  int primary key auto_increment,
nomeTime varchar (50),
nomeTecnico varchar (50),
formacao date );

desc times;

insert into times (nomeTime, nomeTecnico, formacao) values 
('corinthians', 'gaviao', '2010-02-20'),
('palmeiras', 'porco', '2010-02-05'),
('santos', 'baleia', '2010-09-08'),
('sao paulo', 'cervo', '2010-05-25');

select * from times;

create table jogadores (
idJogador int primary key auto_increment,
nomeJogador varchar (50),
posicao varchar (50),
telefone varchar (130),
fkTime int,
foreign key (fkTime) references times (idTime));

desc jogadores;

insert into jogadores (nomeJogador, posicao, telefone, fkTime) values 
('joao', 'zagueiro', '3545-9390', 1),
('rafael', 'zagueiro', '4585-0394', 2),
('giulherme', 'atacante', '4675-8945', 2),
('giovani', 'atacante', '4675-4893', 3),
('diego','goleiro', '4675-2893', 4);

alter table jogadores add column conselheiro int, add foreign key (conselheiro) references jogadores (idJogador); 

update jogadores set conselheiro=3 where idJogador in (1, 2, 4);

update jogadores set conselheiro=2 where idJogador in (3, 5);

select * from jogadores;

select nomeTime, nomeTecnico from times where nomeTime like 'p%';
 
 select * from jogadores order by posicao desc;
 
 select * from jogadores where posicao='atacante';
 
 select * from times where nomeTecnico like '%v_';
 
 select * from times order by nomeTecnico;
 
 update jogadores set posicao='goleiro' where idJogador=2;
 
 select t.*, j.* from times as t, jogadores as j where idTime = fkTime;
 
 select t.*, j.* from times as t, jogadores as j where nomeTime='palmeiras' and idTime = fkTime;
 
 select j.*, c.* from jogadores as j, jogadores as c where j.idJogador = c.conselheiro;
 
 select j.*, c.*, t.* from jogadores as j, jogadores as c, times as t where j.idJogador = c.conselheiro and t.idTime = c.fkTime;
 
 select j.*, c.* from jogadores as j, jogadores as c where j.nomeJogador='diego' and j.idJogador = c.conselheiro;
 
 delete from jogadores where idJogador = 2;
 
 drop table jogador;
 
 
 

