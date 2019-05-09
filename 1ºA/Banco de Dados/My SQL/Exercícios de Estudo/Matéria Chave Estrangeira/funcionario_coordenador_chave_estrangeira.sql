create database funcionario;

use funcionario;

create table funcionarios (
idFuncionario int primary key auto_increment,
nome varchar (50) not null, /*significa que o campo é obrigatório */ 
sexo char(1),
check (sexo = 'm' or sexo ='f'), -- só pode inserir esses valores -- 
salario decimal (8,2),  /*para incluir valores quebrados, o primeiro digito é para numeros antes da vírgula, e apos virgula */--
idCoordenador int ) auto_increment=150;

insert into funcionarios (nome, sexo, salario) values
('Patricia', 'm', 4000.50),
('silvio', 'f', 8000.75),
('bianca' , 'f', 4500.87);

alter table funcionarios add foreign key (idCoordenador) references funcionarios (idFuncionario);

select f.*, fn.nome, fn.sexo, fn.salario from funcionarios as f, funcionarios as fn where f.idFuncionario=fn.idCoordenador; 


