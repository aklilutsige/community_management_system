
CREATE TABLE "user" (
    user_name varchar ,
    user_password varchar ,
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    CONSTRAINT user_pkey PRIMARY KEY (id)
);