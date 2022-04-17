# Persistencia-con-queries
Práctica realizada por: 
- Beatriz Sicilia 
- Inés Saavedra 
- Jorge Bretón de la Cierva

En esta práctica hemos realizado el modelo MVC de nuestra práctica Final, en el que conectaremos 4 bases de datos, como se puede ver en el squema.sql. Se han incluido distintas querys en SQL para poder modificar la información de cada una de las tablas usando los métodos: INSERT,UPDATE,SELECTy DELETE.
En este práctica, hemos trabajado sobre los archivos relacionados con el usuario (ServiceUser, UserRepository, UserController), especificando querys y métodos para obtener información sobre la tabla de usuarios. 

Se han realizado 3 INNER-JOINS entre las tablas: 
- La tabla periodo se relaciona con la tabla usuario a través del atributo user_id, de esta forma, cada usuario tendrá sus propios periodos. 
- La tabla grupo se relaciona con la tabla periodo a través del atributo periodo_code, cada grupo corresponderá a un periodo. 
- La tabla gasto está relacionada con la tabla grupo a través del atributo grupo_code. 

