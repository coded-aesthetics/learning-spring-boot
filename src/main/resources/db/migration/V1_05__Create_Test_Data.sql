INSERT INTO `person`
(id, first_name, last_name, address) values(1,"Mark", "Jameson", "Fieldway Drive 100");
INSERT INTO `person`
(id, first_name, last_name, address) values(2,"Jason", "Jameson", "Fieldway Drive 100");
INSERT INTO `person`
(id, first_name, last_name, address) values(3,"Mortimer", "Mortson", "Fieldway Drive 300");
INSERT INTO `demo`
(id, name) values (3, 'Demo 1');
INSERT INTO `demo`
(id, name) values (4, 'Demo 2');
INSERT INTO `participant`
(id, name, demo_id, person_id) values (1, "Mark", 3, 1);
INSERT INTO `participant`
(id, name, demo_id, person_id) values (2, "Jason", 3, 2);
INSERT INTO `participant`
(id, name, demo_id, person_id) values (3, "Mortimer", 4, 3);
INSERT INTO `participant`
(id, name, demo_id, person_id) values (4, "Ludwig", 4,2);
INSERT INTO `participant`
(id, name, demo_id, person_id) values (5, "Lysistrata", 4,3);