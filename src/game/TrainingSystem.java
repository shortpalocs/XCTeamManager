package game;
import game.entities.*;
public class TrainingSystem {


    public void rosterApplyWorkout(Team t, Workout w) {
        



        

    }


    // calculate fatigue
    // higher running economy = less fatigue penalty
    public void applyWorkout(Athlete a, Workout w) {
        double fatigueCost = w.getCostFatigue();
        double economyMult = 1.0 - (a.getRunningEconomy() / 400.00); 
        double actualF = fatigueCost * Math.max(0.7, economyMult); a.addFatigue(actualF);

        double intensity = w.getIntensity() / 5.0; // halves it for 5 to be baseline

        double aeroStim = w.getAerobicDevelopment() * intensity;
        double thresholdStim = w.getThresholdStimulus() * intensity;
        double speedStim = w.getSpeedStimulus() * intensity;
        double econStim = w.getRunningEconStimulus() * intensity;

        a.storePhys(aeroStim, thresholdStim, speedStim);
        // end of week, call improvePhys()




    }

}