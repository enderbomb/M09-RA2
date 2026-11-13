public class PrincipalEstricte {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan", 3);
        Fil pepe = new Fil("Pepe", 3);
        System.out.println("Termina thread main");
        juan.start();
        pepe.start();
    }
}
