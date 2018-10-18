CREATE TABLE users (
    emailid varchar(250) not null,
--  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(100) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
    password_hash varchar(500) not null,
    password_validated boolean default false,
    name varchar(500),
    address json,
    practice_name varchar(500),
    primary_user boolean,
  PRIMARY KEY (emailid),
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;