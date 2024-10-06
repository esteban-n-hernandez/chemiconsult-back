INSERT INTO customer (name, email, document_type, document_number, phone_number)
VALUES ('Juan Perez', 'juan.perez@mail.com', 'DNI', 12345678, 5491155555555);

INSERT INTO customer (name, email, document_type, document_number, phone_number)
VALUES ('Maria Gomez', 'maria.gomez@mail.com', 'DNI', 87654321, 5491166666666);

INSERT INTO customer (name, email, document_type, document_number, phone_number)
VALUES ('Carlos Lopez', 'carlos.lopez@mail.com', 'DNI', 987654321, 543484333344);

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

INSERT INTO resolution (resolution_name, parameter, unit, limit_column)
VALUES ('Resolución 1', 'pH en agua', 'Unidades de pH', '6.5 - 8.5');

INSERT INTO resolution (resolution_name, parameter, unit, limit_column)
VALUES ('Resolución 2', 'Conductividad eléctrica en agua', 'µS/cm', '< 1500');

INSERT INTO resolution (resolution_name, parameter, unit, limit_column)
VALUES ('Resolución 3', 'Sólidos totales disueltos en agua', 'mg/L', '< 500');

INSERT INTO resolution (resolution_name, parameter, unit, limit_column)
VALUES ('Resolución 4', 'Metales pesados en agua (Plomo)', 'mg/L', '< 0.01');

INSERT INTO resolution (resolution_name, parameter, unit, limit_column)
VALUES ('Resolución 5', 'Sulfatos en suelo', 'mg/kg', '< 1000');

INSERT INTO sample (id_protocol, id_customer, reception_date)
VALUES (1, 12345678, '2024-09-29');

INSERT INTO sample (id_protocol, id_customer, reception_date)
VALUES (2, 87654321, '2024-09-28');

INSERT INTO sample (id_protocol, id_customer, reception_date)
VALUES (3, 87654321, '2024-09-27');

-- Insertar en SAMPLE_DETAIL
INSERT INTO SAMPLE_DETAIL (ID_PROTOCOL, DETERMINATION, UNIT, RESULT, ALLOWED_LIMIT, METHODOLOGY)
VALUES (1, 'Nitrógeno Total', 'mg/L', '5.0', '10.0', 'Método de Destilación'),
       (1, 'Fósforo Total', 'mg/L', '0.5', '1.0', 'Método Colorimétrico');

-- Insertar en SAMPLE_DETAIL
INSERT INTO SAMPLE_DETAIL (ID_PROTOCOL, DETERMINATION, UNIT, RESULT, ALLOWED_LIMIT, METHODOLOGY)
VALUES (2, 'Nitrógeno Total', 'mg/L', '5.0', '10.0', 'Método de Destilación'),
       (2, 'Fósforo Total', 'mg/L', '0.5', '1.0', 'Método Colorimétrico');



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
