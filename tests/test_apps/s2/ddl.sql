
load classes procs.jar;

file -inlinebatch EOB

create table cities (
       id bigint not null primary key,
       name varchar(64),
       pt point not null,
       cellid bigint not null
);

create table states (
       id bigint not null primary key,
       name varchar(64)

);

create table cellid_state_map (
       cellid bigint not null,
       stateid bigint not null
);
create index cellid_st_idx on cellid_state_map(cellid);

create table counties (
       id bigint not null primary key,
       name varchar(64)
);

create table cellid_county_map (
       cellid bigint not null,
       stateid bigint not null
);
create index cellid_cty_idx on cellid_county_map(cellid);

create procedure from class s2demo.InsertPoint;
create procedure from class s2demo.InsertPolygon;

EOB
