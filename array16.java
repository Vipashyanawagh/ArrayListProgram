import java.util.ArrayList;
import java.util.Collections;
public class array16 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add colors to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
       System.out.println("Vipashyana Wagh 0873CS231135");
       System.out.println("Original ArrayList: " + colors);
// Specify the indices of the elements to swap
       int index1 = 1;
       int index2 = 3;
// Swap the elements
       Collections.swap(colors, index1, index2);
       System.out.println("ArrayList after swapping: " + colors);
   }
}
