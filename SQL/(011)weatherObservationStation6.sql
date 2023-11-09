/*
Query the list of CITY names starting with vowels from STATION.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE "a%" OR CITY LIKE "e%" OR CITY LIKE "i%" OR CITY LIKE "o%" OR CITY LIKE "u%";
