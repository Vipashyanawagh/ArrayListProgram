import java.util.ArrayList;
public class array7 {
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
// Specify the index and new value
       int index = 2;
       String newValue = "Purple";
// Update the element at the specified index
       colors.set(index, newValue);
       System.out.println("ArrayList after updating: " + colors);
   }
}
