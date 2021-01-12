drop table if exists public.tool;
create table public.tool
(
    id   uuid primary key,
    name varchar unique not null
);

drop table if exists public.keyword;
create table public.keyword
(
    id   uuid primary key,
    name varchar unique not null
);

drop table if exists public.category;
create table public.category
(
    id   uuid primary key,
    name varchar unique not null
);

drop table if exists public.organization;
drop table if exists public.management_body;
create table public.management_body
(
    id   uuid primary key,
    name varchar unique not null
);

create table public.organization
(
    id                 uuid primary key,
    name               varchar unique not null,
    management_body_id uuid           not null,
    foreign key (management_body_id) references public.management_body (id)
);