INSERT INTO college VALUES(1,'University of California, Merced');

INSERT INTO user VALUES (1,'alee364@ucmerced.edu', 'meooooww', 'buffSenpai', 10, 2, 1);
-- new additions (Nov 10,2022)
INSERT INTO user VALUES (2,'bobby23@ucmerced.edu', '12', 'Bobby', 0, 3, 1);
INSERT INTO user VALUES (3,'chris01@ucmerced.edu', '23', 'SeniorCluckers', 20, 3, 1);
INSERT INTO user VALUES (4,'adrian02@ucmerced.edu', '34', 'Adrian', 0, 5, 1);
INSERT INTO user VALUES (5,'charles03@ucmerced.edu', '45', 'Charles', 0, 0, 1);
INSERT INTO user VALUES (6,'angela04ucmerced.edu', '56', 'Angela', 2, 0, 1);
INSERT INTO user VALUES (7,'dory05@ucmerced.edu', '546', 'Dory', 0, 3, 1);
INSERT INTO user VALUES (8,'steven06@ucmerced.edu', 'c234', 'Steven', 4, 0, 1);
INSERT INTO user VALUES (9,'phien07@ucmerced.edu', 'c5251', 'Phien', 6, 1, 1);
INSERT INTO user VALUES (10,'dillion08@ucmerced.edu', 'c333', 'Dillion', 2, 1, 1);
-- player eugene did not answer any questions but attended game 1
INSERT INTO user VALUES (11,'euguene12@ucmerced.edu', '4d33', 'Eugene', 3, 3, 1);


INSERT INTO game VALUES (1,'2022-02-14 07:49:09','2022-02-14 08:00:00','FINISHED');

INSERT INTO topic VALUES (1,'Algorithms');
INSERT INTO topic VALUES (2,'Database System');

INSERT INTO question VALUES (1, 'When searching for a BST, what is the worst time complexity ?', 'EASY', 20, 1);
-- new additions(Nov 10,2022)
INSERT INTO question VALUES (2, 'What is an example of Linear data structures?', 'EASY', 20, 1);
INSERT INTO question VALUES (3, 'What is an example of Non-linear data structures?', 'EASY', 20, 1);
INSERT INTO question VALUES (4, 'What are various operations that can be performed on different Data Structures?', 'EASY', 20, 1);
INSERT INTO question VALUES (5, 'What does LIFO stand for?', 'EASY', 20, 1);
INSERT INTO question VALUES (6, 'What does FIFO stand for?', 'EASY', 20, 1);
INSERT INTO question VALUES (7, 'What is the time complexity: Number of comparison to sort N equal keys using standard quicksort?', 'MEDIUM', 20, 1);
INSERT INTO question VALUES (8, 'What is the time complexity: inorder BST', 'MEDIUM', 20, 2);
INSERT INTO question VALUES (9, 'What is the sorting process of bubble sort?', 'HARD', 20, 2);
INSERT INTO question VALUES (10, 'What is the fastest sorting method?', 'MEDIUM', 20, 2);

