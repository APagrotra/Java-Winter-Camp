import java.util.HashMap;
import java.util.Map;

public class Lecture2AssQuestions {
    public static void main(String[] args) {
//         String s1 = "Hello world this is java file";
//         String str[] = s1.split(" ");
// // Question 1
//         for(int i=str.length-1; i>=0; i--){
//             System.out.print(str[i]+" ");
//         }
// // Question 2
//         String str2 = "";
//         for(int i=0; i<str.length; i++){
//             str2 = str2+str[i];
//         }
//         System.out.println();
//         System.out.println(str2);
//         // ***********OR***********
//         System.out.println(s1.replaceAll(" ", ""));
// Question 3
        char s2[] = "maggi".toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            for(int i=0; i<s2.length; i++){
                if(map.containsKey(s2[i]))
                map.put(s2[i], map.get(s2[i])+1);
            }
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}