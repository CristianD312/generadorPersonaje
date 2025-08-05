public class Oponente extends Personaje{


    public Oponente(String nombre, int puntosDeVida, int puntosExperiencia, int puntosDeAtaque) {
        super(nombre, puntosDeVida, puntosExperiencia, puntosDeAtaque);
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
