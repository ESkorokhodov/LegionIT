package M5Homework;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        HashMap<Integer, String> toyByID = new HashMap<Integer, String>();
        toyByID.put(12, "Batmobile");
        toyByID.put(45, "Light Saber");
        toyByID.put(6, "Wonder Woman");
        toyByID.put(201, "Hello Kitty Bag");
        toyByID.put(56, "Junior QA Analyst Doll");

        System.out.println("Enter the Toy ID:  ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.next());
        String str = toyByID.get(id);

        if (toyByID.containsKey(id)) {
            System.out.println(str);
        } else {
            System.out.println("No such Toy");
        }

    }
}








