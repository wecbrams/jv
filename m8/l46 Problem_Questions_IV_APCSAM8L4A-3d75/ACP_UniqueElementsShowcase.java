import java.util.ArrayList;

public class ACP_UniqueElementsShowcase {

    /**
     * Takes an ArrayList of Strings and returns a new ArrayList
     * containing only the unique elements from the input list.
     */
    public static ArrayList<String> findUniqueElements(ArrayList<String> inputList) {
        // Create a new ArrayList to hold the unique elements
        ArrayList<String> uniqueList = new ArrayList<>();
        
        // Loop through each element in the input list
        for (String element : inputList) {
            // If the new list does not already contain the element, add it
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        
        // Return the new list
        return uniqueList;
    }

    // Main method to demonstrate and showcase the understanding of arrays/ArrayLists
    public static void main(String[] args) {
        // 1. Initialize the input ArrayList with some duplicate values
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("apple"); // Duplicate
        originalList.add("orange");
        originalList.add("banana"); // Duplicate
        originalList.add("grape");

        System.out.println("Original List: " + originalList);

        // 2. Call the method to filter out unique elements
        ArrayList<String> resultList = findUniqueElements(originalList);

        // 3. Print the results to verify uniqueness and reference integrity
        System.out.println("Unique List:   " + resultList);
        
        // Verify that a new ArrayList object was created (not just a reference copy)
        boolean isSameReference = (originalList == resultList);
        System.out.println("Are they the same object reference? " + isSameReference);
    }
}
