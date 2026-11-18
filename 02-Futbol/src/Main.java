
public class Main {
    static void main() {
        String[] names = {"Piqué", "Vinicus", "Torres", "Ramos", "Ronaldo", "Lewan", "Belli", "Arnau", "Aspas", "Messi", "Mbapé"};

        Futbolista[] futbolistas = new Futbolista[Futbolista.NUM_JUGADORS];

        for (int i = 0; i < futbolistas.length; i++) {
            futbolistas[i] = new Futbolista(names[i]);
        }

        for (int i = 0; i < futbolistas.length; i++) {
            futbolistas[i].start();
        }

        // hacer join

        for (int i = 0; i < futbolistas.length; i++) {
            System.out.printf("%-10s -> %2d gols\n", futbolistas[i].getName(), futbolistas[i].getGols());
        }
    }
}