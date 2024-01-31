SELECT first_name, salary FROM employees
WHERE department_id = 10
ORDER BY first_name, salary;

DELIMITER $$

CREATE PROCEDURE usp_raise_salaries(department_name VARCHAR(50))
BEGIN
UPDATE employees AS e
JOIN departments AS d
ON e.department_id = d.department_id
SET salary = salary * 1.05
WHERE d.name = department_name;
END $$

DELIMITER ;

CALL usp_raise_salaries('Finance')