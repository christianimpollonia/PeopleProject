import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2009, 10,25);
        Person christian = new Person ("Christian", "Impollonia", birthday);

        birthday = LocalDate.of(1, 1,13);
        Person alexander = new Person ("Alexander", "Thomas", birthday);

        birthday = LocalDate.of(1642, 1,2);
        Person laszlo = new Person ("Laszlo", "Cravensworth", birthday);

        birthday = LocalDate.of(1325, 6,26);
        Person bryan = new Person ("Bryan", "Steve", birthday);

        laszlo.getInfo();
        christian.getInfo();
        bryan.getInfo();
        alexander.getInfo();
        //Test printing Christian's info
//        christian.getInfo();
        System.out.println(Person.returnPopulation());
//
//        christian.changeFirstName("Geralt");
//
//        System.out.println(christian.getFirstName());



    }
}