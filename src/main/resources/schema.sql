CREATE TABLE customer_de (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    document_type VARCHAR(255) NOT NULL,
    document_number INT NOT NULL,
    phone_number INT,
    UNIQUE KEY unique_document (document_type, document_number)
);
