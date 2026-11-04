package game.entities;

public class Athlete {

    private final String name;
    private final int grade;

    // natural abilities
    int speed;
    double endurance; // from 0-100
    double potential; // 0-10

    // fitness
    double fitness; // 1-100
    double morale; // 1-10
    double confidence; // 1-100



    public Athlete(String name, int grade, int speed, double endurance, double potential, double fitness, double morale, double confidence) {
        this.name = name;
        this.grade = grade;
        this.speed = speed;
        this.endurance = endurance;
        this.potential = potential;
        this.fitness = fitness;
        this.morale = morale;
        this.confidence = confidence;
    }
    public void train(double fitnessGain) {
        this.fitness += fitnessGain;
        if (fitness > 100) {fitness = 100;}
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

    public double getMorale() {
        return morale;
    }

    public double getConfidence() {
        return confidence;
    }
}
