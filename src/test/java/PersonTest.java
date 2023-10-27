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

        Assertions.assertEquals("Thomas", alexander.getFirstName());
    }

    @Test
    void getBirthDay() {
        LocalDate birthday = LocalDate.of(1642, 1,2);
        Person laszlo = new Person ("Laszlo", "Cravensworth", birthday);

        Assertions.assertEquals(birthday, laszlo.getBirthDay());

    }

    @Test
    void getAge() {
    }

    @Test
    void returnPopulation() {
    }

    @Test
    void changeFirstName() {
    }

    @Test
    void changeLastName() {
    }

    @Test
    void getInfo() {
    }
}