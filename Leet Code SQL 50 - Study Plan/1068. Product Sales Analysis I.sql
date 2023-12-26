select Product.product_name, Sales.year, Sales.price
From Sales
INNER JOIN Product
where Sales.product_id = Product.product_id;
