import java.util.Scanner;

public class Coet {
    private Motor[] motors = { new Motor(), new Motor(), new Motor(), new Motor() };

    public void passaAPotencia(int p) {
        if (p < 0 || p > 10) {
            System.out.println("Error: la potència ha d'estar entre 0 i 10");
            return;
        }
        System.out.println("Passant a potència " + p);
        for (Motor m : motors) {
            m.setPotencia(p);
        }
    }

    public void arranca() {
        for (Motor m : motors) {
            m.start();
        }
    }

    public static void main(String[] args) {
        Coet coet = new Coet();
        Scanner scanner = new Scanner(System.in);
        boolean arrencat = false;
        int p = -1;

        while (p != 0) {
            p = scanner.nextInt();
            coet.passaAPotencia(p);
            if (!arrencat && p > 0 && p <= 10) {
                coet.arranca();
                arrencat = true;
            }
        }
    }
}
