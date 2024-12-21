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
(1, 'John Doe', 'Excited to start the semester!', '123 Elm St, Springfield'),
(2, 'Jane Smith', 'Looking forward to learning new things.', '456 Oak St, Rivertown'),
(3, 'Emily Johnson', 'Ready for the challenges ahead!', '789 Pine St, Lakeside'),
(4, 'Michael Brown', 'Let’s achieve great things together!', '101 Maple St, Greenfield'),
(5, 'Sarah Lee', 'Determined to succeed this semester.', '202 Birch St, Hilltop'),
(6, 'David White', 'Happy to be part of this course!', '303 Cedar St, Mountainview'),
(7, 'Rachel Williams', 'Excited to meet new friends and learn.', '404 Spruce St, Valleyview'),
(8, 'Chris Davis', 'Hoping for an amazing learning experience.', '505 Redwood St, Forestville'),
(9, 'Matthew Miller', 'Can’t wait to dive into the subject!', '606 Sequoia St, Seaview'),
(10, 'Olivia Taylor', 'Looking forward to the upcoming challenges.', '707 Fir St, Brooktown'),
(11, 'Daniel Harris', 'Eager to work hard and improve myself.', '808 Cedar St, Oakwood'),
(12, 'Sophia Martinez', 'I am here to make the most of this semester.', '909 Pine St, Riverview'),
(13, 'Jacob Wilson', 'Let’s make this semester the best one yet!', '111 Willow St, Rosewood'),
(14, 'Ava Thompson', 'I believe we can achieve great things together.', '212 Maple St, Kingsley'),
(15, 'Mason Robinson', 'Super excited to learn from great instructors.', '323 Birch St, Maplewood'),
(16, 'Isabella Clark', 'I’m excited to get to work and learn.', '434 Oak St, Birchwood'),
(17, 'James Lewis', 'Ready to get started and meet new people.', '545 Cedar St, Greenwood'),
(18, 'Amelia Walker', 'Excited to expand my knowledge in this field.', '656 Pine St, Hillcrest'),
(19, 'Ethan Allen', 'Looking forward to the intellectual challenges ahead.', '767 Redwood St, Sunset'),
(20, 'Harper King', 'Ready to take on new opportunities in this course.', '878 Fir St, Crestview'),
(21, 'Liam Perez', 'Looking forward to expanding my knowledge.', '989 Maple St, Windy Hill'),
(22, 'Noah Jackson', 'Ready to explore new ideas and perspectives.', '800 Oak St, Brookside'),
(23, 'Oliver Davis', 'Excited to collaborate with my peers.', '1010 Birch St, Greenhill'),
(24, 'Charlotte Anderson', 'I can’t wait to dive deeper into this field.', '2123 Cedar St, Lakeshore'),
(25, 'Amelia Robinson', 'I’m excited to grow as a person and a student.', '2324 Pine St, Summitville'),
(26, 'Isla Harris', 'Looking forward to making new connections and learning.', '3435 Redwood St, Riverside'),
(27, 'Aiden Moore', 'Excited for this course and what lies ahead!', '4546 Fir St, Valleywood'),
(28, 'Ella Garcia', 'Can’t wait to engage in insightful discussions.', '5657 Maple St, Riverbend'),
(29, 'James Thompson', 'Looking forward to learning from my instructors.', '6768 Cedar St, Fairview'),
(30, 'Mia Martinez', 'Excited to be part of this academic journey.', '7879 Oak St, Lakeside'),
(31, 'Benjamin Miller', 'Eager to improve and make meaningful progress.', '8980 Pine St, Brookstone'),
(32, 'Lucas Wilson', 'Ready for a fresh start and new challenges.', '10001 Redwood St, Riverton'),
(33, 'Harper Scott', 'I believe this course will be an amazing experience.', '11112 Birch St, Hillside'),
(34, 'Mason Lee', 'Excited to start working on hands-on projects.', '12223 Cedar St, Westfield'),
(35, 'Logan Perez', 'Looking forward to meeting new people and learning new things.', '13334 Pine St, Ashford'),
(36, 'Evelyn Harris', 'Ready to immerse myself in this subject and grow.', '14445 Fir St, Springfield'),
(37, 'Alexander Martinez', 'Hoping to learn a lot and develop my skills.', '15556 Oak St, Silverstone'),
(38, 'Zoe Clark', 'Can’t wait to be challenged in this class.', '16667 Redwood St, Northfield'),
(39, 'Ethan Robinson', 'Looking forward to getting started and being inspired.', '17778 Maple St, Clifftop'),
(40, 'Chloe Allen', 'Ready to face the challenges and opportunities ahead.', '18889 Cedar St, Crestwood'),
(41, 'Jacob Carter', 'Excited to push myself beyond my limits.', '19990 Pine St, Oak Grove'),
(42, 'Sophia Green', 'Looking forward to growing both academically and personally.', '20001 Fir St, Green Acres'),
(43, 'Jackson Walker', 'I’m ready to take on new challenges and achieve success.', '21112 Maple St, Pinehill'),
(44, 'Daniel Allen', 'Excited to make the most of every learning opportunity.', '22223 Cedar St, Sunnydale'),
(45, 'Scarlett Davis', 'Looking forward to exploring this subject in-depth.', '23334 Oak St, Golden Valley'),
(46, 'Oliver Harris', 'Can’t wait to start applying my knowledge in real-world scenarios.', '24445 Redwood St, Meadowbrook'),
(47, 'Charlotte Scott', 'Ready to make the most of this academic adventure.', '25556 Pine St, Silver Creek'),
(48, 'Amos Wilson', 'Excited to collaborate and grow with my peers.', '26667 Fir St, Stonebridge'),
(49, 'Grace Miller', 'Ready to engage in challenging coursework and learn new skills.', '27778 Maple St, West Ridge'),
(50, 'Henry Taylor', 'Looking forward to expanding my horizons through this class.', '28889 Cedar St, River Park');
