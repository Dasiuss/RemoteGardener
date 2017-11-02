# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table section (
  id                            bigint auto_increment not null,
  start_hour                    integer not null,
  start_minute                  integer not null,
  day                           bigint not null,
  constraint pk_section primary key (id)
);


# --- !Downs

drop table if exists section;

