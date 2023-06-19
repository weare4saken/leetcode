# Write your MySQL query statement below
SELECT ROUND(COUNT(DISTINCT(a1.player_id)) / 
(SELECT COUNT(DISTINCT(player_id)) FROM Activity),2) AS fraction
FROM
(SELECT player_id, MIN(event_date) AS min_date
FROM Activity
GROUP BY player_id) AS a1
JOIN Activity AS a2 
ON a1.player_id = a2.player_id 
AND DATE_ADD(a1.min_date, INTERVAL 1 DAY) = a2.event_date;