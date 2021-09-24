ALTER TABLE public."user"
    RENAME user_name TO user_email;

ALTER TABLE public."user"
    ADD COLUMN user_name character varying;

ALTER TABLE public."user"
    ADD COLUMN user_role character varying;

ALTER TABLE public."user"
    ADD COLUMN locked boolean;

ALTER TABLE public."user"
    ADD COLUMN enabled boolean;