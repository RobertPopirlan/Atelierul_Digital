public class Main {
    public static void main(String[] args) {
        Mancare pizza = new Pizza();
        CondimenteMancare busuioc = new Porumb(pizza);
        Mancare ananas = new Ciuperci(busuioc);

        System.out.println(ananas.getPret());
        System.out.println(ananas.getDescriere());

        Gyros gyros = new Gyros();
        Ardei ardei = new Ardei(gyros);
        Porumb porumb2 = new Porumb(ardei);
        System.out.println(porumb2.getPret());
        System.out.println(porumb2.getDescriere());
    }
}
