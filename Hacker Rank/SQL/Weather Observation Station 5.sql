SELECT city, length(city) from station
order by length(city), city
limit 1;

SELECT city, length(city) from station
order by length(city) desc, city
limit 1;
