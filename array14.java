import java.util.ArrayList;
import java.util.List;
public class array14 {
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
// Extract a portion of the ArrayList
       int start = 1;
       int end = 4;
       List<String> portion = colors.subList(start, end);
       System.out.println("Extracted portion: " + portion);
   }
}
