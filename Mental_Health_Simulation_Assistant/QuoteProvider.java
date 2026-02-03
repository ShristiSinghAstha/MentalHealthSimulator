package Mental_Health_Simulation_Assistant;

import java.util.Random;

public class QuoteProvider {
    private static String quotes[] ={
        "You are stronger than you think.",
        "Take one step at a time.",
        "This too shall paas.",
        "Breathe, YOU're doing OKAY!",
        "It's okay to ask for help.",
        "You matter, Your feelings are valid.",
        "Progress, not perfection."
    };

    public String getRandomQuotes(){
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}
