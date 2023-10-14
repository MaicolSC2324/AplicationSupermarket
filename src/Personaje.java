public class Personaje {

    private String nombre;
    private char sexo;
    private double posicionX = 0, posicionY = 0;

    public Personaje(String nombre, char sexo){
        this.nombre = nombre;
        switch (sexo) {
            case 'M':
                this.sexo = sexo;
                break;
            case 'F':
                this.sexo = sexo;
                break;
            default:
                this.sexo = 'X';
                break;
        }
        
    }

    /* GETTERS */
        public String getNombre() {
            return this.nombre;
        }

        public char getSexo() {
            return this.sexo;
        }

        public double getPosicionX() {
            return this.posicionX;
        }

        public double getPosicionY() {
            return this.posicionY;
        }
    /* FINAL GETTERS */

    /* SETTERS */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public void setPosicionX(double posicionX) {
            this.posicionX = posicionX;
        }

        public void setPosicionY(double posicionY) {
            this.posicionY = posicionY;
        }
    /* FINAL SETTERS */

}
