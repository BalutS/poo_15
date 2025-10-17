En este repositorio hay dos carpetas, la carpeta "Guia" y la carpeta "Proyecto". en la carpeta "Proyecto" se encuentran las clases del proyecto a editar, en este proyecto se encuentran la mayoria de clases sobre las que se va a trabajar.
En la carpeta "Guia" se encuentran las clases de otro programa muy similar a "Proyecto". Este programa esta completo y debe servir como guia para las implementaciones en "Proyecto".
Las implementaciones de sintaxis, interfaz grafica, estructura de codigo y de clases en "Proyecto" se debe hacer de forma IDENTICA a la manera en la que esta hecho en "Guia" pero adaptado a el contexto de "Proyecto", respetando patrones de codigo, estructura de carpetas y clases, interfaz grafica, estilos, manejo de excepciones. no utilizar cosas que la "Guia" no use.
Mantener un consitencia en el codigo, no utilizar sintaxis complicada que no se haya utilizado en "Guia" a menos que sea estrictamente necesario para el correcto funcionamiento del codigo
NO UTILIZAR BufferdReader, u otros metodos o tipos de implementacios diferentes a la Guia, utilizar los metodos usados en "Guia".
No borrar o editar codigo ya implementado, a menos que sea necesario, solo si el código impide compilar, es un error obvio que impida el correcto funcionamiento del programa. aunque fragmenos de codigo parezcan no tener una funcionalidad clara, se deben mantener.
Los archivos de persistencia se deben guardar en una carpeta llamada "miBaseDeDatos" cada linea en los archivos "txt" corresponde a un registro, delimitando cada dato del registro con un ";".
Abordar excepciones y validaciones de campos de la misma manera que en "Guia"

REQUISITOS DEL PROGRAMA:
Existen 3 clases principales dentro del programa: Editorial, Autor y Libro.

Editorial:
*La clase Editorial contiene el id, el nombre, el país y un formato que puede ser: 1 (impreso), 2 (digital) y 3 (impreso y
digital), la propiedad cantidad de libros sirve para saber cuántos libros tiene la editorial.

*Se debe agregar la funcion de persistencia al programa. Al crear un nuevo objeto "Editorial" se debe almacenar la siguiente informacion dentro un archivo llamado "editoriales.txt":
idEditorial(la cual debe ser un numero generado automáticamente por el software);nombreEditorial;PaisEditorial;formatoEditorial.

*Se debe implementar una interfaz grafica que permita la creacion de objetos "Editorial" que permita ingresar todas las propiedades excepto el id.

*Se debe implementar una interfaz grafica que permita visualizar la información de las editoriales: Código, nombre,
país, formato y la cantidad de libros (depende de la cantidad de libros registrados en esa editorial) dicha informacion debe ser extraida de la persistencia.

Autor:
*La clase Autor contiene el id, el nombre, el género(true si es masculino, false si es femenino), la propiedad cantidad de libros sirve para saber cuántos libros
tiene el autor.

*Se debe agregar la funcion de persistencia al programa. Al crear un nuevo objeto "Autor" se debe almacenar la siguiente informacion dentro un archivo llamado "autores.txt":
idAutor(el cual debe ser un numero generado automáticamente por el software);nombreAutor;generoAutor.

*Se debe implementar una interfaz grafica que permita la creacion de objetos "Autor" que permita ingresar todas las propiedades excepto el id.

*Se debe implementar una interfaz grafica que permita visualizar la información de los autores: Código, nombre, género
y la cantidad de libros (depende de la cantidad de libros registrados para los autores) dicha informacion debe ser extraida de la persistencia.

Libro:
*La clase Libro contiene el id, el nombre, el precio, año, una Editorial y un Autor

*Se debe agregar la funcion de persistencia al programa. Al crear un nuevo objeto "Libro" se debe almacenar la siguiente informacion dentro de un archivo llamado "libros.txt":
idLibro (el cual debe ser un numero generado automáticamente por el software);nombreLibro;precioLibro(NO se acepta formato exponencial, es decir, manteniendo el tipo de dato Double pero mostrando el numero completo junto a sus decimales. Utilizando String.format("%.2f"));anioLibro;idEditorial;idAutor

*Se debe implementar una intefaz grafica que permita la creacion de objetos "Libro" que permita ingresar todas las propiedades excepto el id. Para seleccionar la editorial o el autor,
se debe utilizar combos, de tal manera que la información de las editoriales y los autores se obtenga desde dos persistencias.

*Se debe implementar una interfaz grafica que permita visualizar la informacion de los libros.  Código del libro, nombre
del libro, precio del libro (NO se acepta formato exponencial, se debe mostrar el numero completo junto a sus decimales), el año del libro, el nombre de la editorial
y entre paréntesis el nombre del país de esa editorial, también el nombre del autor y entre paréntesis el
género del autor, no se acepta true o false, debe imprimir masculino si es true y femenino si es false. 




 

