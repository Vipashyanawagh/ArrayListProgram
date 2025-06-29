import java.util.ArrayList;
public class array22{
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add elements to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       System.out.println("Vipashyana Wagh 0873CS231135");
       System.out.println("Initial ArrayList: " + colors);
       System.out.println("Initial capacity: " + colors.size());
// Add more elements to increase the capacity
       for (int i = 0; i < 10; i++) {
           colors.add("Color " + i);
       }
       System.out.println("ArrayList after adding more elements: " + colors);
       System.out.println("Capacity after adding more elements: " + colors.size());
// Trim the capacity of the ArrayList
       colors.trimToSize();
       System.out.println("ArrayList after trimming capacity: " + colors);
       System.out.println("Capacity after trimming: " + colors.size());
   }
}
