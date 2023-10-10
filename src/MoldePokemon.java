public class MoldePokemon {
    
    /* Declaración de ATRIBUTOS (Caracaterísticas del pokemon) del OBJETO (clase Pokemon) */
    private double numero = 0;
    private String tipoPokemon, nombrePokemon;
    private boolean evolucion = true;

    /* Método CONSTRUCTOR para INICIALIZAR un ONJETO (Clase) desde otro archivo (clase) de java */
    public MoldePokemon(String nombrePokemon, String tipoPokemon){
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
    }

    /* Métodos Getters para OBTENER los valores de los ATRIBUTOS fuera de las clases  */
        //--- Como estos retornan valores, se deben poner "public TipoVariableARetornar NombreAtributoAModificar()" ---// 
    public String getNombrePokemon(){
        return this.nombrePokemon;
    }
    public String getTipoPokemon(){
        return this.tipoPokemon;
    }
    public boolean getEvolucion(){
        return this.evolucion;
    }
    public double getNumero() {
        return this.numero;
    }

    /*Métodos Setters para MODIFICAR los ATRIBUTOS de un OBJETO desde otra clase */
        //--- Como estosmétodos no retornan valores, se debe poner "public void NombreAtributoAModificar()" ---//
    public void setNombrePokemon(String nombrePokemon){
        this.nombrePokemon = nombrePokemon;
    }
    public void setTipoPokemon(String tipoPokemon){
        this.tipoPokemon = tipoPokemon;
    }
    public void setEvolucion(boolean evolucion){
        this.evolucion = evolucion;
    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    
}