# Write your MySQL query statement below
SELECT project_id, round(avg(experience_years), 2) AS average_years
FROM Project AS p
JOIN Employee AS e ON p.employee_id = e.employee_id
GROUP BY project_id;