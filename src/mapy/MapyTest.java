package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Joanna");
        students.put(2,"Adam");
        students.put(3,"Kamil");

        System.out.println(students.get(1));

        Map<Integer,String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);


        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Kamil"));

        students.remove(1);
        System.out.println(students.size());

        for(Integer key : students.keySet()) {
            System.out.println(key);
            System.out.println(students.get(key));
        }
    for (String student : students.values()) {
        System.out.println(student);
    }


    }
}
