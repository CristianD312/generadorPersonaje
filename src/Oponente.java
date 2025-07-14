public class Oponente extends Personaje{
    private int puntosAtaque;


    public Oponente(String nombre, int nivel, int puntosDeVida, int puntosExperiencia, int puntosAtaque) {
        super(nombre, nivel, puntosDeVida, puntosExperiencia);
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String realizarAccion() {
        return "El Oponente "+getNombre()+"usa su ataque causando: "+getPuntosAtaque();
    }
}
