import java.util.ArrayList;
public class array8 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add colors to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
       System.out.println("Vipashyana 0873CS231135");
       System.out.println("Original ArrayList: " + colors);
// Specify the index
       int index = 2;
// Remove the element at the specified index
       String removedColor = colors.remove(index);
       System.out.println("Removed color: " + removedColor);
       System.out.println("ArrayList after removal: " + colors);
   }
}

