/* This is a seeding script. It drops all data and re-creates the seeding set of data. */

/* 	To turn this off, just comment the following line on application.properties file:
 *	spring.datasource.initialization-mode=always
 */

-- Blow up all data
DELETE FROM Users;
DELETE FROM Customer;
DELETE FROM Trainer;
DELETE FROM Person;
DELETE FROM Exercise;
DELETE FROM ExerciseCategory;
DELETE FROM Measurement;
DELETE FROM Media;


-- Reset sequences
ALTER SEQUENCE Media_Id_Seq RESTART WITH 1;
ALTER SEQUENCE Person_Id_Seq RESTART WITH 1;
ALTER SEQUENCE Customer_Id_Seq RESTART WITH 1;
ALTER SEQUENCE Trainer_Id_Seq RESTART WITH 1;
ALTER SEQUENCE Users_Id_Seq RESTART WITH 1;
ALTER SEQUENCE Exercise_Id_Seq RESTART WITH 1;
ALTER SEQUENCE ExerciseCategory_Id_Seq RESTART WITH 1;
ALTER SEQUENCE Measurement_Id_Seq RESTART WITH 1;


-- Media
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person1.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person2.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person3.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person4.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person5.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person6.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person7.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person8.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person9.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person10.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person11.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person12.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/person13.jpg');

INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/cat_cardio.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/cat_flexibility.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/cat_power.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/cat_strenth.jpg');

INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_neck.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_hip.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_waist.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_right_biceps.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_left_biceps.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_right_femur.jpg');
INSERT INTO Media(Type, Url) VALUES (1, 'assets/images/msm_left_femur.jpg');


-- People
INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (111111111, 'Juan Perez', 0, '1982-12-01 06:00:00', 'Heredia', 'jperez@test.com', 83716251, 1);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (222222222, 'Jorge Lopez', 0, '1988-01-02 06:00:00', 'San Jose', 'jlopez@test.com', 81361529, 2);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (333333333, 'Maria Gutierrez', 1, '1983-06-28 06:00:00', 'San Jose', 'mgutierrez@test.com', 82745266, 3);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (444444444, 'Magdalena Torres', 1, '1990-03-03 06:00:00', 'Heredia', 'mtorres@test.com', 83516212, 4);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (555555555, 'Juan Calderon', 0, '1989-02-02 06:00:00', 'Cartago', 'jcalderon@test.com', 88391843, 5);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (666666666, 'Bryan Carrillo', 0, '1981-04-04 06:00:00', 'Limon', 'bcarrillo@test.com', 82690807, 6);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (777777777, 'Maria Aguilar', 1, '1983-06-06 06:00:00', 'Guanacaste', 'maguilar@test.com', 82746311, 7);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (888888888, 'Alberto Arguedas', 0, '1984-07-07 06:00:00', 'Heredia', 'aarguedas@test.com', 89371631, 8);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (999999999, 'Karla Davila', 1, '1982-08-08 06:00:00', 'Cartago', 'kdavila@test.com', 76254425, 9);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (123123123, 'Gabriela Matarrita', 1, '1981-08-08 06:00:00', 'Heredia', 'gmatarrita@test.com', 89123456, 10);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (234234234, 'Humberto Diaz', 0, '1992-11-21 06:00:00', 'Heredia', 'hdiaz@test.com', 82745361, 11);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (345345345, 'Marco Alfaro', 0, '1991-11-25 06:00:00', 'Alajuela', 'malfaro@test.com', 82822323, 12);

INSERT INTO Person(DocumentId, Name, Gender, BirthDay, Address, EmailAddress, PhoneNumber, MediaId)
VALUES (456456456, 'Gonzalo Gonzalez', 0, '1990-11-22 06:00:00', 'Alajuela', 'ggonzalez@test.com', 89172635, 13);


-- Customer
INSERT INTO Customer(PersonId, Status, Height)
VALUES (1, 0, 174);

INSERT INTO Customer(PersonId, Status, Height)
VALUES (2, 0, 165);

INSERT INTO Customer(PersonId, Status, Height)
VALUES (3, 1, 188);

INSERT INTO Customer(PersonId, Status, Height)
VALUES (4, 0, 184);

INSERT INTO Customer(PersonId, Status, Height)
VALUES (5, 2, 170);

INSERT INTO Customer(PersonId, Status, Height)
VALUES (6, 0, 178);


-- Trainer
INSERT INTO Trainer(PersonId, Status)
VALUES (7, 0);

INSERT INTO Trainer(PersonId, Status)
VALUES (8, 0);

INSERT INTO Trainer(PersonId, Status)
VALUES (9, 0);

INSERT INTO Trainer(PersonId, Status)
VALUES (10, 1);

INSERT INTO Trainer(PersonId, Status)
VALUES (11, 0);

INSERT INTO Trainer(PersonId, Status)
VALUES (12, 2);

INSERT INTO Trainer(PersonId, Status)
VALUES (13, 0);


-- Users
INSERT INTO Users(IdentityId, Type, PersonId)
VALUES ('google-oauth2|118418701597387882913', 0, null);

INSERT INTO Users(IdentityId, Type, PersonId)
VALUES ('google-oauth2|111051132364496930039', 1, 7);


-- Exercise Category
INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('Cardio', 'Physical exercise of low to high intensity that depends primarily on the aerobic energy-generating process', 0, 14);

INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('Flexibility', 'Stretching exercises that form a fundamental part of any exercise program', 0, 15);

INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('Power', 'Blah blah blah', 0, 16);

INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('Strenth', 'Physical exercises specializing in the use of resistance to induce muscular contraction', 0, 17);

INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('TestCategory 1', 'Test Description 1', 0, null);

INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('TestCategory 2', 'Test Description 2', 0, null);

INSERT INTO ExerciseCategory(Name, Description, Status, MediaId)
VALUES ('TestCategory 3', 'Test Description 3', 0, null);


-- Exercise
INSERT INTO Exercise(Name, Description, Status, ExerciseCategoryId, MediaId)
VALUES ('Bicycle', null, 0, 1, null);

INSERT INTO Exercise(Name, Description, Status, ExerciseCategoryId, MediaId)
VALUES ('Running', null, 0, 1, null);

INSERT INTO Exercise(Name, Description, Status, ExerciseCategoryId, MediaId)
VALUES ('Elliptical', null, 0, 1, null);

INSERT INTO Exercise(Name, Description, Status, ExerciseCategoryId, MediaId)
VALUES ('Stair Climber', null, 0, 1, null);

INSERT INTO Exercise(Name, Description, Status, ExerciseCategoryId, MediaId)
VALUES ('Swimming', null, 0, 1, null);

INSERT INTO Exercise(Name, Description, Status, ExerciseCategoryId, MediaId)
VALUES ('Rowing', null, 0, 1, null);


-- Measurement
INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Neck', null, 0, 18);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Chest', null, 0, null);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Hip', null, 0, 19);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Waist', null, 0, 20);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Right Forearm', null, 0, null);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Left Forearm', null, 0, null);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Right Biceps', null, 0, 21);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Left Biceps', null, 0, 22);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Right Femur', null, 0, 23);

INSERT INTO Measurement(Name, Description, Status, MediaId)
VALUES ('Left Femur', null, 0, 24);
