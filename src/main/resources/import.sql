CREATE SEQUENCE fruta_id_seq;

insert into Fruta (id, nome, quantidade) values (nextval('fruta_id_seq'), 'Banana', 10);
insert into Fruta (id, nome, quantidade) values (nextval('fruta_id_seq'), 'Maça', 6);
insert into Fruta (id, nome, quantidade) values (nextval('fruta_id_seq'), 'Pera', 7);