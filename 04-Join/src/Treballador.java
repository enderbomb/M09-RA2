import java.util.Random;

public class Treballador extends Thread {
    private float sou_anual_brut;
    private int edat_inici_treball;
    private int edat_fi_treball;
    private int edat_actual;
    private float cobrat;
    private Random rnd = new Random();

    public Treballador(String name, float sou_anual_brut, int edat_inici_treball, int edat_fi_treball) {
        super(name);
        this.sou_anual_brut = sou_anual_brut;
        this.edat_inici_treball = edat_inici_treball;
        this.edat_fi_treball = edat_fi_treball;
        this.edat_actual = 0;
        this.cobrat = 0.0f;
    }

    public void cobra() {
        this.cobrat += sou_anual_brut / 12;
    }

    public void pagaImpostos() {
        this.cobrat = cobrat - ((sou_anual_brut / 12) * 0.24f);
    }

    public int getEdat() {
        return edat_actual;
    }

    public float getCobrat() {
        return cobrat;
    }

    @Override
    public void run() {
        edat_actual = edat_inici_treball;
        while (edat_actual < edat_fi_treball) {
            for (int i = 0; i < 12; i++) {
                cobra();
                pagaImpostos();
                try {
                    Thread.sleep(rnd.nextInt(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            edat_actual++;
        }
    }
}
