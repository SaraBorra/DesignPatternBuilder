//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Mario", "Rossi")
                .age(30)
                .address("Via Roma 1, Milano")
                .build();

        Person person2 = new Person.Builder("Luca", "Bianchi")
                .age(25)
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
