insert into users(id, name, family, phoneNumber, username, pass)
values (1, 'admin', 'admin', 'admin', '09121234567', '123'),
       (2, 'ghasem', 'khosravi', 'gkh', '09121234568', '123');

insert into role_user (role_id, user_id)
values (1, 1),
       (3, 2);