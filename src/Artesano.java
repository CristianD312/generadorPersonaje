public class Artesano extends Personaje {
    private String especialidad;
    private Espada espada;
    private Pocion pocion;

    public Artesano(String nombre, int puntosDeVida, int puntosExperiencia, int puntosDeAtaque, String especialidad, Espada espada, Pocion pocion) {
        super(nombre, puntosDeVida, puntosExperiencia, puntosDeAtaque);
        this.especialidad = especialidad;
        this.espada = espada;
        this.pocion = pocion;
    }

    @Override
    public String realizarAccion() {
        return nombre + " crea un objeto con su especialidad en " + especialidad + ".";
    }
}


