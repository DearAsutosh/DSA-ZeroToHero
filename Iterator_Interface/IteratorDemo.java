package Iterator_Interface;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        // Create a List
        List<String> names = new ArrayList<>();
        names.add("Ashutosh");
        names.add("Riya");
        names.add("Karan");
        names.add("Meera");

        // Get an iterator for the list
        Iterator<String> itr = names.iterator();

        System.out.println("Traversing using Iterator:");
        while (itr.hasNext()) {  // Check if next element exists
            String name = itr.next();  // Get the next element
            System.out.println(name);

            // Remove element if it equals "Karan"
            if (name.equals("Karan")) {
                itr.remove();  // Removes from underlying collection
            }
        }

        System.out.println("\nList after removal: " + names);

        // Java 8+ : forEachRemaining()
        Iterator<String> itr2 = names.iterator();
        System.out.println("\nUsing forEachRemaining():");
        itr2.forEachRemaining(n -> System.out.println("Hello, " + n));
    }
}
