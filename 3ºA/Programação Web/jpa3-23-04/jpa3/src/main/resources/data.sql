insert into turma (id, nome) values
(1, '3ADSA'),
(2, '3ADSB'),
(3, '1CCO');

insert into aluno (id, nome, nascimento, classe_social, bairro, turma_id) values
(1, 'Zé Ruela', '1995-01-01', 'A', 'Tatuape', 1),
(2, 'Zé Buduia', '1996-01-01', 'C', 'Se', 1),
(3, 'Maria Bigodenha', '1997-01-01', 'B', 'Braz', 1),
(4, 'Maria Chica', '1998-01-01', 'D', 'Mooca', 2),
(5, 'Lady Gaga', '1999-01-01', 'A', 'Braz', 2),
(6, 'Jojo Todinho', '2000-01-01', 'C', 'Mooca', 3),
(7, 'Zeca Tatú', null, null, null, 3),
(8, 'Maria Capivara', null, null, null, 3),
(9, 'João Ninguém', null, null, null, null);