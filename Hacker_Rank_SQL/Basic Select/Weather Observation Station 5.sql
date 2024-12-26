select city, length(city) from station order by length(city), city limit 1;
select city, length(city) from station order by length(city) desc, city limit 1;

/*
to understand it, 
Order by length with any thing will sort the data from small to big. 
Order by city will make the list as alphabetical order.
Limit is to show how many items will be shown in the list. 
*/ 
