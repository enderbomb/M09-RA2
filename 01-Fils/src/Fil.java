public class Fil extends Thread {
    private String nom;
    private int mode;

    public Fil(String nom, int mode) {
        this.nom = nom;
        this.mode = mode;
    }

    @Override
    public void run() {
        if (mode == 3) {
            runEstricte();
        } else {
            runNormal();
        }
    }

    private void runNormal() {
        int num = 0;
        while (num < 9) {
            num++;
            for (int i = 0; i < 1000; i++) { }
            System.out.println(nom + " " + num);
        }
        System.out.println("Acaba el fil " + nom);
    }

    private void runEstricte() {
        int num = 0;
        while (num < 9) {
            num++;
            System.out.println(nom + " " + num);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) { }
        }
        System.out.println("Termina el fil " + nom);
    }
}
