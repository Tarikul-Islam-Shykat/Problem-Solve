select name from students  where marks > 75 order by SUBSTRING(name,-3) ASC, ID asc;

/*
https://www.youtube.com/watch?v=6Fj7am_-E8k
SUBSTRING(string, start_position, length)
*/
