INSERT INTO product (name,created_date)
VALUES ('Pepsodent','2021-02-01T09:08:00');
INSERT INTO product (name,created_date)
VALUES ('Formula','2021-02-01T09:08:00');

INSERT INTO product_detail (exp_date)
VALUES ('2023-03-01');
INSERT INTO product_detail (exp_date)
VALUES ('2024-03-02');

UPDATE product set product_detail_id=(SELECT id from product_detail where exp_date='2023-03-01') where id = 1;
UPDATE product set product_detail_id=(SELECT id from product_detail where exp_date='2024-03-02') where id = 2;
