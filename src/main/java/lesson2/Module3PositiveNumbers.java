package lesson2;

public class Module3PositiveNumbers {
    public static void main(String[] args) {
        // 1. The code should be able to print all of the positive integers from 1 to 100.
        //Additional requirements:
        //Print messages should contain the following details:
        //In the output, state whether each integer is ‘odd’ or ‘even’ in the output. ( *tip  (i % 2 == 0) will return true if  is odd)
        // If the number is divisible by three, instead of stating that the number is odd or even, state that the number is ‘divisible by three’.
        //If the number is divisible by both two and three, instead of saying that the number is odd, even or divisible by three; state that the number is ‘divisible by two and three’.
        // Design the logic of the loop to be as efficient as possible, using the minimal number of operations to perform the required logic.
        //Sample Output
        //The number ‘1’ is odd.
        //The number ‘2’ is even.
        //The number ‘3’ is divisible by three.

        //2. Create a method that will receive 2 numbers and calculate the summary of all the numbers between them.
        //for example:
        //a=1;
        //b=3
        //the result should be 6 (1+2+3)

        //3. Using two loops print upside-down pyramid on the screen (see and modify the numbers pyramid example in the lesson)
        //******
        //*****
        //****
        //***
        //**
        //*


        String txt = "1. The positive integers from 1 to 100:";
        System.out.println(txt);

        Module3PositiveNumbers loops = new Module3PositiveNumbers();
        loops.countNumbers();
        loops.SumOfAll(10, 18);
        loops.UpsideDownPyramid();

    }

    public void countNumbers() {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 & i % 3 == 0) {
                System.out.println("The number  " + i + "  - is divisible by two and three");

            } else if (i % 3 == 0) {
                System.out.println("The number  " + i + "  - is divisible by three");
            } else if (i % 2 == 0) {
                System.out.println("The number  " + i + "  - is even");
            } else {
                System.out.println("The number  " + i + "  - is odd");
            }

        }
    }


    public void SumOfAll(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("\n2. The Sum of all numbers between  " + a + "  and  " + b + "  is  " + sum);
    }

    public void UpsideDownPyramid() {
        System.out.println("\n3. UpsideDownPyramid");
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




































