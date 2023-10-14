public class SIMCard {

    private String empresaTelefonia = "HI", numeroTelefono;
    private double saldo = 0;

    public SIMCard(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }

    /* GETTERS */
        public String getEmpresaTelefonia(){
            return this.empresaTelefonia;
        }

        public String getNumerotelefono(){
            return this.numeroTelefono;
        }

        public double getSaldo(){
            return this.saldo;
        }
    /* FINAL GETTERS */

    /* SETTERS */
        public void setEmpresaTelefonia(String empresaTelefonia) {
            this.empresaTelefonia = empresaTelefonia;
        }

        public void setNumeroTelefono(String numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    /* FINAL SETTERS */

}
