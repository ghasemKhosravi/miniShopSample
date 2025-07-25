insert into permissions (title_fa, title_en)
values ('نمایش کاربران', 'read_user'),
       ('افزودن کاربران', 'add_user'),
       ('ویرایش کاربران', 'edit_user'),
       ('حذف کاربران', 'delete_user'),
       ('نمایش محصولات', 'read_product'),
       ('افزودن محصولات', 'add_product'),
       ('ویرایش محصولات', 'edit_product'),
       ('حذف محصولات', 'delete_product'),
       ('نمایش دسته بندی', 'read_category'),
       ('افزودن دسته بندی', 'add_category'),
       ('ویرایش دسته بندی', 'edit_category'),
       ('حذف دسته بندی', 'delete_category'),
       ('نمایش سفارشات', 'read_order'),
       ('افزودن سفارشات', 'add_order'),
       ('ویرایش سفارشات', 'edit_order'),
       ('حذف سفارشات', 'delete_order');


insert into roles (title_fa, title_en)
values ('مدیرکل سیستم', 'sysAdmin'),
       ('مدیر فروش', 'selAdmin'),
       ('مشتری', 'customer');


insert into permission_role (permission_id, role_id)
values ('1', '1'),
       ('2', '1'),
       ('3', '1'),
       ('4', '1'),
       ('5', '1'),
       ('6', '1'),
       ('7', '1'),
       ('8', '1'),
       ('9', '1'),
       ('10', '1'),
       ('11', '1'),
       ('12', '1'),
       ('13', '1'),
       ('14', '1'),
       ('15', '1'),
       ('5', '1'),
       ('6', '2'),
       ('7', '2'),
       ('8', '2'),
       ('13', '2'),
       ('14', '2'),
       ('15', '2'),
       ('16', '2');
