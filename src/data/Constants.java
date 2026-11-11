package data;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.util.Random;
import java.io.FileReader;

import java.util.ArrayList;
public final class Constants {

    private static Random r = new Random();
    private static ArrayList<String> names = new ArrayList<>();

    
    static {

        String filePath = "src/data/Names.txt";

        try 
        (BufferedReader b = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = b.readLine()) != null) {names.add(line);}
        } catch (IOException e) {e.printStackTrace();}


    }

    public static String grabRandomName() {

        int range = r.nextInt(0, names.size());


        return names.get(range);
    }
    public static int randomGrade() {

        Random r = new Random();
        int randNum = r.nextInt(9,13);
        return randNum;

    }

    public static int randomSpeed() {
        int randNum = r.nextInt(0, 101);
        return randNum;
    }
    public static int randomEndurance() {
        int randNUm = r.nextInt(0, 101);
        return randNUm;
    }
    public static double randomPotential() {
        int randNum = r.nextInt(0, 11);
        return randNum;
    }
    public static int randomOverallFitness() {
        int randNum = r.nextInt(0, 1001);
        return randNum;
    }
    public static int randomWillpower() {
        int randNum = r.nextInt(1, 101);
        return randNum;
    }
    

}