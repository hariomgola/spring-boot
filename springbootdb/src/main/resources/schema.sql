create table customer 
(
	id bigint not null,
	name varchar(255) not null,
	username varchar(255) not null,
	emailid varchar(255) not null,
	primary key (id)

);

insert into customer(id,name,username,emailid) values (1,'hari','user_hari','email_hari');
insert into customer(id,name,username,emailid) values (2,'pooja','user_poojs','email_poojs');
insert into customer(id,name,username,emailid) values (3,'alok','user_alok','email_alok');
insert into customer(id,name,username,emailid) values (4,'aman','user_aman','email_aman');
insert into customer(id,name,username,emailid) values (5,'taski','user_taski','email_taski');