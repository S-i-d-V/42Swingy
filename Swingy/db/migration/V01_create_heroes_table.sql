CREATE TABLE heroes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    hero_class VARCHAR(255) NOT NULL,
    level INT NOT NULL,
    experience INT NOT NULL,
    attack INT NOT NULL,
    defense INT NOT NULL,
    hit_points INT NOT NULL
);