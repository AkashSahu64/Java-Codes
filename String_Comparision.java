public class String_Comparision {
    public static void main(String[] args) {
        String s = "Akash";
        String s1 = "Sahu";
        String s2 = new String("Student");
        String s3 = new String("STUDENT");
        String s4 = new String(s);
        String s5 = "AKASH";
        String s6 = "SAHU";
        String s7 = "Student";
        boolean x = s.equals(s1);
        System.out.println(x);
        System.out.println(s.equals(s1));
        System.out.println(s.compareTo(s1));
        int y = s.compareTo(s1);
        boolean z= s==s1;
        System.out.println(z);
        System.out.println(s==s1);
        System.out.println(s2==s7);
        System.out.println(s2.equals(s7));
        System.out.println(s2.compareTo(s7));
        System.out.println(s==s5);
        System.out.println(s.equals(s5));
        System.out.println(s.equalsIgnoreCase(s5));
        System.out.println(s7.indexOf('u'));
        String s8 = "Here i am learn java with complete reference . this is good to learn java.";
        System.out.println(s8.lastIndexOf('t'));
        System.out.println(s.lastIndexOf('h'));
        System.out.println(s8.indexOf(7,'a'));
        System.out.println(s2.length());

    }
}
