public class Builder {
    public static void main(String[] args) {

        Person person01 = new Person.Builder("Alin")
                .job("Consturctor")
                .university("Constructii")
                .isMarried(false)
                .build();

        Person person02 = new Person.Builder("Vasile")
                .drivingLicense("B")
                .isMarried(true)
                .build();
    }
}
