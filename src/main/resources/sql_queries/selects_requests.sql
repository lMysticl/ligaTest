select p.id as product_id, p.title as product, pchs.product_characteristics_id, pch.name as unit, pch.value
from products p
join product_characteristic pchs on (p.id = pchs.product_id)
join product_characteristics pch on (pchs.product_characteristics_id = pch.id)
WHERE pch.name = 'width';

select distinct product_id, title,name,value
from products, product_characteristic, product_characteristics;

select distinct product_id, title ,name ,value
from products, product_characteristics, product_characteristic
where name = 'diagonal';



