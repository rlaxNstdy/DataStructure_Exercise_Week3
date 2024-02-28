import java.util.ArrayList;
// question no 7
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements [12, 25, 34, 46] to the ArrayList
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(46);

        // Remove the number 25 from the ArrayList
        numbers.remove(Integer.valueOf(25));

        // Print the final ArrayList
        System.out.println("Final ArrayList: " + numbers);
    }
}
