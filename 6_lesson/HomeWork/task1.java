import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        final int arrSize = 10;
        Person[] personArray = new Person[arrSize];
        Random randSex = new Random();
        Random randAge = new Random();
        for (int i = 0; i < arrSize; i++) {
            personArray[i] = new Person();
            personArray[i].id = i;
            personArray[i].firstname = "Name_" + i;
            personArray[i].lastname = "Lastname_" + i;
            if (randSex.nextInt(10) < 5) {
                personArray[i].sex = 'F';
            } else {
                personArray[i].sex = 'M';
            }
            personArray[i].age = randAge.nextInt(80);
        }

        for (Person p : personArray) {
            if (p.age > 20) {
                System.out.println(p.toString());
            }
        }
    }
}