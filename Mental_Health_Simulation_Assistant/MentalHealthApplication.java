package Mental_Health_Simulation_Assistant;

import java.util.Scanner;

public class MentalHealthApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Mental Health Assistant!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        user currentUser = new user(name);
        Assistant assistant = new Assistant(currentUser);
        
        while(true) {
            System.out.println("\n=== Mental Health Assistant Menu ===");
            System.out.println("1. Start new session");
            System.out.println("2. Show mood history");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            
            String choice = scanner.nextLine();
            
            switch(choice) {
                case "1":
                    assistant.startSession(scanner);
                    break;
                case "2":
                    assistant.showMoodHistory();
                    break;
                case "3":
                    System.out.println("Thank you for using Mental Health Assistant. Take care!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}