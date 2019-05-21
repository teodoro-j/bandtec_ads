create database faculdade;
use faculdade;

create table Grupo(
	cd_grupo int primary key auto_increment,
    nm_grupo varchar(45),
	descricao varchar(250)
);

create table Aluno(
	cd_aluno int primary key,
    nm_aluno varchar(50),
    email varchar(60),
	fk_grupo int,
    constraint Aluno_fkGrupo 
		foreign key(fk_grupo) references Grupo(cd_grupo)
);

create table Professor(
	cd_professor int primary key auto_increment,
    nm_professor varchar(50),
    disciplina varchar(40)
)auto_increment=10000;

create table GrupoProfessor(
	fk_professor int,
    fk_grupo int,
    nota int,
    dt_banca date,
    hr_banca time,
    constraint	GP_fkGrupo
		foreign key(fk_grupo) references Grupo(cd_grupo),
	constraint GP_fkProfessor
		foreign key(fk_professor) references Professor(cd_professor)
);


insert into Grupo values
	(null, 'TechHumi', 'Controle de Temp. e Umid. para otimização da produtividade em empresas'),
    (null, 'BoxZard', 'Controle de Temp. em galpões'),
    (null, 'Art of Things', 'Controle de Temp. para conservação de obras em museus');
    
insert into Aluno values
	(01191001, 'Fernanda Esteves', 'fe@bandtec.com.br', 1),
    (01191002, 'Natalia Medina', 'nm@bandtec.com.br', 1),
    (01191003, 'Leticia Lagos', 'll@bandtec.com.br', 1),
    (01191004, 'Adriana Elva', 'ae@bandtec.com.br', 1),
    (01191005, 'Gustavo Henrique', 'gh@bandtec.com.br', 1),
    (01191006, 'Vitor Leonardo', 'vl@bandtec.com.br', 1),
    (01191007, 'Lais Silva', 'ls@bandtec.com.br', 2),
    (01191008, 'Amanda Buarque', 'ab@bandtec.com.br', 2),
    (01191009, 'Alex Celestino', 'ac@bandtec.com.br', 2),
    (01191010, 'Gustavo Gonçalves', 'gg@bandtec.com.br', 2),
    (01191011, 'Bianca Barranco', 'bb@bandtec.com.br', 3);
    
    
insert into Professor values
	(null, 'Marise Miranda', 'Arquitetura Computacional'),
    (null, 'José Yoshihiro', 'Algoritmo'),
    (null, 'Célia Taniwaki', 'Banco de Dados'),
    (null, 'Fernando Brandão', 'Projeto Inovação');

insert into GrupoProfessor values
		(10003, 1, 8, '2019-06-03', '13:00:00'),
        (10000, 1, 9, '2019-06-03', '13:00:00'),
        (10001, 1, 7, '2019-06-03', '13:00:00'),
        (10002, 2, 9, '2019-06-04', '13:00:00'),
        (10000, 2, 10, '2019-06-04', '13:00:00'),
        (10001, 2, 10, '2019-06-04', '13:00:00'),
        (10000, 3, 10, '2019-06-04', '14:00:00'),
        (10002, 3, 9, '2019-06-04', '14:00:00');
    
-- 1
select * from Grupo;
select * from Aluno;
select * from Professor;
select * from GrupoProfessor;

-- 2
select Grupo.*, nm_aluno, email
from Aluno
inner join Grupo 
	on cd_grupo = fk_grupo;
    
-- 3
select Grupo.*, nm_aluno, email
from Aluno
inner join Grupo 
	on cd_grupo = fk_grupo
where cd_grupo = 2;

-- 4
select avg(nota) as 'Media de Notas dos Grupos'
from Grupo
inner join GrupoProfessor
	on cd_grupo = fk_grupo;

-- 5

select min(nota) as 'Nota Mínima', max(nota) as 'Nota Máxima'
from Grupo
inner join GrupoProfessor
	on cd_grupo = fk_grupo;
    
-- 6

select sum(nota) as 'Soma de Notas'
from Grupo
inner join GrupoProfessor
	on cd_grupo = fk_grupo;
    
-- 7
select Professor.*, Grupo.*, dt_banca, hr_banca
from GrupoProfessor
inner join Professor
	on cd_professor = fk_professor
inner join Grupo
	on cd_grupo = fk_grupo;
    
-- 8
select Professor.*, Grupo.*, dt_banca, hr_banca
from GrupoProfessor
inner join Professor
	on cd_professor = fk_professor
inner join Grupo
	on cd_grupo = fk_grupo
where cd_grupo = 1;

-- 9
select nm_grupo
from GrupoProfessor
inner join Grupo
	on cd_grupo = fk_grupo
inner join Professor
	on cd_professor = fk_professor
where cd_professor = 10001;

-- 10

select nm_aluno
from GrupoProfessor
inner join Aluno
	on GrupoProfessor.fk_grupo = Aluno.fk_grupo
inner join Professor
	on cd_professor = fk_professor
where cd_professor = 10001;


-- 11

select nm_professor
from GrupoProfessor
inner join Professor
	on cd_professor = fk_professor
inner join Aluno
	on GrupoProfessor.fk_grupo = Aluno.fk_grupo
where cd_aluno = 01191009;

-- 12

select Aluno.*, Professor.*, Grupo.*, dt_banca, hr_banca
from GrupoProfessor
inner join Professor
	on cd_professor = fk_professor
inner join Grupo
	on cd_grupo = fk_grupo
inner join Aluno
	on Aluno.fk_grupo = cd_grupo;
    
-- 13
select count(distinct nota)
from GrupoProfessor;

-- 14
select cd_professor, avg(nota) as 'Média notas', sum(nota) as 'Soma notas'
from GrupoProfessor
inner join Professor
	on cd_professor = fk_professor
group by cd_professor;

-- 15
select cd_grupo, avg(nota) as 'Media do grupo', sum(nota) as 'Soma das notas do grupo'
from GrupoProfessor
inner join Grupo
	on cd_grupo = fk_grupo
group by cd_grupo;

-- 16
select cd_professor, min(nota), max(nota)
from GrupoProfessor
inner join Professor
	on cd_professor = fk_professor
group by cd_professor;

-- 17
select cd_grupo, min(nota), max(nota)
from GrupoProfessor
inner join Grupo
	on cd_grupo = fk_grupo
group by cd_grupo;

