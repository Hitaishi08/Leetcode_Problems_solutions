# Write your MySQL query statement below
SELECT E.name , B.bonus FROM Employee E
LEFT JOIN Bonus B
ON E.empId = B.empId
HAVING bonus < 1000 || bonus IS NULL;