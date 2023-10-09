public class Superpersonaje {
    
    /* Atributos (Características o Cualidades) */
        private String Nombre, Poder, Equipo;
        private Integer Edad, Vidas;
        private double ValorComercial, NivelPoder;
        private Boolean ContieneAlas;
        private char genero;
    /* Final Atributos (Características o Cualidades) */

    /* Método Contructor */
        //----- Inicializa el Objeto -----//
        public Superpersonaje(String Nombre, String Poder, double ValorComercial, Boolean ContieneAlas){
            this.Nombre = Nombre;
            this.Poder = Poder;
            this.ValorComercial = ValorComercial;
            this.ContieneAlas = ContieneAlas;
        }
    /* Final Método Contructor */

    /* Getter */
        public String getNombre(){ 
            return this.Nombre; 
        }

        public String getPoder(){
            return this.Poder;
        }

        public double getValorComercial(){
            return this.ValorComercial;
        }
    /* Final Getters */

    /* SETTERs */
        public void setValorComercial(double ValorComercial){
            if (ValorComercial > 0){
                this.ValorComercial = ValorComercial;
            }
        }
    /* Final SETTERs */

    /* Métodos (Acciones) */
        //----- Esta es la estructura de los métodos (Acciones) que pueden realizar los objetos de la Clase -----//
    void correr(){
        System.out.println("El personaje " + this.Nombre + " está corriendo.");
    }

    void atacar(){

    }

    void saltar(){

    }

    void defender(){

    }

    void volar(){

    }

    void jugar(){

    }
}
