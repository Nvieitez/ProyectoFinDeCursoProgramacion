// --------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * @author Nicolás Viéitez Domínguez
 * @author Susana Isabel Santos Mallqui.
 * @since V1.0
 */

// Este programa, creado con mucho cariño y dedicación, consta como nuestro proyecto de fin de curso, donde hemos decidido crear un programa
// que te permita simular todo el proceso que hay detrás de una tienda de vinilos, aún siendo un concepto simple, ha habido mucho esfuerzo
// por detrás, tanto de uno como de otro, y de verdad espero que sea el primer gran proyecto de muchos más.

// Esperamos os guste.

// - Nicolás y Susana.

// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.


// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.

// Primero vamos a importar la clase "MenuPrincipal" para poder iniciar el programa con el entorno gráfico.

// CLASE APP ----------------------------------------------------------------------------------------------------------------------------------------

import Vista.MenuPrincipal;

// Esta es la clase principal, desde aquí se iniciarán todos los procesos de nuestro programa.
public class App {

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    /**
     * Es el método principal, inicia todo el programa.
     *
     * @author Nicolás Viéitez Domínguez
     * @author Susana Isabel Santos Mallqui.
     *
     * @param args Conocemos como "args" a un array que puede recibir datos directamente desde la consola del sistema operativo.
     * @throws Exception Muestra un error en caso de que cualquier parte del programa falle.
     *
     * @since V1.0
     */

    public static void main(String[] args) throws Exception {

        // Para iniciar nuestro programa vamos a llamar al la clase "MenúPrincipal" para que inicie nuestro entorno gráfico.
        MenuPrincipal.MétodoMenúPrincipal();

    } // Fin de la clase "App".

} // Fin del programa.
