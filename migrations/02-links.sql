create table links
(
    id  bigint generated always as identity,
    url text not null,
    created_at timestamp with time zone not null,

    primary key (id),
    unique (url)
)
