import java.util.*;
public class Ass1Q6 {
    public static void main(String[] str) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int a = obj.nextInt();
        int b = obj.nextInt();

        String ans = s.substring(a,b);
        System.out.println(ans);
    }
}
