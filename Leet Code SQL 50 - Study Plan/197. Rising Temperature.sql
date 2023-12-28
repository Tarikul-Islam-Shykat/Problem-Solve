select w2.id
from Weather w1 join Weather w2
ON Datediff(w1.recordDate, w2.recordDate) = -1
where w2.temperature > w1.temperature;
