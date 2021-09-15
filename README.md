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
  "cedula": "092317108",
  "nombres": "Carlos",
  "apellidos": "Cordero",
  "email": "ccorder@gmail.com",
  "tipoUsuario": "admi",
  "fechaN": "09/09/1994",
  "direccion": "alamos",
  "celular": "0923170807",
  "estadoVacuna": "A",
  "tipoVacuna": "sinovac",
  "fechaVacuna": "17082021",
  "numeroDosis": "2"
}
Response 

![image](https://user-images.githubusercontent.com/37461234/133473660-f04fc600-b7b2-42d9-81a4-622079a88caf.png)




2.- Modificaciones Usuario 

![image](https://user-images.githubusercontent.com/37461234/133473915-57b044af-9a4e-49f1-a2df-3303a62db379.png)

Se realizo la modificacion del tipo de vacuna 

Request
{
  "cedula": "092317108",
  "nombres": "Carlos",
  "apellidos": "Cordero",
  "email": "ccorder@gmail.com",
  "tipoUsuario": "admi",
  "fechaN": "09/09/1994",
  "direccion": "alamos",
  "celular": "0923170807",
  "estadoVacuna": "A",
  "tipoVacuna": "cansino",
  "fechaVacuna": "17082021",
  "numeroDosis": "2"
}


3 .- Consulta por Id. 

![image](https://user-images.githubusercontent.com/37461234/133474147-ebc5ce60-442f-4385-8d06-5640126e9d2d.png)

Response 

![image](https://user-images.githubusercontent.com/37461234/133474205-1dac6042-2d9b-451b-a9b4-9442aea861c9.png)


4. - Filtro (Tipo Vacuna, Estado de Vacuna y Fecha Vacuna)

![image](https://user-images.githubusercontent.com/37461234/133475265-3c121bc6-4391-473c-be85-7f9ee0dc8494.png)

Reponse 

![image](https://user-images.githubusercontent.com/37461234/133475389-32a414c8-a73c-4d0f-87c7-31d884f69adb.png)



