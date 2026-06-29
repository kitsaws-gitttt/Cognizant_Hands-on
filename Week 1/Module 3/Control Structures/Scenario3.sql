BEGIN
    FOR rec IN (
        SELECT CustomerID, DueDate, LoanID
        FROM Customers
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) 
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear Customer ' || rec.CustomerID ||
            ',your loan ' || rec.LoanID ||
            ' is due on ' || rec.DueDate
        );
    END LOOP;
END;
/