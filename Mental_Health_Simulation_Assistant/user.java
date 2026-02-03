package Mental_Health_Simulation_Assistant;

import java.util.ArrayList;
import java.util.List;

public class user {
    private String name;
    private List<String> moodHistory;

    public user(String name) {
        this.name = name;
        this.moodHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMoodHistory(String mood) {
        moodHistory.add(mood);
    }

    public List<String> getMoodHistory() {
        return moodHistory;
    }
}
