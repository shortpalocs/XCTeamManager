import java.util.Random;
import game.entities.Athlete;
import data.Constants;
class Recruitment {

    int count;

    Random r = new Random();


    public void generateAthletes(Team t, int count) {
        // Automatically will add Athletes to team Roster
        if(t.getRosterSize() + count > 15) System.out.println("too many athletes");

        for(int i = 0; i < count; i++) {
            String n = Constants.grabRandomName();
            int rg = Constants.randomGrade();
            int rs = Constants.randomSpeed();
            int re = Constants.randomEndurance();
            double rp = Constants.randomPotential();
            double rf = Constants.randomOverallFitness();
            double rw = Constants.randomWillpower();

            Athlete a = new Athlete(n, rg, rs, re, rp, rf, rw);
            t.recruitAthlete(a);

            

        }

    }


}