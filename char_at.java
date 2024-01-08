public class char_at {
    public static void main(String[] args) {
        String s = "AKASH SAHU";
        char ch[] = {'A','K','A','S','H'};
        String s1 = new String(ch);
        System.out.println(s1);
        char c = s.charAt(3);
        System.out.println(c);
        String s2 = new String("Akash");
        System.out.println(s2);
//        for(int i =0; i<=s.length();i++){
//            System.out.println(s.charAt(i));
//        }
//        to find first and last charector of a string
        String s3 = "Hey I am Akash Sahu , Learning Java";
        int x = s3.length();
        System.out.println(x);
        System.out.println("Charector at 0 index : "+s3.charAt(0)+"\nCharector at last index : "+s3.charAt(x-1));
//        printing char at odd index
        int count = 0;
        for(int i=0; i<x; i++){
            if(i%2!=0){
                System.out.println("Char at index "+i+" is "+s3.charAt(i));
            }
            if(s3.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Frequency of a is : "+count);
    }
}
