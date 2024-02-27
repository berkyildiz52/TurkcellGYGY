Select * From Customers

Select ContactName Adi, CompanyName as Sirketadi, City as Sehir From Customers

Select * From Customers Where City = 'Berlin'

Select * From Products Where CategoryID=1 or CategoryID=3

Select * From Products Where CategoryID=1 and UnitPrice>=10

Select * From Products Where CategoryID = 1 Order By UnitPrice desc

Select CategoryID, Count(*) From Products Group By CategoryID Having Count(*)<10

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
From Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
Where Products.UnitPrice>10

Select * From Products as p left join [Order Details] as od
on p.ProductID = od.ProductID 
inner join Orders o
on o.OrderID = od.OrderID

Select * From Customers as c left join Orders as o 
on c.CustomerID = o.CustomerID
Where o.CustomerID is null