# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE FROM person
WHERE id NOT IN (SELECT * FROM(SELECT MIN(id) FROM person GROUP BY email) 
as deleted);

