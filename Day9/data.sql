INSERT INTO CARS(NAME,PRICE) VALUES('Audi A2',3000000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('Audi A5',7000000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('Jaguar XE',9004000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('Jaguar XF',8854000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('Audi Q7',8900000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('Audi Q5',7800000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('BMW X6',10000000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('BMW X1',3500000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('BMW X5',6500000.00);
INSERT INTO CARS(NAME,PRICE) VALUES('BMW X3',4000000.00);

UPDATE CARS SET PRICE=500.00;

UPDATE CARS SET PRICE=100.00 WHERE VIN=1004;

UPDATE CARS SET PRICE=PRICE+PRICE*.20;

UPDATE CARS SET PRICE=PRICE*5 WHERE NAME LIKE 'Audi%';

DELETE FROM CARS;

INSERT INTO COMPANY_MASTER(NAME,CITY,STRENGTH) VALUES('HSBC','Pune',240000),('RBS','Gurgaon',60000),('DBS','Hyderabad',850000);

INSERT INTO EMPLOYEE_MASTER(NAME,SALARY,DESIG,DEPT,EMAIL,PHONE,CID) VALUES('Rudra',120000.00,'Accountant','HR','Rudra@gmail.com','981200000',1),
('Rupayan',620000.00,'Engineer','Digital','Rupayan@gmail.com','981200023',1),
('Akansha',340000.00,'Lead','IT','Akansha@gmail.com','981200076',1),
('Esha',200000.00,'Architect','Digital','Esha@gmail.com','981200065',1),
('Poornima',600000.00,'Engineer','GBM','Poornima@gmail.com','981200011',1),
('Aditya',15000.00,'Engineer','IT','Aditya@gmail.com','981200033',1),
('Shreyash',23000.00,'Lead','Digital','Shreyash@gmail.com','981200045',1),
('Shubham',380000.00,'Accountant','Digital','Shubham@gmail.com','981200066',1),
('Nitish',900000.00,'Lead','GBM','Nitish@gmail.com','981200078',1),
('Eravatee',870000.00,'Architect','GBM','Eravatee@gmail.com','981200045',1),
('Krati',50000.00,'Engineer','RBWM','Krati@gmail.com','981200076',2),
('Utkarsh',30000.00,'Architect','GPB','Utkarsh@gmail.com','981200021',2),
('Sneha',50000.00,'Engineer','RBWM','Sneha@gmail.com','981200043',2),
('Lina',240000.00,'Engineer','RBWM','Lina@gmail.com','981200033',2),
('Beenu',670000.00,'Architect','GPB','Beenu@gmail.com','981200098',2);

SELECT NAME FROM EMPLOYEE_MASTER AS EM WHERE EM.CID=2;
SELECT EM.NAME AS EMP_NAME,CM.NAME AS COMP_NAME FROM EMPLOYEE_MASTER AS EM,COMPANY_MASTER AS CM WHERE EM.CID=CM.ID AND CM.NAME='RBS';

SELECT NAME FROM EMPLOYEE_MASTER AS EM WHERE SALARY > 500000.00;

SELECT NAME FROM EMPLOYEE_MASTER AS EM WHERE DESIG='Architect' AND SALARY > 40000.00;

SELECT NAME,DEPT,SALARY FROM EMPLOYEE_MASTER AS EM WHERE DEPT IN('GBM','Digital','IT');

SELECT MAX(SALARY),DEPT FROM EMPLOYEE_MASTER GROUP BY DEPT;

SELECT AVG(SALARY),DEPT FROM EMPLOYEE_MASTER GROUP BY DEPT;

SELECT AVG(SALARY),DEPT FROM EMPLOYEE_MASTER GROUP BY DEPT HAVING AVG(SALARY) > 400000.00;



