CREATE database ligadb;

CREATE TABLE products (
    id  SERIAL NOT NULL,
    PRIMARY KEY (id),
    title VARCHAR (20)
);
CREATE TABLE product_characteristic (
    id SERIAL NOT NULL ,
    PRIMARY KEY (id),
    name VARCHAR (20),
    value INT
);

CREATE TABLE product_characteristics
(
  id    BIGINT           NOT NULL
    CONSTRAINT product_characteristics_pkey
    PRIMARY KEY,
  name  VARCHAR(255),
  value DOUBLE PRECISION NOT NULL
);
