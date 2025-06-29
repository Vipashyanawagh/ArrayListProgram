import java.util.ArrayList;
public class array9 {
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
       System.out.println("ArrayList: " + colors);
// Specify the element to search for
       String targetColor = "Blue";
// Search for the element
       if (colors.contains(targetColor)) {
           System.out.println(targetColor + " is found in the ArrayList.")
;
                   System.out.println("Index of " + targetColor + ": " + colors.indexOf(targetColor));
       } else {
           System.out.println(targetColor + " is not found in the ArrayList.");


       }
   }
}
