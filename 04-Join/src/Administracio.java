public class Administracio {

    private static int num_poblacio_activa = 50;
    private static Treballador[] poblacio_activa = new Treballador[num_poblacio_activa];

    public Administracio() {
        int i = 0;
        for (Treballador t : poblacio_activa) {
            poblacio_activa[i] = new Treballador("Ciutadà-" + (i), 25000, 20, 65);
            i++;
        }
    }

    public static void inici() throws InterruptedException {
        for (Treballador t: poblacio_activa) {
            t.start();
        }

        for (Treballador t : poblacio_activa) {
            t.join();
        }

        for (Treballador t : poblacio_activa) {
            System.out.printf("%-10s -> edat: %d / total: %.2f\n", t.getName(), t.getEdat(), t.getCobrat());
        }
    }

    static void main() throws InterruptedException {
        Administracio admin = new Administracio();
        inici();
    }
}