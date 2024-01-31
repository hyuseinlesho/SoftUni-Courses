DELIMITER //

CREATE PROCEDURE usp_get_employees_from_town(IN town_name VARCHAR(255))
BEGIN
SELECT e.first_name, e.last_name
FROM employees e
JOIN addresses a ON e.address_id = a.address_id
JOIN towns t ON a.town_id = t.town_id
WHERE t.`name` = town_name
ORDER BY e.first_name, e.last_name, e.employee_id;
END //

DELIMITER ;

CALL usp_get_employees_from_town('Sofia');

DROP PROCEDURE usp_get_employees_from_town;