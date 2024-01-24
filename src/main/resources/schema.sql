CREATE TABLE CUSTOMER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    document_type VARCHAR(8) NOT NULL,
    document_number INT NOT NULL,
    phone_number INT,
    UNIQUE KEY unique_document (document_type, document_number)
);


CREATE TABLE RESOLUTION (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOMBRE_RESOLUCION VARCHAR(50) NOT NULL,
    PARAMETRO VARCHAR(50) NOT NULL,
    UNIT VARCHAR(50) NOT NULL,
    LIMITE VARCHAR(50) NOT NULL
);

CREATE TABLE UNIT (
                      ID INT PRIMARY KEY AUTO_INCREMENT,
                      UNIT VARCHAR(255) NOT NULL
);


CREATE TABLE SAMPLE (
                                 ID INT PRIMARY KEY AUTO_INCREMENT,
                                 ID_PROCOLO INT,
                                 ID_CUSTOMER INT,
                                 TYPE VARCHAR(255),
                                 SAMPLE VARCHAR(255),
                                 RECEPTION_DATE DATE
);