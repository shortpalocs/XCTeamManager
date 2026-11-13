package game.entities;
import java.math.*;
import java.util.ArrayList;
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



    // AEROBIC CAPACITY: 0.40, LACTATE .30, RUNNINGE .20, SPEED .10
    
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
    private double morale; // value 1-100
    private double confidence;
    private double discipline;

    // dev
    private double potential;
    // FIX THIS CONSTRUCTOR WITH UPDATED VARIABLES
    // DONE: fixed constructor



    // TRAINING LOGS OVER THE WEEK
    ArrayList<Double> aeroStimlog = new ArrayList<>();
    ArrayList<Double> thresStimlog = new ArrayList<>();
    ArrayList<Double> speedStimlog = new ArrayList<>();
    ArrayList<Double> econStimlog = new ArrayList<>();



    public Athlete(String name, int grade, double lactateThreshold, double aerobicCapacity, double speed, double runningEconomy) {
        this.name = name;
        this.grade = grade;
        this.lactateThreshold = Math.clamp(lactateThreshold, 0, 100);
        this.aerobicCapacity = Math.clamp(aerobicCapacity, 0, 100);
    
        this.speed = Math.clamp(speed, 0, 100);
        this.runningEconomy = Math.clamp(runningEconomy, 0, 100);



        this.morale = 80;
        this.fatigue = 0;
        this.confidence = 60;
        this.discipline = 20;
        this.potential = (discipline * 0.80) + (morale * 1.2) + (confidence * 1.2);

    }

    // name, grade, LT, AE, speed, efficiency (running economy), fatigue, morale, confidence, discipline, potnetial

    @Override
public String toString() {
    return String.format("""
        Name: %s | Grade: %d | Base Fitness: %f | Lactate Thres: %d | Endurance: %f | speed: %f |
        Efficiency: %f | Fatigue: %f | Morale: %f | Confidence: %f | Discipline: %f | Potential: %f
        """,
        name, grade, getBaseFitness(), lactateThreshold, aerobicCapacity, speed, runningEconomy, fatigue, morale, confidence, discipline, potential
    );
}

    // AEROBIC CAPACITY: 0.40, LACTATE .30, RUNNINGE .20, SPEED .10
    // weighted sum of attributes 0-100
    // Calculates the Athletes current overall fitness with multiple values
    public double getBaseFitness() {
        return (aerobicCapacity * 0.40) + (lactateThreshold * 0.3) + (runningEconomy * 0.20) + (speed * .10);
    }

    public double getReadiness() {

        return Math.clamp(50 + 0.5 * (getBaseFitness() - fatigue) * runningEconomy, 0, 100);

    }


    public void storePhys(double aeroStim, double thresholdStim, double speedStim, double econStim) {

    
    aeroStimlog.add(aeroStim);
    thresStimlog.add(thresholdStim);
    speedStimlog.add(speedStim);
    econStimlog.add(econStim);

    }
 
    // CALL THIS AT THE END OF EVERY WEEK
    public void improvePhysiology(double aerobic, double threshold, double spd, double economy) {
        double potentialMultiplier = potential / 10.0;
        this.aerobicCapacity = Math.clamp(this.aerobicCapacity + (aerobic * potentialMultiplier), 0, 100);
        this.lactateThreshold = Math.clamp(this.lactateThreshold + (threshold * potentialMultiplier), 0, 100);
        this.speed = Math.clamp(this.speed + (spd * potentialMultiplier), 0, 100);
        this.runningEconomy = Math.clamp(this.runningEconomy + (economy * potentialMultiplier), 0, 100);
    }


    public void addFatigue(double amount) {

        this.fatigue = Math.clamp(this.fatigue += fatigue, 0, 100);
    }
    public void removeFatigue(double amount) {

        this.fatigue = Math.clamp(this.fatigue -= fatigue, 0, 100);
    }

    // TODO: implement so high fatigue will drop race times soon, if higher than X number add weighted seconds onto race times



    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getLactateThreshold() {
        return lactateThreshold;
    }

    public double getAerobicCapacity() {
        return aerobicCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    public double getRunningEconomy() {
        return runningEconomy;
    }

    public double getFatigue() {
        return fatigue;
    }

    public double getMorale() {
        return morale;
    }

    public double getConfidence() {
        return confidence;
    }

    public double getDiscipline() {
        return discipline;
    }

    public double getPotential() {
        return potential;
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
