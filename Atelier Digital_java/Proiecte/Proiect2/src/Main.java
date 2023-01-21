
public class Main {

    public static void main(String[] args) {
        Masina masina1 = new Masina.MasinaBuilder()
                .brand("Audi")
                .model("A3")
                .motor("1.9 ")
                .culoare("alb")
                .incalzireScaune(" fata")
                .build();

        Masina masina2 = new Masina.MasinaBuilder()
                .brand("Dacia")
                .model("Logan")
                .motor("1.5 DCI")
                .culoare("Furia R0sie")
                .build();

        Masina masina3 = new Masina.MasinaBuilder()
                .brand("Audi")
                .model("A6")
                .motor("2.2 TDI")
                .culoare("gri")
                .incalzireScaune("full")
                .bluetooth("penutlima versiune")
                .build();


        System.out.println(masina1.getCuloare());
        System.out.println(masina2.getModel());
        System.out.println(masina3.getCuloare());


    }
}