SELECT DISTINCT CITY 
FROM STATION 
WHERE (CITY Like '%A' or CITY Like'%E' or CITY Like'%I' or CITY Like'%O' or CITY Like'%U') 
AND
(CITY Like'E%' or CITY Like'I%' or CITY Like'O%' or CITY Like'U%' or CITY Like'A%');
