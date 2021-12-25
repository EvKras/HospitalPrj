create database Hospitaldb;

CREATE TABLE Therapists
(
Id SERIAL PRIMARY KEY,
	Name CHARACTER VARYING(30),
	Surname CHARACTER VARYING(30),
	Role CHARACTER VARYING(30)
);

CREATE TABLE Profile
(
	Id SERIAL PRIMARY KEY,
	Name CHARACTER VARYING(30),
	Surname CHARACTER VARYING(30),
	Sex CHARACTER VARYING(30),
	Age INTEGER	
);

CREATE TABLE Patients(
	Id Serial PRIMARY KEY,
	Status CHARACTER VARYING(30),
	Diagnosis CHARACTER VARYING(200),
	Treatments CHARACTER VARYING(200)
);

CREATE TABLE Hospital(
	description CHARACTER VARYING(300)
	
);

create table Ptot(
ProfileId INTEGER,
TherapistId INTEGER,
FOREIGN KEY (ProfileId) references Profile(Id),
foreign key (TherapistId) references Therapists(Id)
);

