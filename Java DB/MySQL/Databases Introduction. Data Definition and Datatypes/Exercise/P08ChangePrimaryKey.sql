ALTER TABLE users
CHANGE COLUMN id id BIGINT(20) NOT NULL ,
DROP PRIMARY KEY;

ALTER TABLE users
ADD CONSTRAINT pk_users PRIMARY KEY (id, username);