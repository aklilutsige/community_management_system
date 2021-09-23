ALTER TABLE public."user"
    ALTER COLUMN user_name SET NOT NULL;

ALTER TABLE public."user"
    ALTER COLUMN user_password SET NOT NULL;

ALTER TABLE public."user"
    ALTER COLUMN first_name SET NOT NULL;