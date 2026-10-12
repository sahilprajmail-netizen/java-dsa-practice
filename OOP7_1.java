//OOP7_1. Create a HashMap<String, Integer> storing 4 students’ names and marks. Print all entries using a loop. Then look up and print one specific student’s marks using .get().

import java.util.HashMap;

public class OOP7_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Sahil", 92);
        students.put("Raj", 72);
        students.put("Dhairay", 98);
        students.put("Shlok", 81);
        for(String key : students.keySet()){
            System.out.println(key + "-->" + students.get(key));
        }
        System.out.println(students.get("Dhairay"));


    }
}
