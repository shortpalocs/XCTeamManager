public class GameState {

    public int currentWeek = 1; // 12 total
    double budget;
    Team team;


    public GameState() {
        team = new Team();
        budget = 10000;
    }
    

    public Team getTeam() {return team;}

    public void advanceWeek() {
        if (currentWeek < 12) {
            currentWeek++;
        }
    }

    public int getCurrentWeek() {
        return currentWeek;
    }
    public double getBudget() {
        return budget;
    }


}
