public class classPracticals {

public static void main (String... hhh)
    {
        classPracticals o = new classPracticals();
        int total1= o.addNumbers(5,7);
        int total2=o.addNumbers(4,9);
        System.out.println("The Sum of two numbers:"+ total1);
        System.out.println("The Sum of other two numbers:"+ total2);
    }

 public int addNumbers(int a, int b)
 {
     int sum = a + b;
     return sum;
 }



}
