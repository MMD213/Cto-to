import java.util.Random;

public class Nav implements Runnable {
    int t = 0;
    Random rd = new Random();
    int V1;

    int S = rd.nextInt(10000);
    int SrV;
    int V;
    int Kolv = 0;
    private int id;
    int a;
    int b=1;

    @Override
    public void run() {
        for (int i = 0; S > 0;) {
           V1=rd.nextInt(100)+1;
           V=V+V1;
           Kolv++;
           SrV=V/Kolv;
            t = S / SrV;
            S=S-V1;
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
    }
}

