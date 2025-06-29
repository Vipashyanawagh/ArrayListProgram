import java.util.ArrayList;
public class array23 {
   public static void main(String[] args) {
// Create an ArrayList
       ArrayList<String> colors = new ArrayList<>(5); // Initial capacity is 5
       System.out.println("Vipashyana Wagh 0873CS231114");
       System.out.println("Initial capacity: " + getCapacity(colors));
// Add elements to the ArrayList
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.add("Orange");
       System.out.println("ArrayList size after adding 5 elements: " + colors.size());
// Add more elements to increase the size
       colors.add("Purple");
       colors.add("Pink");
       System.out.println("ArrayList size after adding 2 more elements: " + colors.size());
   }


   // Helper method to estimate the capacity (Note: actual capacity may vary)
   private static int getCapacity(ArrayList<?> list) {
       try {
           java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
           field.setAccessible(true);
           Object[] array = (Object[]) field.get(list);
           return array.length;
       } catch (Exception e) {
           return -1; // Unable to estimate capacity
       }
   }
}
