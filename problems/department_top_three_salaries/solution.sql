# Write your MySQL query statement below
SELECT d.name AS department, e.name AS employee, e.salary AS salary
FROM Employee AS e
JOIN Department AS d ON e.departmentId = d.id
WHERE (
SELECT COUNT(DISTINCT salary)
FROM Employee
WHERE departmentId = e.departmentId AND salary > e.salary) < 3
ORDER BY d.name, e.salary DESC;