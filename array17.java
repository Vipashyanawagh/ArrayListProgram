import java.util.ArrayList;
public class array17 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>();
// Add colors to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
// Iterate through the ArrayList using for-each loop
       System.out.println("Vipashyana Wagh 0873CS231135");
       System.out.println("Using for-each loop:");
       for (String color : colors) {
           System.out.println(color);
       }
// Iterate through the ArrayList using traditional for loop
       System.out.println("\nUsing traditional for loop:");
       for (int i = 0; i < colors.size(); i++) {
           System.out.println(colors.get(i));
       }
// Iterate through the ArrayList using Java 8 forEach method
       System.out.println("\nUsing Java 8 forEach method:");
       colors.forEach(color -> System.out.println(color));
// Iterate through the ArrayList using Java 8 forEach method with method reference
       System.out.println("\nUsing Java 8 forEach method with method reference:");
       colors.forEach(System.out::println);
   }
}
