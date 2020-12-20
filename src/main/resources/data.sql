create extension if NOT EXISTS "uuid-ossp";
insert into public.tool (id, name)
values (uuid_generate_v4(), 'tool 1'),
       (uuid_generate_v4(), 'tool 2');

insert into public.keyword (id, name)
values (uuid_generate_v4(), 'keyword 1'),
       (uuid_generate_v4(), 'keyword 2');