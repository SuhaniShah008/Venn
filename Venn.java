import java.util.HashSet;
import java.util.Set;

public class VennSet {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        // Sample data
        setA.add("apple");
        setA.add("banana");
        setA.add("cherry");

        setB.add("banana");
        setB.add("cherry");
        setB.add("date");
        setB.add("fig");

        // Find intersection (duplicates)
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // Unique to A
        Set<String> onlyA = new HashSet<>(setA);
        onlyA.removeAll(setB);

        // Unique to B
        Set<String> onlyB = new HashSet<>(setB);
        onlyB.removeAll(setA);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Duplicates (Intersection): " + intersection);
        System.out.println("Only in A: " + onlyA);
        System.out.println("Only in B: " + onlyB);
    }
}
