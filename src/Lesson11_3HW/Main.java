package Lesson11_3HW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> listPerson=new ArrayList<>();
        Person John=new Person("John");
        Person Tom=new Person("Tom");
        Person Ivan=new Person("Ivan");
        Person Jim=new Person("Jim");
       // Person Noa=new Person("Noa");
        listPerson.add(John);
        listPerson.add(Ivan);
        listPerson.add(Tom);
        listPerson.add(Jim);
        for (Person person:
             listPerson) {
            System.out.println(person.getName());
        }
        System.out.println();
        Ivan.setName("NOA");
        for (Person person:
                listPerson) {
            System.out.println(person.getName());
        }

        Person newPerson=new Person("newPerson");
        System.out.println("Tom in a List ? "+listPerson.contains(Tom));
        System.out.println("newPerson in a List ? "+listPerson.contains(newPerson));

        listPerson.remove(3);
        for (Person person:
                listPerson) {
            System.out.println(person.getName());
        }
        listPerson.removeAll(listPerson);
        System.out.println("----------");

        for (Person person:
                listPerson) {
            System.out.println(person.getName());
        }
    }
}
