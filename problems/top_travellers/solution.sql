# Write your MySQL query statement below
SELECT u.name, COALESCE(SUM(r.distance), 0) AS travelled_distance
FROM users AS u
LEFT JOIN rides AS r ON u.id = r.user_id
GROUP BY user_id
ORDER BY travelled_distance DESC, name ASC;