public class App {
    
    public static void main(String[] args)  {
        /* Instanciar una clase */
        //----- Objeto miPersonaje de tipo Superpersonaje -----//
        Superpersonaje miPersonaje = new Superpersonaje("Maicol Sánchez", "Invisibilidad", 1450000, false);
        
        System.out.println("El Super Personaje " + miPersonaje.getNombre() + " tiene el poder de " + miPersonaje.getPoder());
        System.out.println("Valor COmercial de " + miPersonaje.getValorComercial());    

        miPersonaje.setValorComercial(-38);
        System.out.println("primer set: " + miPersonaje.getValorComercial());

        miPersonaje.setValorComercial(1900000);
        System.out.println("segundo set: " + miPersonaje.getValorComercial());

        miPersonaje.correr();
    }
}
