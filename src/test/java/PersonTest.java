import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PersonTest {
    @Test
    void getFirstName() {
        LocalDate birthday = LocalDate.of(2009, 10,25);
        Person christian = new Person ("Christian", "Impollonia", birthday);

        Assertions.assertEquals("Christian", christian.getFirstName());
    }

    @Test
    void getLastName() {
        LocalDate birthday = LocalDate.of(1, 1,13);
        Person alexander = new Person ("Alexander", "Thomas", birthday);

        Assertions.assertEquals("Thomas", alexander.getLastName());
    }

    @Test
    void getBirthDay() {
        LocalDate birthday = LocalDate.of(1642, 1,2);
        Person laszlo = new Person ("Laszlo", "Cravensworth", birthday);

        Assertions.assertEquals(birthday, laszlo.getBirthDay());

    }

    @Test
    void getAge() {
        LocalDate birthday = LocalDate.of(2022, 1,1);
        Person baby = new Person ("The", "Baby", birthday);

        Assertions.assertEquals(1, baby.getAge());
    }
//    @Test
//    void returnPopulation() {
//
//        LocalDate birthday = LocalDate.of(2009, 10,25);
//        Person christian = new Person ("Christian", "Impollonia", birthday);
//
//        birthday = LocalDate.of(1, 1,13);
//        Person alexander = new Person ("Alexander", "Thomas", birthday);
//
//        birthday = LocalDate.of(1642, 1,2);
//        Person laszlo = new Person ("Laszlo", "Cravensworth", birthday);
//
//        birthday = LocalDate.of(1325, 6,26);
//        Person bryan = new Person ("Bryan", "Steve", birthday);
//
//        Assertions.assertEquals(4,Person.returnPopulation());
//    }

    @Test
    void changeFirstName() {
        LocalDate birthday = LocalDate.of(2009, 10,25);
        Person christian = new Person ("Christian", "Impollonia", birthday);

        christian.changeFirstName("Geralt");

        Assertions.assertEquals("Geralt",christian.getFirstName());
    }

    @Test
    void changeLastName() {
        LocalDate birthday = LocalDate.of(2009, 10,25);
        Person christian = new Person ("Christian", "Impollonia", birthday);

        christian.changeLastName("Rivia");

        Assertions.assertEquals("Rivia",christian.getLastName());
    }

    @Test
    void getInfo() {
        LocalDate birthday = LocalDate.of(1642, 1,2);
        Person laszlo = new Person ("Laszlo", "Cravensworth", birthday);

        String info = "Laszlo Cravensworth was born on 1642-01-02, and is 381 years old.";

        Assertions.assertEquals(info, laszlo.getInfo());

    }
}