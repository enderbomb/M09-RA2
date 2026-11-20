
import java.util.Random;

public class Motor extends Thread {
    private static int contador = 0;
    private int id;
    private int potencia = 0;
    private int potenciaObjectiu = 0;

    public Motor() {
        this.id = contador;
        contador++;
    }

    public void setPotencia(int p) {
        potenciaObjectiu = p;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (potencia != 0 || potenciaObjectiu != 0) {

            if (potencia < potenciaObjectiu) {
                potencia++;
                System.out.printf("Motor %d: Incre. Objectiu: %d Actual: %d%n", id, potenciaObjectiu, potencia);

            } else if (potencia > potenciaObjectiu) {
                potencia--;
                System.out.printf("Motor %d: Decre. Objectiu: %d Actual: %d%n", id, potenciaObjectiu, potencia);

            } else {
                System.out.printf("Motor %d: FerRes. Objectiu: %d Actual: %d%n", id, potenciaObjectiu, potencia);
            }

            try {
                Thread.sleep(random.nextInt(1001) + 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.printf("Motor %d: FerRes. Objectiu: 0 Actual: 0%n", id);
    }

    public int getPotencia() {
        return potencia;
    }
}
