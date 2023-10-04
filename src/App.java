public class App {
    /**
     * @param args
     */
    public static void main(String[] args)  {
        /**
            Dato Flotante float = 45.5F, siempre después de digitar el numero de la variable debe ir la F por sintaxis en Java
            EnteroLargo long = 123.3L, siempre después de digitar el numero de la variable debe ir la L por sintaxis en Java
        **/

        // Declaración de Variables
        String Mensaje = "prueba de String";
        float Temperatura = 12.5F;
        
        System.out.println("Hello, World!");
        System.out.println("how are you?");
        System.out.println(Mensaje);
        Mensaje = Mensaje + " Adición";
        System.out.println(Mensaje);

        if (Temperatura >= 50) {
            System.out.println("Temperatura sobrepasa el límite por " + (Temperatura - 50) + "°C");
        } else if (Temperatura <= 15) {
            System.out.println("La temperatura se encuentra por debajo del límite aceptable por " + (15 - Temperatura) + "°C");
        }
        else {
            System.out.println("Temperatura dentro de parámetros o límites aceptables.");
        }
    }
}
