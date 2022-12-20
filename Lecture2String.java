import java.util.*;
public class Lecture2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        // s1 = s1.concat(s2);
        // System.out.println(s1);

        // charAt --------------------------
        // for(int i=0; i<s1.length();i++){
        //     System.out.println(s1.charAt(i));
        // }

        // compairTo & equals---------------
        System.out.println(s1.compareTo(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    

    }
}
