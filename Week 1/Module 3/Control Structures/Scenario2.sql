BEGIN
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE Balance > 10000;

    COMMIT;
END;
/