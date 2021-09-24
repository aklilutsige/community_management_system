ALTER TABLE public."user"
    RENAME locked TO user_locked;

ALTER TABLE public."user"
    RENAME enabled TO user_enabled;
INSERT INTO public."user" (first_name, last_name, user_role, user_name, user_email, user_password, user_locked, user_enabled)
VALUES ('aklilu', 'Tsige', 'ADMIN', 'aki','aklilu.tsige@gmail.com','admin', false, true),
       ('Tegest','Genene', 'USER', 'Tg','tegest.genene@gmail.com', 'user', false, true);