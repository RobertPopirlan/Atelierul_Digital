public class MasinaNFS { private static MasinaNFS singuraInstanta;

    private MasinaNFS(){
    }

    public void fuge() {
        System.out.println("DomToreto merge legal");
    }

    public static MasinaNFS getInstance() {
        if (singuraInstanta == null) {
            singuraInstanta = new MasinaNFS();
        }

        return singuraInstanta;
    }
}

