INSERT INTO customer (name, email, document_type, document_number, phone_number)
VALUES ('Juan Perez', 'juan.perez@mail.com', 'DNI', 12345678, 5491155555555);

INSERT INTO customer (name, email, document_type, document_number, phone_number)
VALUES ('Maria Gomez', 'maria.gomez@mail.com', 'DNI', 87654321, 5491166666666);

INSERT INTO customer (name, email, document_type, document_number, phone_number)
VALUES ('Carlos López', 'carlos.lopez@mail.com', 'Pasaporte', 987654321, NULL);

INSERT INTO methodology_de (type)
VALUES ('Análisis de sólidos totales en agua');
INSERT INTO methodology_de (type)
VALUES ('Determinación de pH en muestras de barro');
INSERT INTO methodology_de (type)
VALUES ('Medición de conductividad eléctrica en agua');
INSERT INTO methodology_de (type)
VALUES ('Análisis de metales pesados en agua');
INSERT INTO methodology_de (type)
VALUES ('Determinación de sulfatos en barro');
INSERT INTO methodology_de (type)
VALUES ('Análisis microbiológico de muestras de agua');
INSERT INTO methodology_de (type)
VALUES ('Determinación de materia orgánica en suelo');
INSERT INTO methodology_de (type)
VALUES ('Análisis de nitratos en agua');

INSERT INTO resolution (nombre_resolucion, parametro, unit, limite)
VALUES ('Resolución 1', 'pH en agua', 'Unidades de pH', '6.5 - 8.5');

INSERT INTO resolution (nombre_resolucion, parametro, unit, limite)
VALUES ('Resolución 2', 'Conductividad eléctrica en agua', 'µS/cm', '< 1500');

INSERT INTO resolution (nombre_resolucion, parametro, unit, limite)
VALUES ('Resolución 3', 'Sólidos totales disueltos en agua', 'mg/L', '< 500');

INSERT INTO resolution (nombre_resolucion, parametro, unit, limite)
VALUES ('Resolución 4', 'Metales pesados en agua (Plomo)', 'mg/L', '< 0.01');

INSERT INTO resolution (nombre_resolucion, parametro, unit, limite)
VALUES ('Resolución 5', 'Sulfatos en suelo', 'mg/kg', '< 1000');

INSERT INTO sample (id_procolo, id_customer, reception_date)
VALUES (101, 1, '2024-09-29');

INSERT INTO sample (id_procolo, id_customer, reception_date)
VALUES (102, 2, '2024-09-28');

INSERT INTO sample (id_procolo, id_customer, reception_date)
VALUES (103, 3, '2024-09-27');

INSERT INTO unit (unit)
VALUES ('mg/L');

INSERT INTO unit (unit)
VALUES ('µS/cm');

INSERT INTO unit (unit)
VALUES ('Unidades de pH');

INSERT INTO unit (unit)
VALUES ('mg/kg');

INSERT INTO unit (unit)
VALUES ('%');

INSERT INTO unit (unit)
VALUES ('g/L');
