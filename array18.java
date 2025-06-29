import java.util.ArrayList;
public class array18 {
   public static void main(String[] args) {
// Create the first ArrayList
       ArrayList<String> colors1 = new ArrayList<>();
       colors1.add("Red");
       colors1.add("Green");
       colors1.add("Blue");
// Create the second ArrayList
       ArrayList<String> colors2 = new ArrayList<>();
       colors2.add("Yellow");
       colors2.add("Orange");
       colors2.add("Purple");
       System.out.println("Vipashyana Wagh 0873CS231135");
       System.out.println("ArrayList 1: " + colors1);
       System.out.println("ArrayList 2: " + colors2);
// Join the two ArrayLists
       colors1.addAll(colors2);
       System.out.println("Joined ArrayList: " + colors1);
   }
}
