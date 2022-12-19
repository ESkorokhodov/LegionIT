import java.util.Random;

public class NearHundred {


    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(80,100);
        System.out.println("number for testing "+n );
        NearHundred number = new NearHundred();
        boolean result =  number.nearHundred(n);

        if(result){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    //Given an int n, print true if it is within 10 of 100. Note:
    // nearHundred(93) → true
    //nearHundred(90) → true
    //nearHundred(89) → false


    public boolean nearHundred(int n) {
        if (90 <= n ) {
            return true;
        }else{
           return false;
        }
    }
}











