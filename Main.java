

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws Exception {
        Callable callable = new Vses();
        FutureTask futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();

    }
    static class Vses implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            double t = 0;
            double S = (double) (Math.random() * 10000000) + 100;
            double U1 = (double) (Math.random() * 320) + 1;

            for (int i = 0; S>0; i++) {

                    t = S / U1;
                    Thread.sleep(100);
                    S = S - U1;
                    if(S<0){
                        System.out.println("До цели осталось меньше часа пути");
                        break;
                    }
                    System.out.println(t + " H " + U1 + " KM/H " + S + " KM");
            }
            return null;
        }
    }
}
