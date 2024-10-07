CREATE TABLE IF NOT EXISTS customer
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    name
    VARCHAR
(
    255
) NOT NULL,
    email VARCHAR
(
    255
),
    document_type VARCHAR
(
    50
) NOT NULL,
    document_number BIGINT NOT NULL,
    phone_number BIGINT
    );


CREATE TABLE methodology
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255) NOT NULL
);

CREATE TABLE resolution
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    resolution_name VARCHAR(255) NOT NULL,
    parameter       VARCHAR(255) NOT NULL,
    unit            VARCHAR(50)  NOT NULL,
    limit_column    VARCHAR(50)  NOT NULL
);

CREATE TABLE sample
(
    id             INT AUTO_INCREMENT PRIMARY KEY,
    id_protocol    INT,
    id_customer    INT,
    reception_date DATE
);

CREATE TABLE sample_detail
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    id_protocol   INT,
    determination VARCHAR(255),
    unit          VARCHAR(50),
    result        VARCHAR(255),
    allowed_limit VARCHAR(255),
    methodology   VARCHAR(255)
);

CREATE TABLE unit
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    unit VARCHAR(50) NOT NULL
);

