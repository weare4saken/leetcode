# Write your MySQL query statement below
SELECT customer_number FROM 
(SELECT customer_number, COUNT(*) AS count 
FROM Orders GROUP BY customer_number
ORDER BY count DESC) AS o2
LIMIT 1;