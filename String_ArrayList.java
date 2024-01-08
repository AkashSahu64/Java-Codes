import java.util.*;
public class String_ArrayList {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list);
        for(String fruit:list)
            System.out.println(fruit);
        //accessing the element
        System.out.println("Returning element: "+list.get(1));
        //changing the element
        list.set(1,"Dates");
        //Traversing list
        for(String fruit:list)
            System.out.println(fruit);
        //Sorting the list
        System.out.println("Sorting.....");
        Collections.sort(list);
        //Traversing list through the for-each loop
        for(String fruit:list)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");
        //Creating a list of numbers
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number);
    }
}  