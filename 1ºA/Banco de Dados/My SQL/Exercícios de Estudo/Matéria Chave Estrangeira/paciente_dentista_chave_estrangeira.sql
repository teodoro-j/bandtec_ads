create database clinica; 

use clinica;

create table dentista (
idDentista int primary key auto_increment,
nome varchar (50),
especialidade varchar (30),
telefone varchar (30),
endereco varchar (80)) auto_increment=100;

insert into dentista (nome, especialidade, telefone, endereco) values
('drRenato', 'ortodontia', '4426-9988' , 'R: Evaristo de Morais'),
('drFernanda' , 'geral' , '4425-7075', 'R: Evaristo de Moraes' ),
('drRodrigo', 'ortodontia' , '4334-5057' , 'R: Catequese'),
( 'drGuilherme', 'pediatria', '3456-7897', 'R: Sao Caetano'),
('drBianca' , 'pediatria', '3789-5062' , 'R: Tatuape'),
('drSilveira', 'geral' , '4576-3037', 'R: Paulista'),
('drThiago' , 'ortodontia' , '5678-3543', 'R: Mooca');

select * from dentista; 

create table paciente (
idPaciente int primary key auto_increment,
nome varchar (50),
telefone varchar (30),
endereco varchar (80),
fkDentista int,
foreign key (fkDentista) references dentista (idDentista)); 

insert into paciente (nome, telefone, endereco, fkDentista) values
 ('joao', '94957-5374', 'R; Paulista', 100),
 ('bianca', '98246-0089', 'R:Mooca', 100),
 ('fernanda', '98079-7763', 'R: Tatuape' , 103),
 ('lais', '97865-5674', 'R: Sao Caetano' , 105),
 ('giovanna', '95674-8976', 'R: Maua' , 103),
 ('fabiola', '95674-0087', 'R: Catequese', 102),
 ('vitoria',  '97657-4675', 'R: Tatuape', 106);

 
 select * from paciente;
 
 select * from dentista;
 
 select * from dentista where especialidade='ortodontia'; 
 
 select p.*, d.nome, especialidade, d.telefone, d.endereco from paciente as p, dentista as d where fkDentista=idDentista; 
 
  update paciente set nome='ricardo' where idPaciente =2;
  
  delete from paciente where idPaciente=5;