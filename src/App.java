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
        int opcion = 0, contador = 0;
        Scanner cinput = new Scanner (System.in);
            /* Creando Arreglos */
            String [] NombresArray  = new String[3]; 
            NombresArray[0] = "Maicol";
            NombresArray[1] = "Duvan";
            NombresArray[2] = "Dyland";
        
        System.out.println("Hello, World!");
        System.out.println("are you ready to start this program?");

        Mensaje = JOptionPane.showInputDialog("Plis, write any text to explain to show on the display: ");

        System.out.println("The text did write is: " + Mensaje);

        System.out.println("Its neccesary that you write the temperature value shows in the instrument.");
        System.out.println("Considerate that the comma (,) its the decimal symbol for this program");
        System.out.print("Plis write a temperature value: ");
        Temperatura = cinput.nextFloat();     
        
        System.out.println("+----------------- if -----------------+");
        if (Temperatura >= 50) {
            System.out.println("Temperatura sobrepasa el límite por " + (Temperatura - 50) + "°C");
        }   else if (Temperatura <= 15) {
            System.out.println("La temperatura se encuentra por debajo del límite aceptable por " + (15 - Temperatura) + "°C");
        }   else {
            System.out.println("Temperatura dentro de parámetros o límites aceptables.");
        }
        
        System.out.println("+--------------- switch ---------------+");
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
        
        System.out.println("+--------------- foreach ---------------+");
        contador = 0;
        for (String string : NombresArray) {
            contador ++;
            System.out.println("El nombre en la posición " + contador + " es " + string);
        }

        System.out.println("+----------------- for -----------------+");
        for (int i = 0; i<=2;i++){
            System.out.println(NombresArray[i]);
        }

        System.out.println("+---------------- while ----------------+");
        contador = 0;
        while (contador <= 5){
            System.out.println(contador);
            contador+=2;
        }
        
        System.out.println("+--------------- do while ---------------+");
        contador = 0;
        do {
            System.out.println(contador);
            contador+=3;
        } while (contador<0);

        System.out.println("+--------------- Arreglos superdimencionales ---------------+");
        int [][][] matrizValores  = new int[2][3][2]; 
        
        contador = 0;
        for (int i = 0; i < matrizValores.length; i++){
            for (int j =0; j < matrizValores[0].length; j++){
                for (int k =0; k < matrizValores[0][0].length; k++){
                    matrizValores[i][j][k] = contador;
                    contador +=2;
                    System.out.println("En la pocisión " + i + ", " + j + ", " + k + " se almacenó el valor: " + matrizValores[i][j][k]);
                }
            }
        }
    }
}
