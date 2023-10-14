public class Autobus {
    
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;

    public Autobus(String nombreConductor){
        this.nombreConductor = nombreConductor;
    }

    /* GETTERS */
        public String getNombreConductor(){
            return this.nombreConductor;
        }

        public int getnPasajeros(){
            return this.nPasajeros;
        }

        public double getCantidadDinero(){
            return this.cantidadDinero;
        }
    /* FINAL GETTERS */

    /* SETTERS */
        public void setNombreConductor(String nombreConductor) {
            this.nombreConductor = nombreConductor;
        }

        public void setnPasajeros(int nPasajeros) {
            this.nPasajeros = nPasajeros;
        }

        public void setCantidadDinero(double cantidadDinero) {
            this.cantidadDinero = cantidadDinero;
        }
    /* FINAL SETTERS */
}
