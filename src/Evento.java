import java.util.Scanner;

public class Evento {
    private String lugar;
    private Personaje personaje;
    private Personaje oponente;
    private Scanner anyButton = new Scanner(System.in);
    private Dado dado = new Dado();


    public Evento(String lugar, Personaje personaje, Personaje oponente) {
        this.lugar = lugar;
        this.personaje = personaje;
        this.oponente = oponente;
    }

    public void calcularOrden() {}


    public void calcularAtaque(Personaje atacante, Personaje defensor) {
        int puntosDefensa = 0;
        atacante.setPuntosAtaque(dado.lanzarDado());
        System.out.println("el " + atacante.getClass() + ", lanza un ataque de " + atacante.getPuntosAtaque() + " puntos");
        puntosDefensa = dado.lanzarDado();
        System.out.println("el " + defensor.getClass() + ", se defiende obteniendo " + puntosDefensa + " puntos");
        if (atacante.getPuntosAtaque() > puntosDefensa) {
            int puntosDeVida = defensor.getPuntosDeVida();
            defensor.setPuntosDeVida((defensor.getPuntosDeVida() - atacante.getPuntosAtaque()));
            System.out.println("el " + defensor.getClass() + " Tiene actualmente " + defensor.getPuntosDeVida() + ", Puntos de vida");
        }
    }

    public boolean calcularEstadoBatalla() {
        boolean estado = true;
        if (personaje.getPuntosDeVida() < 1 || oponente.getPuntosDeVida() < 1) {
            estado = false;
        }
        return estado;
    }

    public void estadoBatalla() {
        System.out.println("Puntos de vida: " + oponente.getNombre() + " : " + oponente.getPuntosDeVida());
        System.out.println("Puntos de vida: " + personaje.getClass().getSimpleName() + " " + personaje.getNombre() + " : " + personaje.getPuntosDeVida());
        System.out.println("Oprima Enter para continuar");

    }

    public void generarBatalla() {
        boolean estadoBatalla = true;

        do {
            calcularAtaque(oponente, personaje);
            estadoBatalla = calcularEstadoBatalla();
            estadoBatalla();
            anyButton.nextLine();
            if (!estadoBatalla) break;
            calcularAtaque(personaje, oponente);
            estadoBatalla();
            anyButton.nextLine();
            estadoBatalla = calcularEstadoBatalla();


        }
        while (estadoBatalla);
        System.out.println("La batalla ha terminado!");

    }


}
