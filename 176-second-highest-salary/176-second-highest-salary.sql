# Write your MySQL query statement below
select Max(salary) As SecondHighestSalary from employee where salary<(select max(salary) from employee);
