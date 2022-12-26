import java.awt.*;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    /*
      -Access Modifier
      -Optional void
      -Return type
      -Name
      -Optional parameters
      -Method
      -Optional return value
    */

     private static int add(int n1, int n2){
         int sum = n1 + n2;
         return sum;
     }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world!");
        System.out.println(10 + 10);
        // primitives
        int number1 = 20;
        int number2 = 20;
        System.out.println(number1+number2);
        double pi = 3.14;
        boolean isAdult = true;
        char a = 'A';
        byte n = 127; // range is -128 to 128
        int ammount = 1_000_000_008;
        System.out.println(ammount);
        int numberOne = 10;
        int numberTwo = 10;
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne % numberTwo);
        // Naming variables
        int goals = 0;
        System.out.println(goals);
        // strings
        String brand = "Batik";
        System.out.println(brand);
        String tartan = "Tartan";
        String hq = "HQ";
        System.out.println(tartan + hq);
        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(2));
        System.out.println("   ".isEmpty());
        System.out.println("   ".isBlank());
        System.out.println("  a ".trim());
        Point pointA = new Point(10, 10); // point class
        System.out.println("pointA = " + pointA);
        // Arrays
        int[] numbers = new int[3];
        numbers[0] = 1; numbers[1] = 33; numbers[2] = 6;
        // printing elements
        System.out.println(
                Arrays.toString(numbers)
        );
        int len = numbers.length;
        int[] numbers2 = {0, 5, 6, 7, 8};
        System.out.println(Arrays.toString(numbers2));
        for (int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
        if(true){
            System.out.println("This code runs");
        }
        else{
            System.out.println("Nothing would happen");
        }
        int result = add(10 , 25);
        System.out.println(result);
        // Classes and Objects
        Cat cat = new Cat();
        cat.name = "tiku";
        cat.meow();
    }
    static class Cat{
         String name;
         void meow(){
             System.out.println(name + ": meow....");
         }
    }
}