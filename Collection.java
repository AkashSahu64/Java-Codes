
import java.util.*;
public class Collection {
    public static void main(String[] args) {
//        ArrayList<String>al = new ArrayList<String>();
//        LinkedList<String>al = new LinkedList<>();
//        Vector<String> al = new Vector<String>();
//        Stack<char> al = new Stack<char>();
//        al.push("A"); al.push("S"); al.push("K"); al.push("V");
//        al.pop();
        PriorityQueue<String> al = new PriorityQueue<String>();
        al.add("Akash"); al.add("Shivam"); al.add("Shubham"); al.add("Vinay");
        System.out.println("Adding: "+al.element());
        System.out.println("Add: "+al.peek());
        System.out.println("akk: "+al.size());
//        Iterator itr=al.iterator();
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        al.remove();
        al.poll();
        System.out.println("After Removing...");
        Iterator<String> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
