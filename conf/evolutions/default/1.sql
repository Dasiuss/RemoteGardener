# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table section (
  start_hour                    integer not null,
  start_minute                  integer not null,
  day                           bigint not null
);


# --- !Downs

drop table if exists section;

