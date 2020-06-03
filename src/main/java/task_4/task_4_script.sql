-- USED POSTGRES DIALECT


-- CREATING TABLE
DROP TABLE IF EXISTS numbers;
CREATE TABLE numbers
(
    number INT8
);

-- FILLING TABLE WITH NUMBERS
INSERT INTO numbers (number)
values (1),
       (2),
       (4),
       (7),
       (8),
       (11),
       (20),
       (21),
       (22),
       (25),
       (28),
       (90);


-- LOOKING FOR MISSING ENTRYS
SELECT num + 1 as missing_number, next_num - num -1 as numbers_missed
FROM (
         SELECT num, LEAD(num) OVER (ORDER BY Num) as next_num
         FROM (
                  SELECT 0 Num
                  UNION ALL
                  SELECT number
                  FROM numbers
              ) T
     ) T
WHERE num + 1 <> next_num;
