import javax.management.ImmutableDescriptor;

public class Lecture3 {
    public static void main(String[] args) {
        // difference between String and StringBuffer
        String s = new String("Hello");
        s.concat("World");
        System.out.println(s);

        String s2 = new String("Hello");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Software");
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb==sb2);
        System.out.println(sb.equals(sb2));

        // final
        final StringBuffer str = new StringBuffer("Hello");
        str.append("World");
        System.out.println("For final "+str);
        // Objects are mutable and immutable
        // and final is used for veriables only
    }
}
