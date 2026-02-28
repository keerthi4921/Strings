import java.util.Scanner;
public class stringmethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String name");
        String s=sc.nextLine();
        System.out.println("Length="+s.length());
        System.out.println("Uppercase="+s.toUpperCase());
        System.out.println("Lowercase="+s.toLowerCase());
        System.out.println("trim="+s.trim());
        System.out.println("SubString="+s.substring(2,6));
        System.out.println("Replaced="+s.replace("Computer science and Engineering","CSE"));
        System.out.println("Contains"+s.contains("Computer"));
        System.out.println("start with="+s.startsWith("Computer"));
        System.out.println("Index od="+s.indexOf("and"));
        System.out.println("End with"+s.endsWith("science"));
        System.out.println("Last index 0f="+s.lastIndexOf("Computer"));
    }


    
}
