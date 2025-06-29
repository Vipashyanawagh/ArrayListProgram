import java.util.ArrayList;
public class array24{
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
       System.out.println("Original ArrayList: " + colors);
// Replace the second element with a specified element
       String newElement = "Purple";
       colors.set(1, newElement);
       System.out.println("ArrayList after replacing the second element: " + colors);
   }
}
