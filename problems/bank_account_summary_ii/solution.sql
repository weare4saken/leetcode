# Write your MySQL query statement below
SELECT u.name , SUM(t.amount) AS balance
FROM Users AS u
JOIN Transactions t ON u.account = t.account
GROUP BY u.name
HAVING SUM(t.amount) > 10000;