-- question 1
INSERT INTO answer VALUES (1,'O log(n)', 0, 1, 1);
INSERT INTO answer VALUES (2,'O (n)', 1, 1, 1);
INSERT INTO answer VALUES (3,'O nlog(n)', 0, 1, 1);
INSERT INTO answer VALUES (4,'O (n^2)', 0, 1, 1);
-- new additions(Nov 10,2022)
--  question 2
INSERT INTO answer VALUES (5,'Array', 0, 2, 1);
INSERT INTO answer VALUES (6,'Hash Maps', 0, 2, 1);
INSERT INTO answer VALUES (7,'Stacks and Queues', 0, 2, 1);
INSERT INTO answer VALUES (8,'Both A and C', 1, 2, 1);
--  question 3
INSERT INTO answer VALUES (9,'Tree', 1, 3, 1);
INSERT INTO answer VALUES (10,'Linked List', 0, 3, 1);
INSERT INTO answer VALUES (11,'Both A and B ', 0, 3, 1);
INSERT INTO answer VALUES (12,'None of the above', 0, 3, 1);
--  question 4
INSERT INTO answer VALUES (13,'Insertion', 0, 4, 1);
INSERT INTO answer VALUES (14,'Deletion', 0, 4, 1);
INSERT INTO answer VALUES (15,'Traversal', 0, 4, 1);
INSERT INTO answer VALUES (16,'All of the above', 1, 4, 1);
--  question 5
INSERT INTO answer VALUES (17,'Last in for out', 0, 5, 1);
INSERT INTO answer VALUES (18,'Last indication for ouput', 0, 5, 1);
INSERT INTO answer VALUES (19,'Last in first out', 1, 5, 1);
INSERT INTO answer VALUES (20,'None of the above', 0, 5, 1);
--  question 6
INSERT INTO answer VALUES (21,'First in first out', 0, 6, 1);
INSERT INTO answer VALUES (22,'First in last out ', 1, 6, 1);
INSERT INTO answer VALUES (23,'First in last output', 0, 6, 1);
INSERT INTO answer VALUES (24,'None of the above', 0, 6, 1);
--  question 7
INSERT INTO answer VALUES (25,'O(N)', 0, 7, 1);
INSERT INTO answer VALUES (26,'O(Log(N))', 0, 7, 1);
INSERT INTO answer VALUES (27,'O(NLog(N))', 1, 7, 1);
INSERT INTO answer VALUES (28,'O(N^2)', 0, 7, 1);
--  question 8
INSERT INTO answer VALUES (29,'O(N)', 1, 8, 1);
INSERT INTO answer VALUES (30,'O(Log(N))', 0, 8, 1);
INSERT INTO answer VALUES (31,'O(NLog(N)) ', 0, 8, 1);
INSERT INTO answer VALUES (32,'O(N^2)', 0, 8, 1);
--  question 9
INSERT INTO answer VALUES (33,'Compare first two elements, if left element is smaller (swap), repeat till smallest element is to the right ', 0, 9, 1);
INSERT INTO answer VALUES (34,'Compare first two elements, if left element is greater (swap), repeat till largest element is to the right ', 1, 9, 1);
INSERT INTO answer VALUES (35,'Swap the first two elements, if right element is greater (swap), repeat till largest element is to the right  ', 0, 9, 1);
INSERT INTO answer VALUES (36,'None of the above', 0, 9, 1);
--  question 10
INSERT INTO answer VALUES (37,'Merge Sort', 0, 10, 1);
INSERT INTO answer VALUES (38,'Quick Sort', 1, 10, 1);
INSERT INTO answer VALUES (39,'Bubble Sort ', 0, 10, 1);
INSERT INTO answer VALUES (40,'Insertion Sort', 0, 10, 1);

INSERT INTO game_players (game_id, user_id) VALUES(1,1);
-- new additions(Nov 10,2022)
INSERT INTO game_players (game_id, user_id) VALUES(1,2);
INSERT INTO game_players (game_id, user_id) VALUES(1,3);
INSERT INTO game_players (game_id, user_id) VALUES(1,4);
INSERT INTO game_players (game_id, user_id) VALUES(1,5);
INSERT INTO game_players (game_id, user_id) VALUES(1,6);
INSERT INTO game_players (game_id, user_id) VALUES(1,7);
INSERT INTO game_players (game_id, user_id) VALUES(1,8);
INSERT INTO game_players (game_id, user_id) VALUES(1,9);
INSERT INTO game_players (game_id, user_id) VALUES(1,10);
-- eugene entered game 1
INSERT INTO game_players (game_id, user_id) VALUES(1,11);

INSERT INTO game_question VALUES(1,1);
-- new additions(Nov 10,2022)
INSERT INTO game_question VALUES(1,2);
INSERT INTO game_question VALUES(1,3);
INSERT INTO game_question VALUES(1,4);
INSERT INTO game_question VALUES(1,5);
INSERT INTO game_question VALUES(1,6);
INSERT INTO game_question VALUES(1,7);
INSERT INTO game_question VALUES(1,8);
INSERT INTO game_question VALUES(1,9);
INSERT INTO game_question VALUES(1,10);

-- player 1
INSERT INTO user_answer VALUES(1,2);
INSERT INTO user_answer VALUES (1,8);
INSERT INTO user_answer VALUES (1,9);
INSERT INTO user_answer VALUES (1,16);
INSERT INTO user_answer VALUES (1,19);
INSERT INTO user_answer VALUES (1,22);
INSERT INTO user_answer VALUES (1,27);
INSERT INTO user_answer VALUES (1,29);
INSERT INTO user_answer VALUES (1,34);
INSERT INTO user_answer VALUES (1,38);

-- player 2 answers
INSERT INTO user_answer VALUES(2,3);
INSERT INTO user_answer VALUES (2,6);
INSERT INTO user_answer VALUES (2,12);
INSERT INTO user_answer VALUES (2,16);
INSERT INTO user_answer VALUES (2,17);
INSERT INTO user_answer VALUES (2,21);
INSERT INTO user_answer VALUES (2,27);
INSERT INTO user_answer VALUES (2,29);
INSERT INTO user_answer VALUES (2,36);
INSERT INTO user_answer VALUES (2,37);

