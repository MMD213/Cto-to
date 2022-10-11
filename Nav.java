import java.util.Random;
import java.util.concurrent.Callable;

public class Nav implements Callable<Integer> {
    int t = 0;
    Random rd = new Random();
    int V1;

    int S = rd.nextInt(100000);
    int SrV;
    int V;
    int Kolv = 0;
    private int id;
    int a;
    int b;
    public Nav(int id) {
        this.id = id;
    }
    @Override
    public Integer call() throws Exception {
        for (int i = 0; S > 0;) {
           V1=rd.nextInt(100)+60;
           V=V+V1;
           Kolv++;
           SrV=V/Kolv;
            t = S / V1;
            S=S-a;
            a = (int) (V1 * 3.6);
            b = (int) ((SrV*3.6));
            System.out.println("distance "+S/1000+" KM");
            System.out.println("speed "+a+" KM/S");
            System.out.println("average speed "+b+" KM/S");
            System.out.println("time left "+t+" S");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

