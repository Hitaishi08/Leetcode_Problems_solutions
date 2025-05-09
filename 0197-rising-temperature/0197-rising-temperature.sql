# Write your MySQL query statement below
SELECT w1.id 
FROM Weather w1 #current day
JOIN Weather w2 #previous day
ON DATE(w1.recordDate) = DATE_ADD(w2.recordDate,INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature;