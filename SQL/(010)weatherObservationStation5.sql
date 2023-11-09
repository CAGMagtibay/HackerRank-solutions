/*
TASK: Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths.
*/
-- Query to find shortest city name:
SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) ASC, CITY LIMIT 1;

-- Query to find longest city name:
SELECT CITY, LENGTH (CITY) FROM STATION ORDER BY LENGTH(CITY) DESC, CITY LIMIT 1;
