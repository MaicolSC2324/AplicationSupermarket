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
        int LimMayor = 15, LimMenor = 0, NumIntentos = 0;
        int NumAdivinar = 7, NumDigitado = 0;

        do {
            NumDigitado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre " + LimMenor + " y " + LimMayor));
            NumIntentos++;

            if (NumDigitado >= LimMenor  && NumDigitado <= LimMayor){
                if (NumAdivinar == NumDigitado){
                    JOptionPane.showMessageDialog(null, "Felicidades, el número digitado es el correcto, lo lograste en " + NumIntentos + " intentos");
                } else if (NumAdivinar < NumDigitado) {
                    JOptionPane.showMessageDialog(null, "El número digitado se emcuentra por encima del valor a adivinar.");
                } else {
                    JOptionPane.showMessageDialog(null, "El número digitado se encuentra por debajo del valor a adivinar.");
                }
            } else{
                JOptionPane.showMessageDialog(null, "El número digitado no está dentro del intervalo de valores señalado, Ingrese un número entre " + LimMenor + " y " + LimMayor);
            }
        } while (NumDigitado != NumAdivinar);
    }
}
