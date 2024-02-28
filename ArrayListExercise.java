import java.util.ArrayList;

public class ArrayListExercise {

    public static void main(String[] args) {
        // Creating and Initializing an ArrayList
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Hyundai");

        // Iterating Over the ArrayList
        System.out.println("Iterating over the cars ArrayList:");
        for (String color : cars) {
            System.out.println(color);
        }

        // Adding and Removing Elements
        cars.add(2, "Audi"); //
        cars.remove(1);        // Remove the second car
        System.out.println("\nUpdated cars ArrayList after adding and removing elements:");
        System.out.println(cars);

        // Searching for an Element
        String searchCar = "Honda";
        System.out.println("\nSearching for the car which is  '" + searchCar + "': " + searchColor(cars, searchCar));

        // Bonus Challenge: Duplicate Removal
        ArrayList<String> uniqueColors = removeDuplicates(cars);
        System.out.println("\nArrayList after removing duplicates:");
        System.out.println(uniqueColors);
    }

    // Searching for an Element
    private static String searchColor(ArrayList<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        if (position != -1) {
            return "Cars '" + searchTerm + "' found at position " + position + ".";
        } else {
            return "Cars '" + searchTerm + "' not found in the ArrayList.";
        }
    }

    // Bonus Challenge: Duplicate Removal
    private static ArrayList<String> removeDuplicates(ArrayList<String> cars) {
        ArrayList<String> uniqueCars = new ArrayList<>();
        for (String car : cars) {
            if (!uniqueCars.contains(car)) {
                uniqueCars.add(car);
            }
        }
        return uniqueCars;
    }
}
