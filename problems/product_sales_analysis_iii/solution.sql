# Write your MySQL query statement below
SELECT s.product_id, s.year AS first_year, s.quantity, s.price
FROM Sales AS s
JOIN (SELECT product_id, MIN(year) AS year FROM sales GROUP BY product_id) AS s2
ON s.product_id = s2.product_id AND s.year = s2.year;