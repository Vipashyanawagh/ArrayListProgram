import java.util.ArrayList;
public class array5 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add colors to the ArrayList
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
       System.out.println("Vipashyana Wagh 0873CS231135");
       System.out.println("Original ArrayList: " + colors);
// Insert an element at the first position
       colors.add(0,
               "Red");
       System.out.println("ArrayList after inserting 'Red' at the first position: " + colors);
   }
}
