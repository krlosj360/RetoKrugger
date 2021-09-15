# RetoKrugger

# Indicaciones

 1.- Creacion de la base de datos y tabla - Ejecutar Query.sql. 
 
 2.- Importar proyecto en STS 

# Probar

Abrir en el explorador le siguiente ruta. 

http://localhost:8090/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

1.- Introducir los siguientes datos 

![image](https://user-images.githubusercontent.com/37461234/133471621-4d8d2705-fab3-4067-a3db-d8ebfba74745.png)

user: retoKruger
password: retoKruger

1.- Ingresar Usuario

METODO POST Ingreso usuario 

![image](https://user-images.githubusercontent.com/37461234/133472031-8e921247-0765-4c7f-a43a-b9549d331dfe.png)

Request 

{
  "cedula": "0923170809",
  "nombres": "Carlos",
  "apellidos": "Cordero",
  "email": "ccorderoramos@gmail.com",
  "tipoUsuario": "admi",
  "fechaN": "09/09/1994",
  "direccion": "alamos",
  "celular": "0923170807",
  "estadoVacuna": "A",
  "tipoVacuna": "sinovac",
  "fechaVacuna": "17/08/2021",
  "numeroDosis": "2"
}

2.- Modificaciones Usuario 
