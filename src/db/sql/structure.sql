CREATE
DATABASE if not EXISTS miniShop CHARACTER set utf8 COLLATE utf8_general_ci;

USE
miniShop;

CREATE TABLE permissions
(
    id         int          not null auto_increment PRIMARY key,
    title_fa   VARCHAR(200) not null,
    title_en   VARCHAR(200) not null,
    created_at TIMESTAMP    not null DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP null DEFAULT null
) ENGINE = INNODB;

CREATE TABLE roles
(
    id         int          not null auto_increment PRIMARY key,
    title_fa   VARCHAR(200) not null,
    title_en   VARCHAR(200) not null,
    created_at TIMESTAMP    not null DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP null DEFAULT null
) ENGINE = INNODB;

CREATE table permission_role
(
    id            int       not null auto_increment PRIMARY key,
    permission_id int       not null,
    role_id       int       not null,
    created_at    TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
    INDEX         permission_role_permission_index(permission_id),
    INDEX         permission_role_role_index(role_id),
    CONSTRAINT permission_role_permission_fk foreign key (permission_id) REFERENCES permissions (id) on UPDATE CASCADE on delete CASCADE,
    CONSTRAINT permission_role_role_fk foreign key (role_id) REFERENCES roles (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;


CREATE table users
(
    id          int          not null auto_increment PRIMARY key,
    name        VARCHAR(200),
    family      VARCHAR(200),
    ncode       VARCHAR(10),
    username    VARCHAR(200) not null UNIQUE key,
    phoneNumber VARCHAR(11)  not null UNIQUE key,
    email       VARCHAR(200),
    pass        text         not null,
    isactive    ENUM('yes','no') DEFAULT 'yes',
    lastLogin   TIMESTAMP             DEFAULT null,
    created_at  TIMESTAMP    not null DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP null DEFAULT null,
    deleted_at  TIMESTAMP null DEFAULT null,
    index       users_username_index(username),
    index       users_phone_index(phoneNumber)
)ENGINE = INNODB;

CREATE TABLE addresses
(
    id         int       not null auto_increment PRIMARY key,
    address    text      not null,
    zipcode    VARCHAR(20),
    lat        FLOAT,
    lng        FLOAT,
    user_id    int,
    created_at TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP null DEFAULT null,
    index      addresses_users_index(user_id),
    CONSTRAINT address_user_fk FOREIGN key (user_id) REFERENCES users (id) on UPDATE CASCADE on DELETE CASCADE
) ENGINE = INNODB;

CREATE table role_user
(
    id         int       not null auto_increment PRIMARY key,
    role_id    int       not null,
    user_id    int       not null,
    created_at TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
    INDEX      role_users_role_index(role_id),
    INDEX      role_user_users_index(user_id),
    CONSTRAINT role_users_role_fk foreign key (role_id) REFERENCES roles (id) on UPDATE CASCADE on delete CASCADE,
    CONSTRAINT role_user_users_fk foreign key (user_id) REFERENCES users (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;


CREATE TABLE categories
(
    id          int          not null auto_increment PRIMARY key,
    parent_id   int,
    name        VARCHAR(200) not null,
    haschild    boolean,
    child_count int,
    depth       int,
    isactive    enum('yes','no') DEFAULT 'yes',
    created_at  TIMESTAMP    not null DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP null DEFAULT null,
    deleted_at  TIMESTAMP null DEFAULT null,
    index       categories_categories_index(parent_id),
    CONSTRAINT categories_categories_fk foreign key (parent_id) REFERENCES categories (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;

CREATE TABLE products
(
    id          int            not null auto_increment PRIMARY key,
    category_id int            not null,
    name        VARCHAR(200)   not null,
    pcode       VARCHAR(50),
    quantity    int            not null,
    price       DECIMAL(15, 2) not null DEFAULT 0.00,
    isactive    enum('yes','no') DEFAULT 'yes',
    description text,
    created_at  TIMESTAMP      not null DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP null DEFAULT null,
    deleted_at  TIMESTAMP null DEFAULT null,
    index       products_categories_index(category_id),
    index       prdoucts_name_index(name),
    CONSTRAINT products_categories_fk foreign key (category_id) REFERENCES categories (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;

CREATE TABLE attributes
(
    id          int       not null auto_increment PRIMARY key,
    title       VARCHAR(200),
    category_id int       not null,
    created_at  TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP null DEFAULT null,
    deleted_at  TIMESTAMP null DEFAULT null,
    index       attributes_categories_index(category_id),
    CONSTRAINT attributes_categories_fk foreign key (category_id) REFERENCES categories (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;

CREATE TABLE attrValues
(
    id           int       not null auto_increment PRIMARY key,
    val          VARCHAR(200),
    attribute_id int       not null,
    product_id   int       not null,
    created_at   TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP null DEFAULT null,
    deleted_at   TIMESTAMP null DEFAULT null,
    index        attrValues_attributes_index(attribute_id),
    index        attrValues_products_index(product_id),
    CONSTRAINT attrValues_attributes_fk foreign key (attribute_id) REFERENCES attributes (id) on UPDATE CASCADE on delete CASCADE,
    CONSTRAINT attrValues_products_fk foreign key (product_id) REFERENCES products (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;


CREATE TABLE orders
(
    id          int          not null auto_increment PRIMARY key,
    user_id     int          not null,
    ordernumber VARCHAR(200) not null UNIQUE key,
    description text,
    orderStatus ENUM('pending','inprocess','ready','send','deliver') DEFAULT 'pending',
    total       DECIMAL(15, 2)        DEFAULT 0.00,
    created_at  TIMESTAMP    not null DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP null DEFAULT null,
    deleted_at  TIMESTAMP null DEFAULT null,
    index       orders_users_index(user_id),
    CONSTRAINT orders_users_fk foreign key (user_id) REFERENCES users (id) on UPDATE CASCADE on delete CASCADE
)ENGINE = INNODB;

CREATE TABLE orderdetials
(
    id             int          not null auto_increment PRIMARY key,
    order_id       int          not null,
    product_id     int          not null,
    price          DECIMAL(15, 2)        DEFAULT 0.00,
    takhfif        DECIMAL(15, 2)        DEFAULT 0.00,
    darsad_takhfif int,
    quantity       int,
    ref_num        VARCHAR(100) not null,
    dargahname     VARCHAR(100) not null,
    created_at     TIMESTAMP    not null DEFAULT CURRENT_TIMESTAMP,
    updated_at     TIMESTAMP null DEFAULT null,
    deleted_at     TIMESTAMP null DEFAULT null,
    index          orderdetials_orders_index(order_id),
    index          orderdetials_products_index(product_id),
    CONSTRAINT orderdetials_orders_fk foreign key (order_id) REFERENCES orders (id) on UPDATE CASCADE on delete CASCADE,
    CONSTRAINT orderdetials_products_fk foreign key (product_id) REFERENCES products (id) on UPDATE CASCADE on delete CASCADE
) ENGINE = INNODB;
