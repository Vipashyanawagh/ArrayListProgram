import java.util.ArrayList;
public class array6{
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
// Specify the index
       int index = 2;
// Retrieve the element at the specified index
       String color = colors.get(index);
       System.out.println("Element at index " + index + ": " + color);
   }
}
