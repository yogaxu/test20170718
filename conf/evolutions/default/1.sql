# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table village_info (
  village_no                    integer auto_increment not null,
  village_name                  varchar(255),
  village_area                  double,
  total_building                integer not null,
  total_house                   integer not null,
  city_name                     varchar(255),
  thermal_company               varchar(255),
  property_company              varchar(255),
  property_company_contact      varchar(255),
  property_company_tel          varchar(255),
  village_address               varchar(255),
  constraint pk_village_info primary key (village_no)
);


# --- !Downs

drop table if exists village_info;

