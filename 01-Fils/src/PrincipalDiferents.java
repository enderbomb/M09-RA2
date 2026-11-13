public class PrincipalDiferents {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan", 0);
        Fil pepe = new Fil("Pepe", 0);
        juan.setPriority(Thread.MAX_PRIORITY);
        pepe.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Acaba thread main");
        pepe.start();
        juan.start();
    }
}