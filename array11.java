import java.util.ArrayList;
public class array11 {
   public static void main(String[] args) {
// Create the first ArrayList
       ArrayList<String> colors1 = new ArrayList<>();
// Add colors to the first ArrayList
       colors1.add("Red");
       colors1.add("Green");
       colors1.add("Blue");
       colors1.add("Yellow");
       colors1.add("Orange");
       System.out.println(" Vipashyana Wagh  0873CS231135");
       System.out.println("Original ArrayList: " + colors1);
// Create the second ArrayList
       ArrayList<String> colors2 = new ArrayList<>();
// Copy the first ArrayList into the second ArrayList
       colors2.addAll(colors1);
       System.out.println("Copied ArrayList: " + colors2);
   }
}
