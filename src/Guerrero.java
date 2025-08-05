public class Guerrero extends Personaje implements Entrenable {
    private String arma;

    public Guerrero(String nombre, int puntosDeVida, int puntosExperiencia, int puntosDeAtaque, String arma) {
        super(nombre, puntosDeVida, puntosExperiencia, puntosDeAtaque);
        this.arma = arma;
    }

    @Override
    public String realizarAccion() {
        return nombre + " ataca con su " + arma + ".";
    }

    @Override
    public void entrenar() {
        sumarPuntosExperiencia(10);

    }
}

