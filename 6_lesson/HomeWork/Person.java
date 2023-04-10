import java.util.Random;

public class Person {
    String firstname;
    String lastname;
    Integer age;
    Character sex;
    Integer id;

    public String toString() {
        return String.format("id: %d, Имя: %s, Фамилия: %s, Пол: %s, Возраст: %d", id, firstname, lastname, sex, age);
    }

    public boolean equals(Object o) {
        Person t = (Person) o;
        return id == t.id;
    }

    public int hashCode() {
        Random rand = new Random();
        return id * rand.nextInt(1_000);
    }

}