package M8Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number:  ");
        int day = in.nextInt();

        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String a = dayOfTheWeek.getDay(day);

        System.out.println(a);

    }

     public static String getDay(Integer day){
        ArrayList<String> dayName = new ArrayList<>();
        dayName.add ("Sunday");
        dayName.add ("Monday");
        dayName.add ("Tuesday");
        dayName.add ("Wednesday");
        dayName.add ("Thursday");
        dayName.add ("Friday");
        dayName.add ("Saturday");

        if (day == null){

            throw new NullPointerException();
        }
        else if (day < 1){
            return "The number should be equal or larger than 1";
        }
        else if (day > 7 ){
            return "The number should be equal or smaller than 7";
        }
        else{
            return dayName.get(day - 1);
        }
    }



}
