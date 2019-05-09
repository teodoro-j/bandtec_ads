use melhoresFilmes;
select * from filmesFavoritos;
select nome, ano from filmesFavoritos;
select nome from filmesFavoritos where ano=2016;
select * from filmesFavoritos order by ano;
select * from filmesFavoritos order by ano desc; 
select * from filmesFavoritos where nome like '%s%';
select * from filmesFavoritos where nome like 'h%';
select * from filmesFavoritos where nome like '%e';
select * from filmesFavoritos where nome like '%g_';
update filmesFavoritos set ano=2017 where id=1006;
select * from filmesFavoritos;
update filmesFavoritos set topPreferidos=1 where id=1002;
select * from filmesFavoritos;

