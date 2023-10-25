create schema if not exists myhomework;

create table if not exists myhomework.customers (
                                      id serial primary key unique,
                                      name varchar(255) not null,
                                      surname varchar(255) not null,
                                      age int,
                                      phone_number varchar(50)
);

create table if not exists myhomework.orders (
                                   id serial primary key unique,
                                   date date not null,
                                   customer_id int not null references myhomework.customers (id),
                                   product_name varchar(255) not null,
                                   amount numeric not null
);