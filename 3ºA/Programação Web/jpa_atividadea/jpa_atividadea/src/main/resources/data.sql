insert into premio (id, nome) values
(1, 'Oscar'),
(2, 'Grammy'),
(3, 'X Awards');

insert into categoriapremio (id, nome) values
(1, 'Nacional'),
(2, 'Internacional');

insert into categoriafilme (id, nome) values
(1, 'Melhor Filme Adaptado'),
(2, 'Melhor Filme Drama'),
(3, 'NElhor Filme Estrangeiro'),
(4, 'Melhor Filme Animação'),
(5, 'Melhor Trilha Sonora'),
(6, 'Melhor Filme Efeitos Especiais');

insert into filme (id, nome, ano, categoria_id, obs) values
(1, 'Nasce uma Estrela', 2019, 5, 'História de uma jovem com sonho de ser Cantora'),
(2, 'A culpa das Estrelas', 2015, 1, 'Casal de jovens apaixonados que enfrentam o cancer'),
(3, 'O fabuloso Destino de Amelie POulan', 2010, 3, "Jovem francesa que busca uma história de amor"),
(4, 'Bog Hero', 2016, 4, 'Jovem perde irmão e entra para um clube de cientistas'),
(5, 'Cisne Negro' 2014, 2, 'HUma bailarina sonha em entrar num grupo de ballet famoso'),
(6, 'Toy Story 4', 2019, 4, 'Brinquedos que tomam vida quando estao longe de seus donos');

insert into premiofilme (id, filme_id, categoria_premio_id, ano, destaque_discurso) values
(1, 1, 5, 2020, 'adie efaojfe jeaofjie'),
(2, 2, 1, 2020, 'dsljuda daslu safaijefj flaijfs farl'),
(3, 6, 4, 2019, "Jareifmareg ulgajg gleige gier gekug"),
(4, 5, 2, 2019, 'grelgi rgeilg geiljgeigjslreg f fdbgdt'),
(5, 4, 4, 2018, 'fsgmlri reglusjgo teosjg ttpoijgtr'),
(6, 3, 3, 2020, 'sfdgi regijresgn frgsiojren oij sdfoijrse');