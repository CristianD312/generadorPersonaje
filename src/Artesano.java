public class Artesano extends Personaje {
    private String especialidad;
    private Espada espada;
    private Pocion pocion;

    public Artesano(String nombre, int nivel, int puntosDeVida, String especialidad) {
        super(nombre, nivel, puntosDeVida);
        this.especialidad = especialidad;
    }

    @Override
    public String realizarAccion() {
        return nombre + " crea un objeto con su especialidad en " + especialidad + ".";
    }
}


