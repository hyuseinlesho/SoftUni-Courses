UPDATE properties
SET price = price - 50000
WHERE price >= 800000;

SELECT * FROM properties;