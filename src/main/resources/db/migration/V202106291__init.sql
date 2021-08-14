CREATE TABLE product_detail
(
    id              BIGSERIAL PRIMARY KEY,
    exp_date        DATE,
    created_date    BIGINT,
    other           VARCHAR(255)
);
CREATE TABLE product
(
    id                BIGSERIAL PRIMARY KEY,
    name              VARCHAR(255),
    created_date      TIMESTAMP,
    product_detail_id BIGINT,
    CONSTRAINT product_detail_fk FOREIGN KEY (product_detail_id) references product_detail
);

