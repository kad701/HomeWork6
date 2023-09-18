package Lesson11;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> listCountry=new ArrayList<>();
//        listCountry.add("Indonesia");
//        listCountry.add("Phillipines");
//        listCountry.add("India");
//        System.out.println(listCountry);
//        listCountry.set(2,"Egypet");
//        System.out.println(listCountry);
//        listCountry.remove(2);
//        System.out.println(listCountry);
//        listCountry.remove("Indonesia");
//        System.out.println(listCountry);
//        System.out.println("--------------");
//        listCountry.add("India");
//        listCountry.add("Indonesia");
//        System.out.println(listCountry);
//        System.out.println("Indonesia index is "+listCountry.indexOf("Indonesia"));
//        System.out.println("India in list "+listCountry.contains("India"));
//        System.out.println("Pakistan in list "+listCountry.contains("Pakistan"));
//        listCountry.add("Indonesia");
//        System.out.println(listCountry);
//        System.out.println(listCountry.hashCode());
//        System.out.println(listCountry);
//        listCountry.remove("Indonesia");
//        System.out.println(listCountry);
//        listCountry.remove("Indonesia");
//        System.out.println(listCountry);
//        listCountry.remove("Indonesia");
//        listCountry.add("Indonesia");
//        System.out.println(listCountry);

//        LinkedList<String> linkedListCountry = new LinkedList<>();
//        linkedListCountry.addLast("Thailand");
//        linkedListCountry.addLast("Nepal");
//        linkedListCountry.addFirst("Japan");
//        linkedListCountry.addFirst("South_Korea");
//        System.out.println(linkedListCountry);
//        linkedListCountry.removeFirst();
//        linkedListCountry.removeLast();
//        System.out.println(linkedListCountry);
//        linkedListCountry.addFirst("South_Korea");
//        linkedListCountry.addLast("Nepal");
//        System.out.println(linkedListCountry);
//        System.out.println("first element   =  "+linkedListCountry.getFirst());
//        System.out.println("last element   =  "+linkedListCountry.getLast());

        ///////////////////HashSet

//        HashSet<Person> hashSetPerson = new HashSet<>();
//        Person person1 = new Person("Adam");
//        Person person2 = new Person("John");
//        Person person3 = new Person("Michael");
//        Person person4 = new Person("Ray");
//        hashSetPerson.add(person1);
//        hashSetPerson.add(person2);
//        hashSetPerson.add(person3);
//        hashSetPerson.add(person4);
//        for (Person person :
//                hashSetPerson) {
//            System.out.println(person + " ");
//        }
//        hashSetPerson.remove(person2);
//        hashSetPerson.remove(person1);
//        hashSetPerson.remove(person3);
//
//        System.out.println("-----------");
//        for (Person person :
//                hashSetPerson) {
//            System.out.println(person + " ");
//        }
//        System.out.println("person4 in hash set --" + hashSetPerson.contains(person4));
//        System.out.println("person2 in hash set --" + hashSetPerson.contains(person2));

//////////////////// map


//        HashMap<Integer, String> hashMapCountry = new HashMap<Integer, String>();
//        hashMapCountry.put(1, "UAE");
//        hashMapCountry.put(2, "Iran");
//        hashMapCountry.put(3, "Iraq");
//        System.out.println(hashMapCountry);
//        hashMapCountry.remove(2);
//        hashMapCountry.remove(3);
//        System.out.println(hashMapCountry);
//        hashMapCountry.put(2, "Serbia");
//        hashMapCountry.put(6, "Montenegro");
//        System.out.println(hashMapCountry);
//        System.out.println("country 2 ---"+hashMapCountry.get(2));
//        System.out.println(hashMapCountry.keySet());
//        System.out.println(hashMapCountry.values());
//        System.out.println("IS Serbia in a set? "+hashMapCountry.containsValue("Serbia"));
//        System.out.println("IS Pakistan in a set? "+hashMapCountry.containsValue("Pakistan"));

        ArrayList<String> fruts=new ArrayList<>();
        fruts.add("Apple");
        fruts.add("Pineapple");
        fruts.add("Grapes");
        System.out.println(fruts);
        Iterator<String> iterator=fruts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();

        }
        System.out.println(fruts);
    }


}

