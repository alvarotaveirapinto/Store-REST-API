# Loja

Springboot project with MySQL database using Docker connection.

## Model

-Sale - Relation one to many with "Product"

-Product 

-Client - Relation many to many with "Product"

## Controller

-Sale - Post sale/Get by client name

-Product - Get all/get by ID/Post product/Update price/Delete by id

-Client -Get all/Get by ID/Create client

## Service

-Sale

-Product

-Client

## Exceptions

-ClientNotFound
-ProductNotFound

## Requests

-NewProductRQ

-SalesRQ

-UpdateProductRQ


