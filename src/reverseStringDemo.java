public class reverseStringDemo {

    public static void main(String... hhh){

        String p = "Priya";
        p=p.toLowerCase();
        String t ="";
        System.out.println(p.length());
        for(int i=p.length()-1; i>=0; i--)
        {

            t=t+p.charAt(i);
            t=t.toLowerCase();
        }
        System.out.println(t);
        System.out.println(p);

        if(t.equalsIgnoreCase(p)){
            System.out.println("Its a Palindrome");
        }
        else
            System.out.println("IT is not a Palindrome");



    }
}
