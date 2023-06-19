# Write your MySQL query statement below
SELECT DISTINCT i1.num AS ConsecutiveNums 
FROM logs AS i1, logs AS i2, logs AS i3
WHERE i1.id = i2.id + 1 
AND i2.id = i3.id + 1 
AND i1.num = i2.num 
AND i2.num = i3.num;