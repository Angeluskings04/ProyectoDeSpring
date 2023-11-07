USE springDB;

CREATE TABLE inventario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    acquisition_date DATE,
    expiration_date DATE,
    stock INT,
    comments_additional TEXT,
    providers_name TEXT,
    type_of_measure CHAR(2)
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellido_paterno VARCHAR(255),
    apellido_materno VARCHAR(255),
    correo VARCHAR(255)
);
