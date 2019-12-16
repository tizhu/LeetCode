select s.Score as Score, dense_rank()over(order by Score desc) as Rank
from scores s
order by score desc;