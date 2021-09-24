
CREATE TABLE "user" (
    user_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    CONSTRAINT user_pkey PRIMARY KEY (user_id),
    first_name varchar,
    last_name varchar,
    user_role varchar,
    user_name varchar,
    user_email varchar,
    user_password varchar,
    locked boolean,
    enabled boolean
);