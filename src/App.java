// Librería para limpiar la consola o el Terminal donde se ejecuta el código
import java.io.IOException;

import javax.crypto.spec.DESKeySpec;
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
        String StudentName = "", Signature = "", CadenaNotas = "";
        int LargoNotas = 0;
        double Calificacion = 0;
        
        JOptionPane.showMessageDialog(null, "¡Welcome! in this app each student can to managment your calificatios by assignature.");
        StudentName = JOptionPane.showInputDialog(null, "Plis, write your full name");
        Signature = JOptionPane.showInputDialog(null, "Now write the signatures name");
        JOptionPane.showMessageDialog(null, "The name writed its " + StudentName + " and the signature writed its " + Signature);
        LargoNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de notas que va a ingresar"));

        if (LargoNotas != 0){
            double [] Nota = new double[LargoNotas], Porcentaje = new double[LargoNotas];

            for (int i = 0; i < Porcentaje.length; i++) {
                Nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación número " + (i+1)));
                Porcentaje[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de la calificación número. \n Se entiende quesi escribe 40, equivale al 40% " + (i+1)));
            }

            for (int i = 0; i < Porcentaje.length; i++) {
                Calificacion = Calificacion + (Nota[i] * Porcentaje[i] / 100);
                CadenaNotas = CadenaNotas + "\n"+ (i+1) + ". Calificación: " + Nota[i] + ", Porcentaje: " + Porcentaje[i];
            }

            JOptionPane.showMessageDialog(null, "Listo " + StudentName + ", Para la asiganuta " + Signature + " tenemos el siguiente resultado:"+ CadenaNotas + "\nLa calificación final de su asignatura es: " + Calificacion);

        }
        
        
        //Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre " + LimMenor + " y " + LimMayor));
        //hola
        //JOptionPane.showMessageDialog(null, "Felicidades, el número digitado es el correcto, lo lograste en " + NumIntentos + " intentos");
    }
}