-- player 3 answers
INSERT INTO user_answer VALUES(3,2);
INSERT INTO user_answer VALUES (3,5);
INSERT INTO user_answer VALUES (3,10);
INSERT INTO user_answer VALUES (3,13);
INSERT INTO user_answer VALUES (3,17);
INSERT INTO user_answer VALUES (3,21);
INSERT INTO user_answer VALUES (3,25);
INSERT INTO user_answer VALUES (3,30);
INSERT INTO user_answer VALUES (3,35);
INSERT INTO user_answer VALUES (3,38);


-- player 4 answers
INSERT INTO user_answer VALUES(4,2);
INSERT INTO user_answer VALUES (4,5);
INSERT INTO user_answer VALUES (4,12);
INSERT INTO user_answer VALUES (4,14);
INSERT INTO user_answer VALUES (4,17);
INSERT INTO user_answer VALUES (4,22);
INSERT INTO user_answer VALUES (4,26);
INSERT INTO user_answer VALUES (4,31);
INSERT INTO user_answer VALUES (4,36);
INSERT INTO user_answer VALUES (4,40);

-- player 5 answers
INSERT INTO user_answer VALUES(5,1);
INSERT INTO user_answer VALUES (5,8);
INSERT INTO user_answer VALUES (5,10);
INSERT INTO user_answer VALUES (5,13);
INSERT INTO user_answer VALUES (5,17);
INSERT INTO user_answer VALUES (5,21);
INSERT INTO user_answer VALUES (5,26);
INSERT INTO user_answer VALUES (5,29);
INSERT INTO user_answer VALUES (5,33);
INSERT INTO user_answer VALUES (5,39);

-- player 6 answers
INSERT INTO user_answer VALUES(6,2);
INSERT INTO user_answer VALUES (6,7);
INSERT INTO user_answer VALUES (6,12);
INSERT INTO user_answer VALUES (6,14);
INSERT INTO user_answer VALUES (6,19);
INSERT INTO user_answer VALUES (6,22);
INSERT INTO user_answer VALUES (6,26);
INSERT INTO user_answer VALUES (6,31);
INSERT INTO user_answer VALUES (6,35);
INSERT INTO user_answer VALUES (6,40);

-- player 7 answers
INSERT INTO user_answer VALUES(7,2);
INSERT INTO user_answer VALUES (7,6);
INSERT INTO user_answer VALUES (7,11);
INSERT INTO user_answer VALUES (7,15);
INSERT INTO user_answer VALUES (7,18);
INSERT INTO user_answer VALUES (7,23);
INSERT INTO user_answer VALUES (7,26);
INSERT INTO user_answer VALUES (7,32);
INSERT INTO user_answer VALUES (7,35);
INSERT INTO user_answer VALUES (7,40);

-- player 8 answers
INSERT INTO user_answer VALUES(8,2);
INSERT INTO user_answer VALUES (8,6);
INSERT INTO user_answer VALUES (8,11);
INSERT INTO user_answer VALUES (8,15);
INSERT INTO user_answer VALUES (8,20);
INSERT INTO user_answer VALUES (8,23);
INSERT INTO user_answer VALUES (8,27);
INSERT INTO user_answer VALUES (8,31);
INSERT INTO user_answer VALUES (8,34);
INSERT INTO user_answer VALUES (8,38);

-- player 9 answers
INSERT INTO user_answer VALUES(9,2);
INSERT INTO user_answer VALUES (9,7);
INSERT INTO user_answer VALUES (9,11);
INSERT INTO user_answer VALUES (9,13);
INSERT INTO user_answer VALUES (9,19);
INSERT INTO user_answer VALUES (9,24);
INSERT INTO user_answer VALUES (9,27);
INSERT INTO user_answer VALUES (9,31);
INSERT INTO user_answer VALUES (9,36);
INSERT INTO user_answer VALUES (9,38);

-- player 10 answers
INSERT INTO user_answer VALUES(10,2);
INSERT INTO user_answer VALUES (10,8);
INSERT INTO user_answer VALUES (10,9);
INSERT INTO user_answer VALUES (10,16);
INSERT INTO user_answer VALUES (10,19);
INSERT INTO user_answer VALUES (10,22);
INSERT INTO user_answer VALUES (10,27);
INSERT INTO user_answer VALUES (10,29);
INSERT INTO user_answer VALUES (10,34);
INSERT INTO user_answer VALUES (10,40);

-- Create 2nd game
INSERT INTO game VALUES (2,'2022-02-14 07:49:09','2022-02-14 08:00:00','FINISHED');

-- Add 4 questions to game id = 2
INSERT INTO game_question VALUES(2,1);
INSERT INTO game_question VALUES(2,2);
INSERT INTO game_question VALUES(2,3);
INSERT INTO game_question VALUES(2,4);