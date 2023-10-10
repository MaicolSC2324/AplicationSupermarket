public class App {
    
    public static void main(String[] args)  {
        
        MoldePokemon miPokemon = new MoldePokemon("Charmander", "Fuego");
        System.out.println("El numero del prokemon es: " + miPokemon.getNumero());

        System.out.println("Probando Método to String: " + miPokemon.toString()); 
                
    }
}
