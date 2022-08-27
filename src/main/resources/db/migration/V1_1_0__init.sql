create table cat (id bigint not null, name varchar(255), primary key (id));
create table dog (id bigint not null, name varchar(255), primary key (id));
create table fish (id bigint not null, name varchar(255), primary key (id));
create table pet (id bigint not null, cat_id bigint, dog_id bigint, fish_id bigint, primary key (id));
alter table pet add constraint FK2awvtc2f7u757wns84jwm61c4 foreign key (cat_id) references cat;
alter table pet add constraint FKsfi44gfnejkty0pdj8r16lli5 foreign key (dog_id) references dog;
alter table pet add constraint FKnsp0pmkb3glgm0i9k2fq4xqp5 foreign key (fish_id) references fish;

create table GENERIC_PET (id bigint not null, name varchar(255), fish_id bigint, cat_id bigint, dog_id bigint, primary key (id));

alter table pet add constraint fk_fish_id foreign key (fish_id) references fish;
alter table pet add constraint fk_cat_id foreign key (cat_id) references cat;
alter table pet add constraint fk_dog_id foreign key (dog_id) references dog;