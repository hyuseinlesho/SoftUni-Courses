ALTER TABLE `minions`
ADD COLUMN town_id INT NOT NULL;

ALTER TABLE `minions`
ADD CONSTRAINT fk_town_id
FOREIGN KEY (town_id) REFERENCES `towns`(`id`);