drop table if exists tool;
create table public.tool
(
    id   uuid primary key,
    name varchar unique not null
);

drop table if exists keyword;
create table public.keyword
(
    id   uuid primary key,
    name varchar unique not null
);

drop table if exists category;
create table public.category
(
    id   uuid primary key,
    name varchar unique not null
);
