package us.badatmath;

class CalculatorClient {

    public static void main(String[] args) {

        double sum1 = Calculator.add(3,5); // you cannot 'pass' doubles where ints are expected. Error results
        System.out.println("The sum is: " + sum1);
        System.out.println("This one time math task i want to run is 3-5 = " + Calculator.subtract(3,5));
        double sum2 = Calculator.add(3.1, 5.2);
        System.out.println("I can keep ints & doubles in the same code, e.g. 3.1 + 5.2 = " + sum2);

        int input1 = 10;
        System.out.println("10 is even: " + Calculator.isEven(input1));
        int input2 = 11;
        System.out.println("11 is even: " + Calculator.isEven(input2));

        System.out.println(Calculator.getRandomInt());  // this is the line with the random line generator
//        System.out.println(result);

        System.out.println(Calculator.getAverage(3,5,9,9));   // any number of loose ints
        System.out.println(Calculator.getAverage(56));                  // can also pass nothing (returns NaN not a #)
         // could in .java if values.length == 0 sout error message: must pass at least 1 but we didn't do that
        // bc this is for us, never intended for non-coder person. client side != end user.

    }
}