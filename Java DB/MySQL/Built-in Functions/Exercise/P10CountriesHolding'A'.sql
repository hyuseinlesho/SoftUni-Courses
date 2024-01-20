USE geography;

SELECT country_name, iso_code FROM countries
WHERE country_name REGEXP '(.*[aA].*){3,}'
ORDER BY iso_code;