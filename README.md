# Java Set Duplicate Finder (Venn Diagram Concept)

This is a simple **Java** program that uses `HashSet` to compare two sets of elements and identify **duplicates (intersections)**. It represents the foundational logic behind a **Venn diagram**, focusing on set operations.

## What It Does

- Takes two sets of items (e.g., strings or integers)
- Uses `HashSet` to:
  - Store unique elements in each set
  - Find common elements using intersection
- Prints:
  - Items unique to each set
  - Items that appear in both sets

> Note: No graphics are used yet, but the output mimics Venn diagram set logic.

## Sample Code

```java
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
