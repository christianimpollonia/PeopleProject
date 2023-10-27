import java.time.*;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private static int population = 0;

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;

        population++;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public LocalDate getBirthDay(){
        return birthday;
    }
    public int getAge() {
        LocalDate now = LocalDate.now();

        Period p = Period.between(birthday, now);

        return p.getYears();
    }

    public static int returnPopulation() {
        return population;
    }


    //Setters
    public void changeFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void changeLastName(String newLastName) {
        lastName = newLastName;
    }

    //Info dump
    public String getInfo () {
        String info = firstName + " " + lastName + " was born on " + birthday + ", and is " + getAge() + " years old.";

        System.out.println(info);
        return info;
    }


}
