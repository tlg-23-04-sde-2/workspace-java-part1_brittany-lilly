package us.badatmath;

class Calculator {

    public static double add(double a, double b) {return a + b;}

    public static double subtract(double a, double b) {return a - b;}

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


     // HINT: see a class called Math (in package java.lang), look for a helpful method here.
     // NOTE: these methods in the math class are all "static", which means  you call them as: Math.methodName()
     // Me note: you cannot say 'new math' because math is a static method...
     // Candidate method names: getRandom(), randomNumber(), generateRandomNumber(), getRandomInt()

    public static int getRandomInt() {
         // delegate to the min-max, passing 1 for the min and 14 for the max
        return getRandomInt(1, 14);
    }

    public static int getRandomInt(int min, int max) {
        double rand = Math.random();               // 0.000 to 8.999
        double scaled = rand * (max - min) + min;  // 5.000 to 19.985
        double rounded = Math.ceil(scaled);        // 5.000 to 20.000
        return (int) rounded;
    }
    // returns the average (arithmetic mean) of the supplied integers.
    // Method name ideas: getAverage(), aveInt(), averageator(), xbar(), getMean() *x bar means equals mean in stats
//    public static double getAverage(int... values) { **values changed to 'rest' -client can pass any number of ints
        // the above code allowed users to pass nothing resulting in NaN. We could print sout but we did below instead
    public static double getAverage(int first, int... rest) {
        double result = 0.0;    // i think he said we do not need these(?)

        double sum = first;
        for (int value : rest) {
            sum = sum + value;
        }
        result = sum / (1 + rest.length); // we could just put return sum over int and axe the other noted line
        // at runtime IS an array, even though it doesn't look like it

        return result;

    }

}