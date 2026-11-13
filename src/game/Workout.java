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

    private double aerobicStimulus; // 0-100
    private double thresholdStimulus;
    private double speedStimulus;
    private double runningEconStimulus;
    private double fatigue;

    public Workout(String name, int intensity, double aerobicStimulus, double thresholdStimulus, double speedStimulus, double runningEconStimulus, double fatigue) {


        this.name = name; // workout name
        this.intensity = intensity; // wokrout intensity
        this.aerobicStimulus = aerobicStimulus; // how much aerobic benefit you get from this workout, base off intensity
        this.thresholdStimulus = thresholdStimulus; // speed
        this.speedStimulus = speedStimulus;
        this.runningEconStimulus = runningEconStimulus;
        this.fatigue = fatigue;

    }

    public String getName() {
        return name;
    }

    public int getIntensity() {
        return intensity;
    }

    public double getAerobicStimulus() {
        return aerobicStimulus;
    }

    public double getThresholdStimulus() {
        return thresholdStimulus;
    }

    public double getRunningEconStimulus() {
        return runningEconStimulus;
    }

    public double getFatigue() {
        return fatigue;
    }

    public double getSpeedStimulus() {
        return speedStimulus;
    }

    public double getAerobicDevelopment() {
        return aerobicStimulus;
    }

    public double getCostFatigue() {
        return fatigue;
    }


    
}