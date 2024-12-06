create table books
(
    uuid  binary(16) not null,
    title varchar(255),
    primary key (uuid)
) engine=InnoDB