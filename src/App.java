import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args)  {
        
        MoldePokemon miPokemon = new MoldePokemon("Charmander", "Fuego");
        MoldePokemon otroPokemon = new MoldePokemon("Venusaur", "Planta");
        JOptionPane.showMessageDialog(null, miPokemon.luchar(otroPokemon, "Lanzallamas"), null, 0, null);
                        
    }
}
