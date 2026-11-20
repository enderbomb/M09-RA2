import java.util.Random;

public class DormAleatori extends Thread {
    long ms;
    Random random = new Random();

    public static void main(String[] args) {

        DormAleatori fil1 = new DormAleatori("Joan");
        DormAleatori fil2 = new DormAleatori("Pep");

        fil1.start();
        fil2.start();
        System.out.println("-- Fi de main -----------");
    }

    public DormAleatori(String name) {
        super(name);
        ms = System.currentTimeMillis();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int sleep = random.nextInt(1000);
            long time =  System.currentTimeMillis() - ms;

            try {
                System.out.printf("%-4s(%d) a dormir  %3dms total  %4dms\n", getName(), i, sleep, time);
                sleep(sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}