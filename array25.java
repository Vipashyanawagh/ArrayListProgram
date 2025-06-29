import java.util.ArrayList;
public class array25 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add elements to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
       System.out.println("Vipashyana Wagh 0873CS231135");
       System.out.println("ArrayList elements using position:");
       for (int i = 0; i < colors.size(); i++) {
           System.out.println("Element at position " + (i + 1) + ": " + colors.get(i));
       }
   }
}
