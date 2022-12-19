public class Homework {
    public static void main(String[] args) {
        //Write a Java program to print "Hello" on the screen and then print your name on a separate line
        //Expected output
        //Hello
        //Elena Skoorkhodov

        String txt = "Hello";
        String name = "Elena Skorokhodov";
        System.out.println(txt);
        System.out.println("My name is " + name);


        //Write a Java program to print the result of the following operations
        //a. -5 + 8*6
        //b. 20 + -3*5/8
        //Expected output for a = 43
        //Expected output for b = 19

        int negativeNum = -5;
        int b = 8;
        int c = 6;
        int aresult = negativeNum + (b * c);

        System.out.println("Result A is " + aresult);

        int num = 20;
        int num1 = -3;
        int num2 = 5;
        int num3 = 8;
        double result = (double)num1 * num2 / num3;
        double bresult = (double) num + result;


        System.out.println("Result B is " + bresult);



        //Write a java program with 5 decimal variables
        //Multiply all 5 of them and print results in the following format
        //Expected output number a * number b * ...equals <result>

        double x = 2.51;
        double y = 3.68;
        double z = 1.56;
        double d = 7.43;
        double e = 5.84;
        double dresult = x * y * z * d * e;

        System.out.println("x * y * z * d * e = " + dresult);














    }


}
