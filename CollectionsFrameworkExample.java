import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFrameworkExample {

    // Method to print elements of an ArrayList
    public static void PrintList(ArrayList<Double> list) {
        for (Double element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Step 1: Create an ArrayList of doubles
        ArrayList<Double> list = new ArrayList<>();

        // Step 2: Add the specified values to the list in the given order
        list.add(1.5);
        list.add(2.35);
        list.add(-4.7);
        list.add(0.01);

        // Step 3: Print the list using the PrintList method
        System.out.println("Original list:");
        PrintList(list);

        // Step 4: Sort the list
        Collections.sort(list);

        // Step 5: Print the sorted list using the PrintList method
        System.out.println("Sorted list:");
        PrintList(list);

        // Step 6: Search the list for the value 1.5
        int index = Collections.binarySearch(list, 1.5);

        // Step 7: Print the index where 1.5 was found
        System.out.println("Found 1.5 at index: " + index);

        // Step 8: Fill the list with 0.0
        Collections.fill(list, 0.0);

        // Step 9: Print the list after filling with 0.0
        System.out.println("Zero List:");
        PrintList(list);
    }
}
