BEGIN
    FOR rec IN (
        SELECT CustomerID, 
        Age FROM Customers
    ) 
    
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Customers
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/