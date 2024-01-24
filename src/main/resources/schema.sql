CREATE TABLE CUSTOMER (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100),
    DOCUMENT_TYPE VARCHAR(8) NOT NULL,
    DOCUMENT_NUMBER INT NOT NULL,
    PHONE_NUMBER INT,
    UNIQUE KEY unique_document (document_type, document_number)
);


CREATE TABLE RESOLUTION (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    RESOLUTION_NAME VARCHAR(50) NOT NULL,
    PARAMETER VARCHAR(50) NOT NULL,
    UNIT VARCHAR(50) NOT NULL,
    LIMITE VARCHAR(50) NOT NULL
);

CREATE TABLE UNIT (
                      ID INT PRIMARY KEY AUTO_INCREMENT,
                      UNIT VARCHAR(255) NOT NULL
);


CREATE TABLE SAMPLE (
                                 ID INT PRIMARY KEY AUTO_INCREMENT,
                                 ID_PROTOCOL INT,
                                 ID_CUSTOMER INT,
                                 TYPE VARCHAR(50),
                                 SAMPLE VARCHAR(50),
                                 RECEPTION_DATE DATE
);

CREATE TABLE METHODOLOGY (
                                 ID INT PRIMARY KEY,
                                 TYPE VARCHAR(70) NOT NULL
);