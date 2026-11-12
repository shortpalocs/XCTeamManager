package game;
public class Workout {



    /* 
        workout will have attributes, 
        how much you develop
        its intensity
        fatigue
        
        
        expand more from other workouts you know

        // based off a workout passed into TrainingSystem, evaluate with formulas to improve their stats depending on
        // what type of workout it is
        

        // base gain off the type of workout alone, extras depending on other extra numbers given as well
        // make a pre defined catalogue of workouts, each with different uses, 

    */


    private String name;  // name of workout
    private int intensity; // intensity 1-10

    private double speedDevelopment; // how much speed you gain
    private double enduranceDevelopment; // how much endurance yo gain
    private double costFatigue; // how fatigued you get

    public Workout(String name, int intensity, double speedDevelopment, double enduranceDevelopment, double costFatigue) {
        this.name = name;
        this.intensity = intensity;
        this.speedDevelopment = speedDevelopment;
        this.enduranceDevelopment = enduranceDevelopment;
        this.costFatigue = costFatigue;
    }

    public String getName() {
        return name;
    }

    public int getIntensity() {
        return intensity;
    }

    public double getSpeedDevelopment() {
        return speedDevelopment;
    }

    public double getEnduranceDevelopment() {
        return enduranceDevelopment;
    }

    public double getCostFatigue() {
        return costFatigue;
    }


    
}