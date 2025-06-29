import java.util.ArrayList;
public class array15 {
   public static void main(String[] args) {
// Create the first ArrayList
       ArrayList<String> colors1 = new ArrayList<>();
       colors1.add("Red");
       colors1.add("Green");
       colors1.add("Blue");
// Create the second ArrayList
       ArrayList<String> colors2 = new ArrayList<>();
       colors2.add("Red");
       colors2.add("Green");
       colors2.add("Blue");
// Create the third ArrayList
       ArrayList<String> colors3 = new ArrayList<>();
       colors3.add("Red");
       colors3.add("Green");
       colors3.add("Yellow");
       System.out.println(" Vipashyana Wagh 0873CS231135");
       System.out.println("ArrayList 1: " + colors1);
       System.out.println("ArrayList 2: " + colors2);
       System.out.println("ArrayList 3: " + colors3);
// Compare ArrayList 1 and ArrayList 2
       if (colors1.equals(colors2)) {
           System.out.println("ArrayList 1 and ArrayList 2 are equal.");


       } else {
           System.out.println("ArrayList 1 and ArrayList 2 are not equal.");


       }
// Compare ArrayList 1 and ArrayList 3
       if (colors1.equals(colors3)) {
           System.out.println("ArrayList 1 and ArrayList 3 are equal.");


       } else {
           System.out.println("ArrayList 1 and ArrayList 3 are not equal.");
       }
   }
}
