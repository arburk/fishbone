Create Table if not exists fish (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    `name` VARCHAR(250) NOT NULL
);

INSERT INTO fish (`name`) VALUES
  ('Forelle'),
  ('Dorade'),
  ('Schwertfisch');
