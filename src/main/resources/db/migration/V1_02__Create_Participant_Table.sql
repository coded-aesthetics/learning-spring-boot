CREATE TABLE `participant` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(2048) NULL,
  `demo_id` INT NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `participant`
  ADD INDEX `participant_demo_idx` (`demo_id` ASC);
ALTER TABLE `participant`
  ADD CONSTRAINT `participant_demo`
FOREIGN KEY (`demo_id`)
REFERENCES `demo` (`id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

