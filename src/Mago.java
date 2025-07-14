public class Mago extends Personaje implements Entrenable {
    private String elementoMagico;

    public Mago(String nombre, int nivel, int puntosDeVida, String elementoMagico) {
        super(nombre, nivel, puntosDeVida);
        this.elementoMagico = elementoMagico;
    }

    @Override
    public String realizarAccion() {
        return nombre + " lanza un hechizo de " + elementoMagico + ".";
    }

    @Override
    public void entrenar() {
        sumarPuntosExperiencia(15);

    }
}

