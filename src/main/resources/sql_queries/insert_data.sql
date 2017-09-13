INSERT INTO products  (id,title)
VALUES(1,'iphone 8');

INSERT INTO products (id,title)
VALUES(2,'iphone 8 plus');

INSERT INTO products (id,title)
VALUES(3,'iphone 8 plus');

INSERT INTO products (id,title)
VALUES(4,'iphone 8 plus');

INSERT INTO products (id,title)
VALUES(5,'iphone 8 plus');

INSERT INTO product_characteristics (id,name, value)
VALUES(1,'diagonal', 5.5);

INSERT INTO product_characteristics (id,name, value)
VALUES(2,'weight', 128);

INSERT INTO product_characteristics (id,name, value)
VALUES(3,'high', 158);

INSERT INTO product_characteristics (id,name, value)
VALUES(4,'width',123);

INSERT INTO product_characteristics (id,name, value)
VALUES(5,'price', 700);

INSERT INTO product_characteristic (product_id, product_characteristics_id)
VALUES(2, 1);

INSERT INTO product_characteristic (product_id, product_characteristics_id)
VALUES(3, 1);

INSERT INTO product_characteristic (product_id, product_characteristics_id)
VALUES(1, 2);

INSERT INTO product_characteristic (product_id, product_characteristics_id)
VALUES(5, 4);

INSERT INTO product_characteristic (product_id, product_characteristics_id)
VALUES(2, 4);