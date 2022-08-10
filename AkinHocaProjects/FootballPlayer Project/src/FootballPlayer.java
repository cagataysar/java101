public class FootballPlayer {
    String name;
    boolean inPlay;
    int no;
    int minutes;
    int numberOfGoals;

    void play(int minutesToPlay) {
        minutes += minutesToPlay;
    }

    void score() {
        numberOfGoals++;
    }
}
