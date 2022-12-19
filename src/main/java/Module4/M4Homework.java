package Module4;

public class M4Homework {

    public static void main(String[] args) {

        M4Homework m4Homework = new M4Homework();

        m4Homework.compareStrings("Category", "Cat");
        m4Homework.compareStrings("Lena", "lena");
        m4Homework.compareStrings("cat", "catalog");
        m4Homework.compareStrings("1", null);

    }

    public void compareStrings(String a, String b) {

        //print if one string is part of another
        //If Strings are equal, the expected print is: "The Strings are the same"
        //If one of the strings is a null -  print: "Cannot compare Strings"

        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
            return;
        } else if (a.equalsIgnoreCase(b)) {
            System.out.println(a + "  and " + b + "  Strings are the same");
            return;
        } else if (a.contains(b)) {
            System.out.println(b + " is a part of " + a);
        } else if (b.contains(a)) {
            System.out.println(a + " is a part of " + b);
        } else {
            System.out.println("Strings are NOT the same");
        }

    }


    }

















        













