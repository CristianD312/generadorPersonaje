import java.util.Random;


public class Dado {
    public Random ramdom = new Random();
    public int lanzarDado(){
        return ramdom.nextInt(16)+1;

    }
}
