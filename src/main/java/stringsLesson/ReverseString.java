package stringsLesson;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString. reverseString("dog");

      // dog --> god (convert the word dog to god)
      // get the last letter (length-1) and add the first letter of the new word

    }

    public void reverseString (String textToReverse){
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()){
            System.out.println("The string is null or empty");
        }
        else{

            System.out.println(String.format("The input string is %s", textToReverse));
            String result = "";
            int lastLetter = textToReverse.length()-1;
            for (int i = lastLetter; i>=0; i--){
                result = result + textToReverse.charAt(i);
            }
            System.out.println(result);


        }
    }
}


    //output

//The input string is dog
//god

//Process finished with exit code 0