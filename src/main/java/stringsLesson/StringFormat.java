package stringsLesson;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Vasiliy";
        String gender = "male";
        int age = 20;
        double salary = 5000.50d;

        System.out.println("The name is  " + name + " , gender is  " + gender + ", age is " + age + " , salary is " + salary);

        System.out.println(String.format("The name is %s, the gender is %s, the age is %d, the salary is %f", name, gender,age,salary));



    }
//outprint

  //  The name is  Vasiliy , gender is  male, age is 20 , salary is 5000.5
 //   The name is Vasiliy, the gender is male, the age is 20, the salary is 5000.500000

 //   Process finished with exit code 0




}
