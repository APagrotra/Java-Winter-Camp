import java.util.*;
public class Ass1Q5 {
    public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        int a1 = sc.nextInt();
        sc.nextLine();
        String s2 = sc.nextLine();
        int a2 = sc.nextInt();
        sc.nextLine();
        String s3 = sc.nextLine();
        int a3 = sc.nextInt();

        System.out.print(s1+"        ");
        if(a1/10 == 0){
            System.out.println("00"+a1);
        }
        else if(a1/10 < 10){
            System.out.println("0"+a1);
        }
        else{
            System.out.println(a1);
        }

        System.out.print(s2+"        ");
        if(a2/10 == 0){
            System.out.println("00"+a2);
        }
        else if(a2/10 < 10){
            System.out.println("0"+a2);
        }
        else{
            System.out.println(a2);
        }

        System.out.print(s3+"        ");
        if(a3/10 == 0){
            System.out.println("00"+a3);
        }
        else if(a3/10 < 10){
            System.out.println("0"+a3);
        }
        else{
            System.out.println(a3);
        }

    }
}
