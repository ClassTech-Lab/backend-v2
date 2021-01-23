-- ツール
drop table if exists public.tool;
create table public.tool
(
    id   uuid primary key,
    name varchar unique not null
);

-- キーワード
drop table if exists public.keyword;
create table public.keyword
(
    id   uuid primary key,
    name varchar unique not null
);

-- カテゴリ
drop table if exists public.category;
create table public.category
(
    id   uuid primary key,
    name varchar unique not null
);

-- 運営組織
-- 運営母体区分
drop table if exists public.school_organizations;
drop table if exists public.organization;
drop table if exists public.management_body;
create table public.management_body
(
    name varchar primary key
);

create table public.organization
(
    id                   uuid primary key,
    name                 varchar unique not null,
    management_body_name varchar        not null,
    foreign key (management_body_name) references public.management_body (name)
);

-- 学校
drop table if exists public.school;
create table public.school
(
    id   uuid primary key,
    name varchar not null
);

create table public.school_organizations
(
    school_id       uuid primary key,
    organization_id uuid    not null,
    name            varchar not null,
    foreign key (school_id) references public.school (id),
    foreign key (organization_id) references public.organization (id)
);