// Librería para limpiar la consola o el Terminal donde se ejecuta el código
import java.io.IOException;

import javax.swing.JOptionPane; 

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

        // Declaramos variables
        String StudentName = "", Signature = "";
        long [] Nota = new long[2], Porcentaje = new long[2];


        JOptionPane.showMessageDialog(null, "¡Welcome! in this app each student can to managment your calificatios by assignature.");
        StudentName = JOptionPane.showInputDialog(null, "Plis, write your full name");
        Signature = JOptionPane.showInputDialog(null, "Now write the signatures name");
        JOptionPane.showMessageDialog(null, "The name writed its " + StudentName + " and the signature writed its " + Signature);
        
        //Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre " + LimMenor + " y " + LimMayor));
        //hola
        //JOptionPane.showMessageDialog(null, "Felicidades, el número digitado es el correcto, lo lograste en " + NumIntentos + " intentos");
    }
}
