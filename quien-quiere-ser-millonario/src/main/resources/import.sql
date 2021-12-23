-----creacion de tabla player
insert into player(name, score) values ('josefo',0);
insert into player(name, score) values ('daniel',0);
insert into player(name, score) values ('carlos',0);
insert into player(name, score) values ('luis',0);

-----Creacion de tabla level

insert into level(name) values ('Comodin');
insert into level(name) values ('Facil');
insert into level(name) values ('Interesante');
insert into level(name) values ('Complejo');
insert into level(name) values ('Dificil');

----Creacion de tabla question

insert into question(idLevel, description) values (1,'¿Cuales son los 5 tipos de sabores primarios?');
insert into question(IdLevel, description) values (1,'Escritor del libro "La Odisea"');
insert into question(IdLevel, description) values (1,'¿Cual es el nombre de la reina del Reino Unido?');
insert into question(IdLevel, description) values (1,'¿Quet tipo de animal es la ballena?');
insert into question(IdLevel, description) values (1,'¿Cual es el disco mas vendido de la historia?');

insert into question(IdLevel, description) values (2,'¿Cual es el lugar mas frio del planeta?');
insert into question(IdLevel, description) values (2,'¿Como se llama la capital de Mongolia?');
insert into question(IdLevel, description) values (2,'¿Cual es el rio mas largo del mundo?');
insert into question(IdLevel, description) values (2,'¿En que cotinente se esta ubicado Ecuador?');
insert into question(IdLevel, description) values (2,'¿Cuando acabo la segunda guerra mundial?');

insert into question(IdLevel, description) values (3,' ¿Quién es el padre del psicoanálisis?');
insert into question(IdLevel, description) values (3,'¿En qué año comenzó la II Guerra Mundial?');
insert into question(IdLevel, description) values (3,'Si 50 es el 100%, ¿cuánto es el 90%?');
insert into question(IdLevel, description) values (3,'¿Cómo se llama el himno nacional de Francia?');
insert into question(IdLevel, description) values (3,'¿Quién va a la cárcel?');

insert into question(IdLevel, description) values (4,' ¿Cómo se llama la estación espacial rusa?');
insert into question(IdLevel, description) values (4,'¿Qué era el Concorde?');
insert into question(IdLevel, description) values (4,'¿A qué país pertenece la ciudad de Varsovia?');
insert into question(IdLevel, description) values (4,'¿Qué día celebran los cristianos la festividad de la Epifanía de Jesús?');
insert into question(IdLevel, description) values (4,'¿En qué año se aprobó la actual Constitución española?');

insert into question(IdLevel, description) values (5,'¿Cuándo empezó la Revolución Rusa?');
insert into question(IdLevel, description) values (5,'¿Cuál es la luna más grande de Saturno?');
insert into question(IdLevel, description) values (5,'¿Cuántas notas musicales existen?');
insert into question(IdLevel, description) values (5,'¿Cuándo se inventó la imprenta?');
insert into question(IdLevel, description) values (5,'Si elevas cualquier número a 0, ¿qué resultado obtienes siempre?');


----Creacion de tabla option

