public class GetChar {
    public static void main(String[] args) {
        String s = "Hello this is java program of string";
        char ch[] = new char[10];
        s.getChars(6,10,ch,2);
        System.out.println(ch);
    }
}
