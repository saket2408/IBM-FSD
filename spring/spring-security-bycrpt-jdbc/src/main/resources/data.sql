insert into users (username, password, enabled) values ('bob', '$2a$10$qSLG75WwzUbTU98Po6Iipu9aDusI5LFleaup80Im1Uo5BVkhQGcuO', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

insert into users (username, password, enabled) values ('sara', '$2a$10$muysGr.GgaooG/K14GEqlOAZvxD5cMXlWUZ/N/tpiB3Sbz8/39i3.',true);
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');
