SELECT employee_id, CONCAT(first_name, ' ', last_name) AS full_name, d.department_id, `name` AS department_name
FROM employees AS e
JOIN departments AS d ON d.manager_id = e.employee_id
ORDER BY employee_id
LIMIT 5;