CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_id IN Employees.DepartmentID%TYPE,
    p_bonus_per IN NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + ((Salary * p_bonus_per) / 100)
    WHERE DepartmentID = p_dept_id;

    COMMIT;
END;
/


--Example Call
BEGIN
    UpdateEmployeeBonus(12, 8);
END;
/