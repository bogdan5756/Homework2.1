import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value1 = 33;
        changeValue1(value1);
        System.out.println("Value1 = " + value1);

        Integer value2 = 33;
        changeValue2(value2);
        System.out.println("Value2 = " + value2);

        Integer[] value3 = {3, 4};
        changeValue3(value3);
        System.out.println("Value3 = " + Arrays.toString(value3));

        Integer[] value4 = {3, 4};
        changeValue4(value4);
        System.out.println("Value4 = " + Arrays.toString(value4));

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson1(person);
        System.out.println("Person1 = " + person);

        Person person2 = new Person("Ilya", "Lagutenko");
        changePerson2(person2);
        System.out.println("Person2 = " + person2);
    }

    public static void changeValue1(int value) {
        value = 22;
    }

    public static void changeValue2(Integer value) {
        value = 22;
    }

    public static void changeValue3(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    public static void changeValue4(Integer[] value) {
        value[0] = 99;
    }

    public static void changePerson1(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson2(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}