insert into options(IdQuestion, correctAnswer, opt) values (1,true,'dulce, amargo, ácido, salado y umami');
insert into options(IdQuestion, correctAnswer, opt) values (1, false,'dulce, amargo, picante, salado, azucarado');
insert into options(IdQuestion, correctAnswer, opt) values (1, false,'dulce, amargo, umami, salado, azucarado');
insert into options(IdQuestion, correctAnswer, opt) values (1, false,'dulce, amargo, umami, salado, picante');
insert into options(IdQuestion, correctAnswer, opt) values (2, false,'Odiseo');
insert into options(IdQuestion, correctAnswer, opt) values (2, false,'Hugo');
insert into options(IdQuestion, correctAnswer, opt) values (2, true,'Homero');
insert into options(IdQuestion, correctAnswer, opt) values (2, false,'Ulises');
insert into options(IdQuestion, correctAnswer, opt) values (3, false,'Isabella II');
insert into options(IdQuestion, correctAnswer, opt) values (3, false,'Isabel I');
insert into options(IdQuestion, correctAnswer, opt) values (3, true,'Isabel II');
insert into options(IdQuestion, correctAnswer, opt) values (3, false,'Isa I');
insert into options(IdQuestion, correctAnswer, opt) values (4, false,'Ave');
insert into options(IdQuestion, correctAnswer, opt) values (4, false,'Ave');
insert into options(IdQuestion, correctAnswer, opt) values (4, false,'Reptil');
insert into options(IdQuestion, correctAnswer, opt) values (4, false,'Anfibio');
insert into options(IdQuestion, correctAnswer, opt) values (5, true,'Mamifero');
insert into options(IdQuestion, correctAnswer, opt) values (5, false,'Black in Black');
insert into options(IdQuestion, correctAnswer, opt) values (5, true,'Thriller');
insert into options(IdQuestion, correctAnswer, opt) values (5, false,'The dark side of the moon');
insert into options(IdQuestion, correctAnswer, opt) values (6, false,'Despacito');
insert into options(IdQuestion, correctAnswer, opt) values (6, true,'La Antartida');
insert into options(IdQuestion, correctAnswer, opt) values (6, false,'El polo norte');
insert into options(IdQuestion, correctAnswer, opt) values (6, false,'El polo sur');
insert into options(IdQuestion, correctAnswer, opt) values (7, true,'Ulan Bator');
insert into options(IdQuestion, correctAnswer, opt) values (7, false,'Darjan');
insert into options(IdQuestion, correctAnswer, opt) values (7, false,'Hovd');
insert into options(IdQuestion, correctAnswer, opt) values (7, false,'Erdenet');
insert into options(IdQuestion, correctAnswer, opt) values (8, false,'Nilo');
insert into options(IdQuestion, correctAnswer, opt) values (8, true,'Amazonas');
insert into options(IdQuestion, correctAnswer, opt) values (8, false,'Pacifico');
insert into options(IdQuestion, correctAnswer, opt) values (8, false,'Orinoco');
insert into options(IdQuestion, correctAnswer, opt) values (9, false,'Asia');
insert into options(IdQuestion, correctAnswer, opt) values (9, true,'America');
insert into options(IdQuestion, correctAnswer, opt) values (9, false,'Africa');
insert into options(IdQuestion, correctAnswer, opt) values (9, false,'Europa');
insert into options(IdQuestion, correctAnswer, opt) values (10, false,'1847');
insert into options(IdQuestion, correctAnswer, opt) values (10, true,'1845');
insert into options(IdQuestion, correctAnswer, opt) values (10, false,'1846');
insert into options(IdQuestion, correctAnswer, opt) values (10, false,'1855');
insert into options(IdQuestion, correctAnswer, opt) values (11, false,'wiliam James');
insert into options(IdQuestion, correctAnswer, opt) values (11, true,'sIgmund Freud');
insert into options(IdQuestion, correctAnswer, opt) values (11, false,'wilhelm Wundt');
insert into options(IdQuestion, correctAnswer, opt) values (11, false,'Ninguno de lo anteriores');
insert into options(IdQuestion, correctAnswer, opt) values (12, false,'1840');
insert into options(IdQuestion, correctAnswer, opt) values (12, false,'1845');
insert into options(IdQuestion, correctAnswer, opt) values (12, false,'1854');
insert into options(IdQuestion, correctAnswer, opt) values (12, true,'1839');
insert into options(IdQuestion, correctAnswer, opt) values (13, false,'45');
insert into options(IdQuestion, correctAnswer, opt) values (13, false,'59');
insert into options(IdQuestion, correctAnswer, opt) values (13, true,'40');
insert into options(IdQuestion, correctAnswer, opt) values (13, false,'55');
insert into options(IdQuestion, correctAnswer, opt) values (14, false,'Maseye');
insert into options(IdQuestion, correctAnswer, opt) values (14, true,'Marsellesa');
insert into options(IdQuestion, correctAnswer, opt) values (14, false,'Masrseleza');
insert into options(IdQuestion, correctAnswer, opt) values (14, false,'Mesyza');
insert into options(IdQuestion, correctAnswer, opt) values (15, false,'Acusado');
insert into options(IdQuestion, correctAnswer, opt) values (15, true,'Condenado');
insert into options(IdQuestion, correctAnswer, opt) values (15, false,'Imputado');
insert into options(IdQuestion, correctAnswer, opt) values (15, false,'Abogado');
insert into options(IdQuestion, correctAnswer, opt) values (16, true,'Mir');
insert into options(IdQuestion, correctAnswer, opt) values (16, false,'Miri');
insert into options(IdQuestion, correctAnswer, opt) values (16, false,'Mar');
insert into options(IdQuestion, correctAnswer, opt) values (16, false,'Muri');
insert into options(IdQuestion, correctAnswer, opt) values (17, true,'Un avion');
insert into options(IdQuestion, correctAnswer, opt) values (17, false,'Un submarion');
insert into options(IdQuestion, correctAnswer, opt) values (17, false,'Un transformer');
insert into options(IdQuestion, correctAnswer, opt) values (17, false,'Un carro');
insert into options(IdQuestion, correctAnswer, opt) values (18, false,'Rumania');
insert into options(IdQuestion, correctAnswer, opt) values (18, false,'Republica Cheka');
insert into options(IdQuestion, correctAnswer, opt) values (18, true,'Polonia');
insert into options(IdQuestion, correctAnswer, opt) values (18, false,'Hungria');
insert into options(IdQuestion, correctAnswer, opt) values (19, false,'8 de febrero');
insert into options(IdQuestion, correctAnswer, opt) values (19, true,'6 de enero');
insert into options(IdQuestion, correctAnswer, opt) values (19, false,'12 de enero');
insert into options(IdQuestion, correctAnswer, opt) values (19, false,'7 de marzo');
insert into options(IdQuestion, correctAnswer, opt) values (20, true,'1878');
insert into options(IdQuestion, correctAnswer, opt) values (20, false,'1875');
insert into options(IdQuestion, correctAnswer, opt) values (20, false,'1845');
insert into options(IdQuestion, correctAnswer, opt) values (20, false,'1900');
insert into options(IdQuestion, correctAnswer, opt) values (21, true,'1816');
insert into options(IdQuestion, correctAnswer, opt) values (21, false,'1806');
insert into options(IdQuestion, correctAnswer, opt) values (21, false,'1808');
insert into options(IdQuestion, correctAnswer, opt) values (21, false,'1810');
insert into options(IdQuestion, correctAnswer, opt) values (22, true,'Titan');
insert into options(IdQuestion, correctAnswer, opt) values (22, false,'Mimas');
insert into options(IdQuestion, correctAnswer, opt) values (22, false,'Tetis');
insert into options(IdQuestion, correctAnswer, opt) values (22, false,'Pan');
insert into options(IdQuestion, correctAnswer, opt) values (23, false,'11');
insert into options(IdQuestion, correctAnswer, opt) values (23, true,'12');
insert into options(IdQuestion, correctAnswer, opt) values (23, false,'6');
insert into options(IdQuestion, correctAnswer, opt) values (23, false,'4');
insert into options(IdQuestion, correctAnswer, opt) values (24, true,'1840');
insert into options(IdQuestion, correctAnswer, opt) values (24, false,'1843');
insert into options(IdQuestion, correctAnswer, opt) values (24, false,'1700');
insert into options(IdQuestion, correctAnswer, opt) values (24, false,'1844');
insert into options(IdQuestion, correctAnswer, opt) values (25, true,'1');
insert into options(IdQuestion, correctAnswer, opt) values (25, false,'0');
insert into options(IdQuestion, correctAnswer, opt) values (25, false,'el mismo numero elevado');
insert into options(IdQuestion, correctAnswer, opt) values (25, false,'100');






