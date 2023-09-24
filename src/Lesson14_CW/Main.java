package Lesson14_CW;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tester> testers=new ArrayList<>();
        testers.add(new Tester(1,"Antd"));
        testers.add(new Tester(2,"Andtd"));
        testers.add(new Tester(3,"Adntd"));
        testers.add(new Tester(4,"dAntd"));
        testers.add(new Tester(5,"dAdntd"));
        testers.add(new Tester(6,"Antdd"));
        testers.add(new Tester(7,"Antd"));
        testers.add(new Tester(8,"Andtd"));
        testers.add(new Tester(9,"Adntd"));
        testers.add(new Tester(10,"Antd1"));
        testers.add(new Tester(11,"Antdd"));
        System.out.println(testers.toString());
        System.out.println("-----------");

       testers.stream().filter(element-> element.getId()>3).filter(element->element.getName().startsWith("Ant"))
               .forEach(element-> System.out.println(element));

    }
}
