CREATE TABLE `person` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);
ALTER TABLE `participant`
ADD COLUMN `person_id` INT NOT NULL AFTER `demo_id`;

ALTER TABLE `participant`
  ADD INDEX `person_idx` (`person_id` ASC);
ALTER TABLE `participant`
  ADD CONSTRAINT `persons`
FOREIGN KEY (`person_id`)
REFERENCES `person` (`id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
