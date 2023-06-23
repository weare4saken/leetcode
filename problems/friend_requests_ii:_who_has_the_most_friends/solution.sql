# Write your MySQL query statement below
SELECT id, SUM(cnt) AS num FROM
((SELECT requester_id AS id, COUNT(*) AS cnt FROM RequestAccepted 
GROUP BY requester_id)
UNION ALL
(SELECT accepter_id AS id, COUNT(*) AS cnt FROM RequestAccepted 
GROUP BY accepter_id) 
) AS t
GROUP BY id
ORDER BY num DESC 
LIMIT 1;