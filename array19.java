import java.util.ArrayList;
public class array19 {
   public static void main(String[] args) {
// Create the original ArrayList
       ArrayList<String> colors = new ArrayList<>();
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       System.out.println("Vipashyana Wagh  0873CS231135");
       System.out.println("Original ArrayList: " + colors);
// Clone the ArrayList
       ArrayList<String> clonedColors = new ArrayList<>(colors);
       System.out.println("Cloned ArrayList: " + clonedColors);
// Modify the cloned ArrayList
       clonedColors.add("Yellow");
       System.out.println("Original ArrayList after modification: " + colors);
       System.out.println("Cloned ArrayList after modification: " + clonedColors);
   }
}
