FORO HUB CHALLENGE- BACK END
ALURA + ORACLE ONE 

CONTENIDO
-------------------------------------------------------------------------------------------------
************** Entorno Java y Spring
- DEPENDENCIAS UTILIZADAS
  *Lombok
  *Spring web
  *Spring Boot DevTools
  *Spring Data JPA
  *Flyway Migration
  *MySQL Driver
  *Spring Security
  
************** Entorno Java y Spring
-BASE DE DATOS UTILIZADA 
* MySQL and MySQL Workbench
-MIGRACIONES
-Creacion de tablas
-Alteracion de tablas

************* PRUEBAS REALIZADAS EN INSOMNIA 
* POST - LOGIN DE USUARIO:::    http://localhost:8081/login
* POST - REGISTRAR TOPICOS:::   http://localhost:8081/topicos
* PUT -  ACTUALIZAR TOPICOS POR ID  :::  http://localhost:8081/topicos/{id}
* GET - LISTADO DE TOPICOS ::: http://localhost:8081/topicos?sort=titulo
* DELETE - BORRAR TOPICOS ::: http://localhost:8081/topicos/5

************** GENERACION DE TOKEN CON JWT 
- Bilioteca Java de Auth0: JWT.IO
- Algoritmo utilizado HMAC256


CREADO POR HANNYA FIGUEROA  
FECHA DE TERMINO ENERO 16/2025 


⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠏⠀⠹⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀⢠⠀⠈⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠀⡀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⣼⣷⠀⠀⠙⠒⠚⠛⠛⠛⠛⠛⠓⠒⠒⠦⠚⠀⢀⣴⡇⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠃⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣀⡠⠤⢴⡷⠤⢤⡤⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢠⢾⣅⠙⢦⡀⠙⢦⡀⠙⢦⡈⠻⣕⢦⡀⠀⠀⠀⠀⠀⠀⣠⠴⢶⡋⠙⠫⣍⠙⢯⡉⠙⢯⡲⣄⠀⠀⠀⠀
⠀⠀⠀⢸⡄⠙⢷⡀⠙⢦⡀⠙⢦⡀⠙⢦⡘⢧⣷⠚⠉⠉⠛⠒⣾⠉⠳⡄⠙⢦⡀⠈⠳⣄⠉⠢⣄⠙⢾⡄⠀⠀⠀
⠀⠀⠀⠸⡝⢧⡀⠙⢦⡀⠙⢦⡀⠙⢦⡀⠙⢦⡝⠀⣠⣤⣤⠀⢹⠳⣄⠙⢦⡀⠉⠳⣄⠈⠑⢄⠈⠳⣼⠁⠀⠀⠀
⠁⠒⠒⠦⠽⣄⠙⢦⡀⠙⢦⡀⠙⢷⣄⠙⣦⠞⠁⠀⠈⢻⠋⠀⠀⢣⡈⠳⣄⠙⢦⡀⠈⠳⣄⠀⠙⣶⣃⣀⣀⣀⣄
⣀⣀⣀⣀⣀⣀⣻⡶⣿⣦⣤⣿⣦⣤⠿⠟⠃⠀⠀⠀⠀⢸⠀⠀⠀⠀⠻⢦⣜⣷⣄⣻⣦⣀⣸⣷⠟⠃⠀⠀⠀⠀⠀
⠉⠉⠉⠉⠉⠉⢹⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣘⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠛⠉⠩⢼⠒⠒⠲⠤⠤⠤⠀
⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠃⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠢⠤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⡤⠤⠒⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀

