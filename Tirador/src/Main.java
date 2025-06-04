import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.print("Enter your age: ");
        float age = scanner.nextFloat();

        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter what exercise you want to perform: ");
        String exercisesWantToPerform = scanner.nextLine();

        System.out.print("Enter your starting time: ");
        String startingTime = scanner.nextLine();

        System.out.print("Enter your duration: ");
        String duration = scanner.nextLine();

        System.out.print("Enter your ending time: ");
        String endTime = scanner.nextLine();

        System.out.print("Do you feel improvements to your body? (yes/no): ");
        String happy = scanner.nextLine();

        // Suggest exercises based on weight
        List<String> recommendedExercises = new ArrayList<>();
        if (weight > 75) { // Assuming 75 kg as a threshold for weight management
            recommendedExercises.add("Running or jogging");
            recommendedExercises.add("Cycling");
            recommendedExercises.add("Swimming");
            recommendedExercises.add("High-Intensity Interval Training (HIIT)");
            recommendedExercises.add("Strength training with weights");
        } else {
            recommendedExercises.add("Walking");
            recommendedExercises.add("Yoga");
            recommendedExercises.add("Pilates");
            recommendedExercises.add("Light strength training");
            recommendedExercises.add("Aerobics");
        }

        // Output
        System.out.println("\n---Setting Fitness---\n");
        System.out.println("Fullname: " + fullname);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Exercise: " + exercisesWantToPerform);
        System.out.println("Starting time: " + startingTime);
        System.out.println("Duration: " + duration);
        System.out.println("Ending time: " + endTime);
        System.out.println("Improvements felt: " + happy);

        System.out.println("\n---Recommended Exercises for Weight Management---");
        for (String exercise : recommendedExercises) {
            System.out.println("- " + exercise);
        }

        scanner.close();
    }
}