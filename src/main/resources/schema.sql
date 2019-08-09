-- tables

-- Table: category
CREATE TABLE categories (
    id integer  NOT NULL,
    name varchar(255)  NOT NULL,
    parent_category_id int  NULL,
    PRIMARY KEY (id)
);

-- Table: product
CREATE TABLE products (
    id integer  NOT NULL,
    category_id int  NOT NULL,
    name varchar(255)  NOT NULL,
    PRIMARY KEY (id)
);

-- foreign keys
-- Reference: products_categories_product (table: products)
ALTER TABLE products
    ADD FOREIGN KEY (category_id)
    REFERENCES categories (id);

-- Reference: product_category_product_category (table: category)
ALTER TABLE categories
    ADD FOREIGN KEY (parent_category_id)
    REFERENCES categories (id);