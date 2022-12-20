CREATE TABLE `user`
(
    `id`         INT          NOT NULL AUTO_INCREMENT,
    `email`      VARCHAR(255) NOT NULL,
    `password`   VARCHAR(255) NOT NULL,
    `ign`        VARCHAR(50)  NOT NULL UNIQUE,
    `wins`       INT          NOT NULL DEFAULT 0,
    `losses`     INT          NOT NULL DEFAULT 0,
    `college_id` INT          NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE (`email`),
    UNIQUE (`ign`)
);

CREATE TABLE `college`
(
    `id`   INT          NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE (`name`)
);

ALTER TABLE `user`
    ADD CONSTRAINT `fk_user_college_id` FOREIGN KEY (college_id) REFERENCES
        `college` (`id`);

CREATE TABLE `game`
(
    `id`         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `started_at` TIMESTAMP NOT NULL,
    `ended_at`   TIMESTAMP,
    `status`     VARCHAR(25) NOT NULL DEFAULT 'PENDING'
);

CREATE TABLE `game_players`
(
    `game_id` INT NOT NULL,
    `user_id` INT NOT NULL,
    `score`   INT NOT NULL DEFAULT 0,
    CONSTRAINT `fk_game_players_game_id` FOREIGN KEY (`game_id`) REFERENCES `game` (`id`),
    CONSTRAINT `fk_game_players_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
);

CREATE TABLE `topic`
(
    `id`   INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(25)
);

CREATE TABLE `question`
(
    `id`           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `text`         LONGTEXT,
    `difficulty`   VARCHAR(25),
    `respond_time` INT NOT NULL DEFAULT 20,
    `topic_id`     INT,
    CONSTRAINT `fk_question_topic_id` FOREIGN KEY (`topic_id`) REFERENCES `topic` (`id`)
);

CREATE TABLE `game_question`
(
    `game_id`     INT NOT NULL,
    `question_id` INT NOT NULL,
    CONSTRAINT `fk_game_question_game_id` FOREIGN KEY (`game_id`) REFERENCES `game` (`id`),
    CONSTRAINT `fk_game_players_question_id` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`),
    UNIQUE (game_id, question_id)
);

CREATE TABLE `answer`
(
    `id`          INT     NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `text`        LONGTEXT,
    `is_answer`   TINYINT NOT NULL,
    `question_id` INT     NOT NULL,
    `game_id`     INT,
    CONSTRAINT `fk_answer_question_id` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`),
    CONSTRAINT `fk_answer_game_id` FOREIGN KEY (`game_id`) REFERENCES `game` (`id`)

);

CREATE TABLE `user_answer`
(
    `user_id`   INT NOT NULL,
    `answer_id` INT NOT NULL,
    CONSTRAINT `fk_user_answer_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
    CONSTRAINT `fk_user_answer_answer_id` FOREIGN KEY (`answer_id`) REFERENCES `answer` (`id`)
);
