public class Guerrero extends Personaje implements Entrenable {
    private String arma;

    public Guerrero(String nombre, int nivel, int puntosDeVida, String arma) {
        super(nombre, nivel, puntosDeVida);
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

