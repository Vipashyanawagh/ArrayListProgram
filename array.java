import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {
       System.out.println("Name : Vipashyana Wagh, Roll no. 0873CS231135");
       // Create an ArrayList
       ArrayList<String> originalList = new ArrayList<>();
       originalList.add("Apple");
       originalList.add("Banana");
       originalList.add("Cherry");


       // Print the original ArrayList
       System.out.println("Original List: " + originalList);


       // Clone the ArrayList
       ArrayList<String> clonedList = new ArrayList<>(originalList);


       // Print the cloned ArrayList
       System.out.println("Cloned List: " + clonedList);


       // Modify the cloned ArrayList
       clonedList.add("Date");


       // Print the modified cloned ArrayList
       System.out.println("Modified Cloned List: " + clonedList);


       // Print the original ArrayList to verify that it's unchanged
       System.out.println("Original List after modification: " + originalList);
   }
}

