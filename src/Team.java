
import java.util.ArrayList;
import java.util.Collections;

import game.entities.Athlete; 

public class Team {

    private ArrayList<Athlete> athletes;
    private ArrayList<Integer> fatigueOverWeek = new ArrayList<>(); // we clear this AL at the end of every week

    public Team() {
        athletes = new ArrayList<>();
    }

    public void recruitAthlete(Athlete a) {

        if (athletes.size() < 15) {
            athletes.add(a);
        //    System.out.println("Athlete " + a.getName() + " added to roster");
        }
        else {
            System.out.println("too many ath");
        }

    }

    public int getRosterSize() {return athletes.size();}


    public double avgFitness(ArrayList<Athlete> a) {

        double s = 0.0;
        for (int i = 0; i < a.size(); i++) {
            Athlete curAthlete = a.get(i);
            s += curAthlete.getFitness();
        }
        double result = (s / a.size());
        return result;
    }
    public double avgEndur(ArrayList<Athlete> a) {

        double s = 0.0;
        for (int i = 0; i < a.size(); i++) {
            Athlete curAthlete = a.get(i);
            s += curAthlete.getEndurance();
        }
        double result = (s / a.size());
        return result;
    }


    public double getTeamStrength(ArrayList<Athlete> a) {
        
        if (a.size() < 1) return 0;

        double fit = avgFitness(a);
        double endur = avgEndur(a);


        double totalTeamStrength = (0.7 * fit) + (0.3 * endur);
        return totalTeamStrength;
    }


    public void trainTeam(ArrayList<Athlete> a, int intensity) {
        // 1 - easy / recovery run
        // 2 - long run
        // 3 - tempo 
        // 4 speed/track work
        fatigueOverWeek.add(intensity);
        for (Athlete athlete :  a) {
            if (intensity == 1) {
                // if its a recovery run, remove greatest effort from the week
                int max = Collections.max(fatigueOverWeek);
                fatigueOverWeek.remove(max);
            }
            if (intensity == 2) {
                athlete.train(3);

            }
            if (intensity == 3) {
                athlete.train(7);
            }
            if (intensity == 4) {
                athlete.train(13);
                // implement fatigue later
            }
        }

    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;

    }
    public void athleteToString() {

        for (Athlete a : athletes) {
            System.out.println(a.toString());
    }

    }

}
