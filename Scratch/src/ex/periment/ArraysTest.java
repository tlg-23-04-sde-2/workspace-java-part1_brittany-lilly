package ex.periment;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];            //indexing starts at 0, so slots run 0-3
        ages[0] = 34;
        ages[1] = 28;
        ages[2] = 5;
        ages[3] = 99;
        System.out.println(ages);           //results in "[I@75bd9247"
        System.out.println(ages.length);    // results in size (4)
        System.out.println(Arrays.toString(ages));  // results [34,28,5,99]
        // attempting to type this failed. Get by clicking above highlighted 'ages' IntelliJ suggestion

        double[] temps = {64.0, 59.9, 83.4, 49.0, 98.6};
        for (double temp : temps) {         // if you use the for each you give up the index
            System.out.println("the temperature is: " + temp);
        }

        //the old way of doing it, pre-for each, still used sometimes
        System.out.println();
        for (int i = 0; i < temps.length; i++) {
            System.out.println("the temperature is: " + temps[i]);  //looks the same in output, harder to type ig..
        }

    }
}