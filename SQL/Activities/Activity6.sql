create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

INSERT ALL
    INTO orders VALUES(101, 230.5, TO_DATE('2021/09/06', 'YYYY/MM/DD'), 2001, 1001) 
    INTO orders VALUES(102, 180.5, TO_DATE('2022/08/20', 'YYYY/MM/DD'), 2002, 1004)
    INTO orders VALUES(103, 55.25, TO_DATE('2022/11/09', 'YYYY/MM/DD'), 2003, 1002)
    INTO orders VALUES(104, 150.5, TO_DATE('2022/07/16', 'YYYY/MM/DD'), 2004, 1003)
    INTO orders VALUES(105, 808.5, TO_DATE('2019/12/22', 'YYYY/MM/DD'), 2010, 1004)
    INTO orders VALUES(106, 2900.6, TO_DATE('2020/10/07', 'YYYY/MM/DD'), 2019, 1001)
    INTO orders VALUES(107, 1760, TO_DATE('2020/08/25', 'YYYY/MM/DD'), 2018, 1002)
    INTO orders VALUES(108, 81983.53, TO_DATE('2020/10/20', 'YYYY/MM/DD'),2005, 1003)
    INTO orders VALUES(109, 6480.4, TO_DATE('2020/11/20', 'YYYY/MM/DD'), 2020 ,1004)
    INTO orders VALUES(110, 950.45, TO_DATE('2019/05/29', 'YYYY/MM/DD'), 2008, 1002)
    INTO orders VALUES(111, 55.30, TO_DATE('2022/09/27', 'YYYY/MM/DD'), 2015, 1003)
    INTO orders VALUES(112, 1045.6, TO_DATE('2021/05/28', 'YYYY/MM/DD'), 2014, 1004)
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;


select order_no, order_date from orders order by order_date;


select order_no, purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;