import java.util.ArrayList;
import java.util.Collections;
public class array12 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add colors to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
       System.out.println("Vipashyana Wagh  0873CS231135");
       System.out.println("Original ArrayList: " + colors);
// Shuffle the ArrayList
       Collections.shuffle(colors);
       System.out.println("Shuffled ArrayList: " + colors);
   }
}
