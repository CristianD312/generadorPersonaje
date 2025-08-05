public class Mago extends Personaje implements Entrenable {
    private String elementoMagico;

    public Mago(String nombre, int puntosDeVida, int puntosExperiencia, int puntosDeAtaque, String elementoMagico) {
        super(nombre, puntosDeVida, puntosExperiencia, puntosDeAtaque);
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

