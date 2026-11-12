package game.entities;

public class Athlete {

    
    
    
    
    /* ATHLETE CONDITIONS:
    


                                                ┌─────────────────────────────────────────┐
                                                │                 Athlete                 │
                                                └────────────────────┬────────────────────┘
                                                                    │
                                                ┌──────────────────┬───────────┴───────────┬──────────────────┐
                                                ▼                  ▼                       ▼                  ▼
                                        ┌───────────────┐  ┌───────────────┐       ┌───────────────┐  ┌───────────────┐
                                        │ Physiological │  │   Condition   │       │    Mental     │  │  Development  │
                                        ├───────────────┤  ├───────────────┤       ├───────────────┤  ├───────────────┤
                                        │ Aerobic Cap   │  │ Fatigue       │       │ Morale        │  │ Potential     │
                                        │ Threshold     │  │ Readiness     │       │ Confidence    │  │ Consistency   │
                                        │ Speed         │  └───────────────┘       │ Discipline    │  └───────────────┘
                                        │ Economy       │                          └───────────────┘
                                        └───────────────┘
*/




    
    
    
    
    
    
    private final String name;
    private final int grade;

    // natural abilities
    int speed;
    double endurance; // from 0-100
    double potential; // 0-10

    // fitness

    double fitness; // 1-100
    double willpower;





    public Athlete(String name, int grade, int speed, double endurance, double potential, double fitness, double willpower) {
        this.name = name;
        this.grade = grade;
        this.speed = speed;
        this.endurance = endurance;
        this.potential = potential;
        this.fitness = fitness;
        this.willpower = willpower;
        
    }
    public void train(double fitnessGain) {
        this.fitness += fitnessGain;
        if (fitness > 100) {fitness = 100;}
    }


    @Override
public String toString() {
    return String.format("""
        Name: %s | Grade: %d | Speed: %d | Endurance: %f | Potential: %f |
        Fitness: %f | Willpower: %f
        """,
        name, grade, speed, endurance, potential, fitness, willpower
    );
}


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getSpeed() {
        return speed;
    }

    public double getEndurance() {
        return endurance;
    }

    public double getPotential() {
        return potential;
    }

    public double getFitness() {
        return fitness;
    }

    public double getWillpower() {
        return willpower;
    }

   
}
