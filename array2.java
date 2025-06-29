import java.util.ArrayList;


public class  Array2 {
   public static void main(String[] args) {
       // Create an ArrayList with initial capacity 10
       ArrayList<String> list = new ArrayList<>(10);


       // Add elements to the list
       list.add("Apple");
       list.add("Banana");
       list.add("Cherry");


       // Print the original list
       System.out.println("Original List: " + list);


       // Print the size of the list
       System.out.println("Size of the list: " + list.size());


       // Trim the capacity of the list to its current size
       list.trimToSize();


       // Print a message indicating that the capacity has been trimmed
       System.out.println("Capacity trimmed to size: " + list.size());
   }
}
