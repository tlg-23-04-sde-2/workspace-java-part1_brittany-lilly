package mil.liary;

import java.util.Arrays;
import mil.liary.client.*;
import mil.liary.client.HikeClient;
import mil.liary.client.HikeClientArgs;
import mil.liary.test.*;
import mil.liary.test.HikeValidationTest;

public class Hike {
    // STATIC VARIABLES:
    public static final String[] DIFFICULTY = {"Easy", "Medium", "Hard"};
    private static int instanceCount = 0;

    private static boolean isValidDifficulty(String difficulty) {
        boolean valid = false;
        for (String validDifficulty : DIFFICULTY) {
            if (validDifficulty.equals(difficulty)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    // PROPERTIES/ATTRIBUTES/FIELDS:
    private String name = "Unnamed Hike";
    private double mileLength;
    private int elevationGain;
    private RouteType route = RouteType.OUT_AND_BACK;
    private String difficulty;

    // CONSTRUCTORS:
    /*Excessive? yes, but is style preference for now while learning, so client updates as I type
     * Also, can help me catch if I swap order. I likely won't do this in another month. Sorry, Instructor Jay. :(
     */
    public Hike() {
    }
    public Hike(String name) {
        this();
        setName(name);
    }
    public Hike(String name, double mileLength) {
        this(name);
        setMileLength(mileLength);
    }
    public Hike(String name, double mileLength, int elevationGain) {
        this(name, mileLength);
        setElevationGain(elevationGain);
    }
    public Hike(String name, double mileLength, int elevationGain, RouteType route) {
        this(name, mileLength, elevationGain);
        setRoute(route);
    }
    public Hike(String name, double mileLength, int elevationGain, RouteType route, String difficulty) {
        this(name, mileLength, elevationGain, route);
        setDifficulty(difficulty);
    }

    // BUSINESS METHODS:
    public void startHiking() {
        System.out.println("You started hiking the " + name);
        boolean isConnected = isRaining();
    }
    public void finishHiking() {
        System.out.println("You finished your the " + name + " -Hmm.. The rain stopped.");
    }

    // ACCESSOR METHODS:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private double getMileLength(){
        return mileLength;
    }
    public void setMileLength(double mileLength) {
        this.mileLength = mileLength;
    }

    public int getElevationGain() {
        return elevationGain;
    }
    public void setElevationGain(int elevationGain) {
        this.elevationGain = elevationGain;
    }

    public RouteType getRoute() {
        return route;
    }
    public void setRoute(RouteType route) {
        this.route = route;
    }

    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        if(isValidDifficulty(difficulty)) {
            this.difficulty = difficulty;
        }
        else {
            System.out.println("Invalid Difficulty Input. " +
                    "Please choose a difficulty rating of: " + Arrays.toString(Hike.DIFFICULTY));
        }
    }

    //BOOLEAN:
    public boolean isRaining() {
            System.out.println("It started raining.");
            return true;
        }

    // toSTRING:
    public String toString() {
        return String.format("Hike name:%s, Mile length:%s, Elevation gain:%s, Route type:%s, Difficulty rating:%s",
                getName(), getMileLength(), getElevationGain(), getRoute(), getDifficulty());
    }
}