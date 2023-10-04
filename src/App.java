import java.util.Scanner;
import javax.swing.JOptionPane;

// Librería para limpiar la consola o el Terminal donde se ejecuta el código
import java.io.IOException; 

public class App {
    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, IOException  {
        /*
            Dato Flotante float = 45.5F, siempre después de digitar el numero de la variable debe ir la F por sintaxis en Java
            EnteroLargo long = 123.3L, siempre después de digitar el numero de la variable debe ir la L por sintaxis en Java
        */
        
        // Código para limpiar la terminal en Java
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // Declaración de Variables
        String Mensaje = "";
        float Temperatura = 0.0F;
        int opcion = 0;
        Scanner cinput = new Scanner (System.in);
        
        System.out.println("Hello, World!");
        System.out.println("are you ready to start this program?");

        Mensaje = JOptionPane.showInputDialog("Plis, write any text to explain to show on the display: ");

        System.out.println("The text did write is: " + Mensaje);

        System.out.println("Its neccesary that you write the temperature value shows in the instrument.");
        System.out.println("Considerate that the comma (,) its the decimal symbol for this program");
        System.out.print("Plis write a temperature value: ");
        Temperatura = cinput.nextFloat();     
        
        if (Temperatura >= 50) {
            System.out.println("Temperatura sobrepasa el límite por " + (Temperatura - 50) + "°C");
        }   else if (Temperatura <= 15) {
            System.out.println("La temperatura se encuentra por debajo del límite aceptable por " + (15 - Temperatura) + "°C");
        }   else {
            System.out.println("Temperatura dentro de parámetros o límites aceptables.");
        }
        
        System.out.print("Plis write a number between 1 and 3: ");
        opcion = cinput.nextInt();
        switch (opcion){
            case 1:
                System.out.println("The opcion white was the first option ");
                break;
            case 2:
                System.out.println("The opcion white was the second option ");
                break;
            case 3:
                System.out.println("The opcion white was the third option ");
                break;
            default:
                System.out.println("This option isn't in the options shows previously");
                break;
        }

    }
}
