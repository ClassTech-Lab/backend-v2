create extension if NOT EXISTS "uuid-ossp";
insert into public.tool (id, name)
values (uuid_generate_v4(), 'tool 1'),
(uuid_generate_v4(), 'tool 2');