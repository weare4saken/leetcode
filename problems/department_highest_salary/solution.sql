# Write your MySQL query statement below
SELECT d.name AS department, 
       e.name AS employee, 
       m.max_salary AS salary
FROM department AS d 
JOIN (SELECT departmentId, MAX(salary) AS max_salary FROM employee GROUP BY departmentId) AS m
ON d.id = m.departmentId
JOIN employee AS e 
ON e.salary = m.max_salary AND e.departmentId = m.departmentid;