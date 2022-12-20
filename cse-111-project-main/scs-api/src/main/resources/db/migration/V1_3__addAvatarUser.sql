-- https://api.multiavatar.com/{random_value}.svg
-- Keep in mind that each result is unique and will never change

ALTER TABLE user
ADD COLUMN avatar_url varchar(50);