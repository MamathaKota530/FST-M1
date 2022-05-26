-- Activity9

-- Create the customers table
-- create table customers (
--     customer_id int primary key, customer_name varchar(32),
--     city varchar(20), grade int, salesman_id int);


-- Insert values into it
-- INSERT ALL
--     INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
--     INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
--     INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
--     INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
--     INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
--     INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
--     INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
--     INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
-- SELECT 1 FROM DUAL;

SELECT c.customer_name, s.salesman_name FROM customers c
INNER JOIN salesman s 
ON c.salesman_id = s.salesman_id;

SELECT c.customer_name, s.salesman_name FROM customers c 
LEFT OUTER JOIN salesman s ON c.salesman_id = s.salesman_id WHERE c.grade<300
ORDER BY s.salesman_id;

SELECT c.customer_name, s.salesman_name FROM customers c
INNER JOIN salesman s ON c.salesman_id = s.salesman_id WHERE s.commission>12;

SELECT o.order_no,o.order_date,o.purchase_amount,c.customer_name,s.commission,s.salesman_id FROM orders o
INNER JOIN customers c ON o.customer_id=c.customer_id
INNER JOIN salesman s ON o.salesman_id=s.salesman_id;