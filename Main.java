import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {
       System.out.println("Name : Vipashyana Wagh , Roll no . 0873CS231135");
       // Create an ArrayList
       ArrayList<String> list = new ArrayList<>(10);
       list.add("Apple");
       list.add("Banana");
       list.add("Cherry");


       // Print the original ArrayList
       System.out.println("Original List: " + list);


       // Print the capacity of the ArrayList
       System.out.println("Capacity before trimming: " + getCapacity(list));


       // Trim the capacity of the ArrayList
       list.trimToSize();


       // Print the capacity of the ArrayList after trimming
       System.out.println("Capacity after trimming: " + getCapacity(list));
   }


   // Method to get the capacity of an ArrayList
   public static int getCapacity(ArrayList<?> list) {
       try {
           java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
           field.setAccessible(true);
           Object[] array = (Object[]) field.get(list);
           return array.length;
       } catch (Exception e) {
           return -1; // Unable to get capacity
       }
   }
}
