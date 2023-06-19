# Write your MySQL query statement below
SELECT e.name FROM Employee AS e
JOIN (SELECT managerId FROM Employee GROUP BY managerId HAVING COUNT(*) >= 5) AS e2
ON e.id = e2.managerId;