public class classPracticals {

public static void main (String[] args)
    {
        classPracticals o = new classPracticals();
        int total1= o.addNumbers(5,7);
        int total2=o.addNumbers(4,9);
        System.out.println("The Sum of two numbers:"+ total1);
        System.out.println("The Sum of other two numbers:"+ total2);
        o.stringFunctions();
    }

 public int addNumbers(int a, int b)
 {
     int sum = a + b;
     return sum;
 }

 public void stringFunctions(){

    String a = " Hello World ";
    System.out.println("The Length of the given String: "+ a.length()); // Returns the length of the String
    System.out.println("The Character at the given position: "+a.charAt(1)); //Returns the character at the specified position
     System.out.println("The Index of the given String: "+a.indexOf("W")); //Returns the position of the specified character
     System.out.println(a.substring(4,7));
     boolean i = a.isEmpty();
     System.out.println(i);
    if(a.trim().equalsIgnoreCase("Hello world")){
        System.out.println("It is equal");
    }
    else
        System.out.println("Its not equal");
 }




}
