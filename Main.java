

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Nav nav = new Nav();
        Thread thread = new Thread(nav);
        thread.start();
    }
}
