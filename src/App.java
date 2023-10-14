public class App {
    
    public static void main(String[] args)  {
        /* Instaciar Código Clase Personaje */
            Personaje miPersonaje = new Personaje("Maicol", 'M');
            
            System.out.println("Nombre: " + miPersonaje.getNombre());
            System.out.println("Sexo: " + miPersonaje.getSexo());
        /* Final Instaciar Código Clase Personaje */

        /* Instaciar Código Clase SIMCard */
            SIMCard miSimCard = new SIMCard("3203971194");
            System.out.println("Numero Telefono: " + miSimCard.getNumerotelefono());
            System.out.println("Saldo: " + miSimCard.getSaldo());
            System.out.println("Empresa: " + miSimCard.getEmpresaTelefonia());
        /* Final Instaciar Código Clase SIMCard */

        /* Instaciar Código Clase Autobus */
            Autobus miBus = new Autobus("Felipe");
            System.out.println("Conductor del bus: " + miBus.getNombreConductor());
            System.out.println("Dinero recaudado: " + miBus.getCantidadDinero());
            System.out.println("Cantidad de pasajeros: " + miBus.getnPasajeros());
        /* Final Instaciar Código Clase Autobus */

    }
}
