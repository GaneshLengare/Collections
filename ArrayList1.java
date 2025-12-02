import java.util.*;

        //ArrayList is a resizable array.
        //In normal arrays, size is fixed.
        //In ArrayList, size grows automatically when you add elements.
        //It allows duplicates and preserves order.

public class  ArrayList1{

    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();  //capacity = 0
        //After array complete full it generates new array with size 1.5x to old one
        //it is dump old one and creates new

        list.add("Ganesh");  //After adding first elements capacity = 10
        list.add("Nilesh");
        list.add("Shreyash");

        System.out.println(list); //[Ganesh, Nilesh, Shreyash]

        System.out.println(list.get(1));//Nilesh

        list.set(0, "GNS");//update the 0th index element
        System.out.println(list);//[GNS, Nilesh, Shreyash]

        list.remove(0);//removes elments on the 0th index
        System.out.println(list);//[Nilesh, Shreyash]

        System.out.println(list.contains("Ganesh"));//false
        //Check if available

        System.out.println(list.size());//2

        //list.clear();//removes all list elements
        System.out.println(list);//[]

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mithi");
        list1.add("Wankhede");

        list.addAll(list1);
        System.out.println(list);


            
    }

}