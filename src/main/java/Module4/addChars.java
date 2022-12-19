package Module4;

public class addChars {
    public static void main(String[] args) {
        //StringBuilder str = new StringBuilder();
        char ch = 'g';
        char ch1 = 'd';
        char ch2 = 'y';

        String str = "dog";
        String str1 = "red";
        String str2 = "xy";
        //adding character at the beginning
        str = ch +str;
        str1 = ch1 + str1;
        str2 = ch2 + str2;
        //adding a character at the end
        str = str + ch;
        str1 = str1 + ch1;
        str2 = str2 + ch2;

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

    }

}
