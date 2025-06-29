import java.util.ArrayList;
public class array21{
   public static void main(String[] args) {
// Create an empty ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Test if the ArrayList is empty
       if (colors.isEmpty()) {
           System.out.println(" Vipashyana Wagh 0873CS231135");
           System.out.println("The ArrayList is empty.");


       } else {
           System.out.println("The ArrayList is not empty.");


       }
// Add elements to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
// Test if the ArrayList is empty
       if (colors.isEmpty()) {
           System.out.println("The ArrayList is empty.");


       } else {
           System.out.println("The ArrayList is not empty. It contains " + colors.size() + "elements.");
       }
   }
}
