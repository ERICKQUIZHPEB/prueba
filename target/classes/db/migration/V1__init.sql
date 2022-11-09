CREATE TABLE IF NOT EXISTS asistente(
    id SERIAL,
    nombre VARCHAR(10) ,
    email VARCHAR(100) NOT NULL,
    institucion VARCHAR(100),
    cargo VARCHAR(13),
    PRIMARY KEY (id),
    UNIQUE (email)
    );