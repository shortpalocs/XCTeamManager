import java.util.ArrayList;

import game.Team;
import game.entities.*;
public class Main {

    // temporary to test code
    public static void main(String[] args) {

        GameState state = new GameState();
        Team t = state.getTeam();
        Recruitment recruitment = new Recruitment();

        recruitment.generateAthletes(t, 12);


        t.athleteToString();
        

        
        

    }
}