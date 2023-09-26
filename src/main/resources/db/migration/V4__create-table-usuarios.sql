CREATE TABLE usuarios (
                         id BIGINT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                         login VARCHAR(100) NOT NULL,
                         senha VARCHAR(255) NOT NULL
);
