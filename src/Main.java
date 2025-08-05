public class Main {
    public static void main(String[] args) {

    Personaje jugador = new Guerrero("Juan",10,0,0,"Espada");
    Personaje oponente = new Oponente("Asesino",10,0,0);
        System.out.println("Puntos de vida oponente"+oponente.getPuntosDeVida());

    Evento evento = new Evento("Bosque",jugador,oponente);
    evento.generarBatalla();



    }
}