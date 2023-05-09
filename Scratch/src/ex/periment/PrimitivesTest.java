package ex.periment;

class PrimitivesTest {
    public static void main(String[] args) {
        String name = "Lilly";
        System.out.println("coders name is: " + name);

        int age = 34;
        System.out.println("The value of age is: " + age);

        double shoeSize = 7.5;
        System.out.println("Shoe size is: " + shoeSize);

        char shirtSize = 'S';
        System.out.println("Shirt size is: " + shirtSize);

        boolean wearsGlasses = false;
        System.out.println("I wear glasses: " + wearsGlasses);

        long population = 8_000_000_000L;
        System.out.println("The population of earth is nearing: " + population);

        // TODO: print the following sentence as a string
        // The world "belly" makes me laugh
        System.out.println("The word 'belly' makes me laugh");
        System.out.println("The word \"belly\" makes me laugh");

        System.out.println();

        int i = 18;
        int j = i;
        System.out.println("The value of i is assigned to j. The value of i is: " + i + ". The value of j is: " + j);
        j++;
        System.out.println("Adding 1 to the value of j, makes j: " + j);
        System.out.println("while leaving the value of i as: " + i);
        System.out.println();

        int x = 3; // x is 3 here
        ++x; // x is 4 now
        System.out.println("Value of x is: " + x);
        System.out.println();

        int y = 3;
        System.out.println("y is: " + y);
        System.out.println("y is: " + y++);
        System.out.println("y is: " + +y);
        System.out.println("y is: " + ++y);  //interesting
        System.out.println("y is: " + y);


    }
}