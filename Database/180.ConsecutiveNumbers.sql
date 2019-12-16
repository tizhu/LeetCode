select distinct num as ConsecutiveNums 
from 
    (select num, case when lead(num,1)over(order by id) = num and lead(num,2)over(order by id) =num then 1 else 0 end ThreeConsec
    from logs)

group by num
having max(ThreeConsec)=1;