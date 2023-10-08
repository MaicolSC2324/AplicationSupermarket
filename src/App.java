import java.util.ArrayList;


public class App {
    
    public static void main(String[] args)  {
        /*
            Dato Flotante float = 45.5F, siempre después de digitar el numero de la variable debe ir la F por sintaxis en Java
            EnteroLargo long = 123.3L, siempre después de digitar el numero de la variable debe ir la L por sintaxis en Java
        */
        
        //Declaración de variables
        Integer ValorMax, ValorMin, Suma = 0;
        Integer Promedio;
        ArrayList<Integer> myArrayDinamico = new ArrayList<Integer>();
        myArrayDinamico.add(17);
        myArrayDinamico.add(24);
        myArrayDinamico.add(5);
        myArrayDinamico.add(13);
        myArrayDinamico.add(7);
               
        System.out.println(myArrayDinamico.size());
        ValorMax = myArrayDinamico.get(0);
        ValorMin = myArrayDinamico.get(0);
        System.out.println("Maximo: " + ValorMax + "\nMinimo: " + ValorMin);
        
        
        for (int i = 0; i < myArrayDinamico.size(); i++) {
            if (myArrayDinamico.get(i) > ValorMax) {
                ValorMax = myArrayDinamico.get(i);
            }

            if (myArrayDinamico.get(i) < ValorMin){
                ValorMin = myArrayDinamico.get(i);
            }
            Suma += myArrayDinamico.get(i);
        }
        Promedio = Suma / myArrayDinamico.size();
        System.out.println("Valor máximo: " + ValorMax);
        System.out.println("Valor mínimo: " + ValorMin);
        System.out.println("Suma: " + Suma);
        System.out.println("Promedio: " + Promedio);
    }
}
