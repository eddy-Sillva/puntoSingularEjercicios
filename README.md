Ejercicios para postulantes de punto singular, realizados por Edwin Jesus Silva Escutia en lenguaje java.
Contacto: edwin.jesus.silva@gmail.com
Para ejecutar el programa por favor descarge el archivo zip, abra eclipse y selecciones la carpeta que acaba de descargar, despues necesita seleccionar el apartado File
Luego seleccione Open project from file system, seleccione Directory, seleccione la carpeta del programa (codigoMorse o ejercicioObjetos o ejercicioRomanos),
para ejecutar el programa solo debe posicionarse sobre la clase Main y correrla, No es necesario descargar ninguna libreria.

Programas realizado en Java Eclipse 2019-06, Java 8 update 51 (64 bits) y JDK 12.0.2 (64bits)

Ejercicios realizados:

Ejercicio 1
Elaborar un programa de consola Java, que traduzca texto a código morse y viceversa, 
tomando en cuenta las siguientes consideraciones:
• Cada letra (en morse) será separada con un espacio, por ejemplo: HOY=…. --- -.--
• Cada palabra (en morse) será separada por 3 espacios, por ejemplo HOY ES =…. --- -.-


Ejercicio 2
Elaborar un programa en consola Java que convierta un número entero en un rango de 1 a 
1000 introducido por el usuario a su representación en numeración romana, tomando en 
cuenta las siguientes reglas:

1. Los números romanos I, X, C y M pueden repetirse hasta tres veces a la hora de escribir 
un número romano compuesto.
2. Los números romanos V, L y D no pueden repetirse nunca.
3. Si un número romano compuesto tiene un número a la derecha menor que el de la 
izquierda entonces se suman ambos. Ejemplo:
XI: el número de la derecha (I = 1) es menor que el de la izquierda (X = 10) entonces 
se suman, es decir XI = 11
4. Si un número romano compuesto tiene un número a la derecha mayor que el de la 
izquierda y éste es un I, X o C, entonces se resta el de la izquierda al de la derecha. 
Ejemplo:
IX: el número de la derecha (X = 10) es mayor que el de la izquierda (I = 1) y además 
este es I luego se resta el de la izquierda al de la derecha, es decir IX = 9

Ejercicio 3
Usando la POO crear una clase llamada Cuadrado la cual tendrá las siguientes habilidades: 
calcularArea y calcularPerimetro. Crear una clase llamada Cubo que herede de la clase 
Cuadrado y que permita las siguientes habilidades: calcularVolumen y calcularPerimetro. El 
usuario deberá de introducir los datos necesarios para que el sistema pueda realizar los 
diversos cálculos, a través de un menú de consola con las siguientes especificaciones.
• Se pedirá el dato necesario al usuario (medida de un lado).
• Se le presentaran las opciones de cálculo disponibles, la opción cancelar que retornara a 
la petición del dato lado en caso de ser seleccionada y una opción salir para terminar la 
ejecución del programa.

Al seleccionar un cálculo este se ejecutara y presentara el resultado y opciones para salir 
al menú de cálculos (usando el mismo dato de lado proporcionado anteriormente) o salir al 
inicio (petición de un nuevo dato).
• En cada menú se deberá informar el dato actual en caso de ser necesario.
Nota: es importante el uso de Herencia.
