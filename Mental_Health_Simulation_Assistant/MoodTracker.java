package Mental_Health_Simulation_Assistant;

import java.util.Scanner;

public class MoodTracker {
    public String askMood(Scanner sc,user user){
        System.out.println("Hii" +user.getName()+ ",how are you feeling today?");
        System.out.println("Options: Happy, Sad, Anxious, Angry, Tired, Excited, Neutral");
        System.out.println("You mood : ");
        String mood = sc.nextLine();
        return mood;
    }
}
