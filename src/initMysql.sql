

CREATE DATABASE IF NOT EXISTS weatherinfo;
use weatherinfo;

drop TABLE IF EXISTS weather;
CREATE TABLE weather(
  city VARCHAR(200) NOT NULL ,
  temperature INTEGER NOT NULL
);

INSERT INTO weather(city, temperature) VALUES ('Beijing',30);
INSERT INTO weather(city, temperature) VALUES ('Tianjin',31);
INSERT INTO weather(city, temperature) VALUES ('Guiyang',26);
INSERT INTO weather(city, temperature) VALUES ('Shanghai',35);
INSERT INTO weather(city, temperature) VALUES ('Guangzhou',39);
INSERT INTO weather(city, temperature) VALUES ('Dalian',30);

