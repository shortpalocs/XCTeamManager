import java.util.ArrayList;
import game.entities.Athlete;

public class Team {

    private ArrayList<Athlete> athletes;

    public Team() {
        athletes = new ArrayList<>();
    }

    public void recruitAthlete(Athlete a) {

        if (athletes.size() < 15) {
            athletes.add(a);
            System.out.println("Athlete " + a.getName() + " added to roster");
        }
        else {
            System.out.println("too many ath");
        }

    }

    public int getRosterSize() {return athletes.size();}

}
