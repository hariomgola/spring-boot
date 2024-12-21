-- Customer table and all data insertion
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

-- Employee table and all data insertion
CREATE TABLE Employee (
    id BIGINT NOT NULL,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    userName VARCHAR(255) NOT NULL,
    emailid VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Employee (id, firstName, lastName, age, userName, emailid, address) 
VALUES
(1, 'Rushikesh', 'Karkhanis', 25, 'rushikesh_k', 'rushikesh.k@example.com', 'Navi Mumbai, Sanpada'),
(2, 'Aarju', 'Tripathi', 24, 'aarju_t', 'aarju.t@example.com', 'Pune, Hinjewadi'),
(3, 'Sachin', 'Tendulkar', 25, 'sachin_t', 'sachin.t@example.com', 'Mumbai, Bandra'),
(4, 'Nupur', 'Shah', 26, 'nupur_s', 'nupur.s@example.com', 'Nagpur, PremNagar'),
(5, 'Priyanka', 'Das', 25, 'priyanka_d', 'priyanka.d@example.com', 'Kolkata, Bangur'),
(6, 'Arvind', 'Patil', 30, 'arvind_p', 'arvind.p@example.com', 'Delhi, Vasant Kunj'),
(7, 'Simran', 'Singh', 28, 'simran_s', 'simran.s@example.com', 'Chandigarh, Sector 22'),
(8, 'Vikram', 'Bansal', 32, 'vikram_b', 'vikram.b@example.com', 'Gurgaon, MG Road'),
(9, 'Neha', 'Gupta', 27, 'neha_g', 'neha.g@example.com', 'Bangalore, Whitefield'),
(10, 'Rajesh', 'Kumar', 35, 'rajesh_k', 'rajesh.k@example.com', 'Hyderabad, Banjara Hills'),
(11, 'Kavita', 'Rathod', 29, 'kavita_r', 'kavita.r@example.com', 'Mumbai, Powai'),
(12, 'Mohan', 'Patel', 31, 'mohan_p', 'mohan.p@example.com', 'Surat, Adajan'),
(13, 'Ravi', 'Sharma', 28, 'ravi_s', 'ravi.s@example.com', 'Lucknow, Gomti Nagar'),
(14, 'Alok', 'Gupta', 33, 'alok_g', 'alok.g@example.com', 'Noida, Sector 62'),
(15, 'Isha', 'Mehta', 26, 'isha_m', 'isha.m@example.com', 'Ahmedabad, CG Road'),
(16, 'Sandeep', 'Verma', 34, 'sandeep_v', 'sandeep.v@example.com', 'Chennai, T Nagar'),
(17, 'Priya', 'Chopra', 30, 'priya_c', 'priya.c@example.com', 'Kolkata, Salt Lake'),
(18, 'Rohit', 'Kohli', 29, 'rohit_k', 'rohit.k@example.com', 'Delhi, Karol Bagh'),
(19, 'Ankita', 'Yadav', 27, 'ankita_y', 'ankita.y@example.com', 'Indore, MG Road'),
(20, 'Pooja', 'Sharma', 32, 'pooja_s', 'pooja.s@example.com', 'Jaipur, Malviya Nagar');

-- Student table and all student data
CREATE TABLE Student (
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    message VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Student (id, name, message, address) 
VALUES
(1, 'John Doe', 'Welcome to the class!', '123 Elm St, Springfield'),
(2, 'Jane Smith', 'Looking forward to learning.', '456 Oak St, Rivertown'),
(3, 'Emily Johnson', 'Excited for this semester!', '789 Pine St, Lakeside'),
(4, 'Michael Brown', 'Ready to start the journey.', '101 Maple St, Greenfield'),
(5, 'Sarah Lee', 'Let’s do our best!', '202 Birch St, Hilltop'),
(6, 'David White', 'Happy to be here!', '303 Cedar St, Mountainview'),
(7, 'Rachel Williams', 'Eager to learn more.', '404 Spruce St, Valleyview'),
(8, 'Chris Davis', 'Hoping for a great experience.', '505 Redwood St, Forestville'),
(9, 'Matthew Miller', 'Let’s achieve great things!', '606 Sequoia St, Seaview'),
(10, 'Olivia Taylor', 'Excited for the challenges ahead.', '707 Fir St, Brooktown');
