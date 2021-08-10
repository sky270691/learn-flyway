
CREATE TABLE "user"
(
    id         BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255)
);

ALTER TABLE product ADD COLUMN user_id bigint;
ALTER TABLE proudct ADD CONSTRAINT user_fk foreign key (user_id) REFERENCES user;