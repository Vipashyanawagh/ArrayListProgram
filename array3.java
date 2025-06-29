.import java.util.ArrayList;

public class array3 {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        // Print the original ArrayLists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Join the two ArrayLists
        list1.addAll(list2);

        // Print the joined ArrayList
        System.out.println("Joined List: " + list1);
    }
}
