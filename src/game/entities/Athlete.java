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

    // phys stuff
    private double lactateThreshold;
    private double aerobicCapacity;
    private double speed;
    private double runningEconomy;

    // physical condition 0-100
    private double fatigue;

    // mental 0-100
    private double morale;
    private double confidence;
    private double discipline;

    // dev
    private int potential;


    
    


    // FIX THIS CONSTRUCTOR WITH UPDATED VARIABLES
    public Athlete(String name, int grade, int speed, double endurance, double potential, double fitness, double willpower) {
        this.name = name;
        this.grade = grade;
        this.speed = speed;
        // CLAMP AEROBIC CAPACITY FROM 0-100, LACTATE THRES, SPEED, RUNNING ECONOMY
        /* START FATIGUE AT 0
        MORALE AT 80
        CONFI AT 75
        DISCIP AT 70
        potential = Math.min(10, Math.max(1, potential))
        */ 
    
        
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

  /*   public int getSpeed() {
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
    */
   
}
