-- 1) Which user(s) joined were part of game but never answered a single question?
SELECT u.id
FROM user u
WHERE u.id NOT IN (SELECT u.id
                   FROM user u
                            JOIN user_answer ua ON ua.user_id = u.id
                            JOIN answer a ON a.id = ua.answer_id
                            JOIN game g ON g.id = a.game_id
                   WHERE g.id = 1);

-- 2) Get user information from a specific game id
SELECT *
FROM user u
         JOIN game_players gp ON u.id = gp.user_id
WHERE gp.game_id = 1;

-- # 3) Gives you all question topics in a game for a specific game id
SELECT *
FROM topic t
         JOIN question q ON q.topic_id = t.id
         JOIN game_question gq ON gq.question_id = q.id
WHERE gq.game_id = 1
GROUP BY t.name;

-- # 4) User with the most wins
SELECT u.id, u.ign, u.wins
FROM user u
GROUP BY u.id
HAVING MAX(wins)
ORDER BY wins DESC
LIMIT 1;



# 4) Which user placed 1st in game 1?
# 6) What was the average score in question 10?
# 2) Which users placed top 3 in game 1?
# 3) What was the average score of all contenders in game 1?
# 5) Which user had the lowest score in game 1?
# 6) What was the average score in question 10?
# 7) Which users answered questions 10 correctly?