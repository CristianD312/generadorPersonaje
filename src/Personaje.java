public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;
    protected int puntosExperiencia;

    public Personaje(String nombre, int puntosDeVida, int puntosExperiencia) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntosDeVida = puntosDeVida;
        this.puntosExperiencia = puntosExperiencia;
    }

    public Personaje(String nombre, int nivel, int puntosDeVida, int puntosExperiencia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosExperiencia = puntosExperiencia;
    }

    public abstract String realizarAccion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }

    public void sumarPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia += puntosExperiencia;
        if (puntosExperiencia > 100) {nivel +=1;}
    }


}

