/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */

// copy paste for edit configuration: Sony 15 Led
class TelevisionClientArgs {

    public static void main(String[] args) {  //run, edit config, application, args, program arguments
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {     //slots would be 0,1,2, length woudl be 3
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Note: supported brands are " + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;  // early return from main(), application exits
        }
        // alternatively i could put else here after the closing } of main

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
//        System.out.println("You provided " + args.length + " arguments");

        // STEP 1: convert the arguments into proper types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());  //i initially put 3 *remember, 0-1-2

        //STEP 2: create a Television object from these ingredients
        Television tv = new Television(brand, volume, display);

        // STEP 3: print it & congratulate them on their order
        System.out.println(" Congratulations on your order! It will arrive soon");
        System.out.println(tv);

    }
}