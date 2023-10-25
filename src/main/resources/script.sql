select product_name
from myhomework.orders o
join myhomework.customers c on o.customer_id = c.id
where name ilike :name;