import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args)  {
        /*
            Dato Flotante float = 45.5F, siempre después de digitar el numero de la variable debe ir la F por sintaxis en Java
            EnteroLargo long = 123.3L, siempre después de digitar el numero de la variable debe ir la L por sintaxis en Java
        */
        
        // Declaración de Variables
        String Mensaje = "";
        float Temperatura = 0.0F;
        Scanner cinput = new Scanner (System.in);
        
        System.out.println("Hello, World!");
        System.out.println("are you ready to start this program?");
        System.out.print("Plis, write any text to explain to show on the display: ");

        Mensaje = cinput.nextLine();
        System.out.println("The text did write is: " + Mensaje);

        System.out.println("Its neccesary that you write the temperature value shows in the instrument.");
        System.out.println("Considerate that the ");
        System.out.print("Plis write a temperature value: ");
        Temperatura = cinput.nextFloat();     
        
        if (Temperatura >= 50) {
            System.out.println("Temperatura sobrepasa el límite por " + (Temperatura - 50) + "°C");
        }   else if (Temperatura <= 15) {
            System.out.println("La temperatura se encuentra por debajo del límite aceptable por " + (15 - Temperatura) + "°C");
        }   else {
            System.out.println("Temperatura dentro de parámetros o límites aceptables.");
        }


    }
}
