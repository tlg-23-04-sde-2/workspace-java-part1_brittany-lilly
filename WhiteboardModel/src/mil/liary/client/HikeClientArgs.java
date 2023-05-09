package mil.liary.client;

import java.util.Arrays;

import mil.liary.*;
import mil.liary.Hike;
import mil.liary.RouteType;
import mil.liary.test.*;
import mil.liary.test.HikeValidationTest;

public class HikeClientArgs {
    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java HikesClientArgs <name> <mileLength> <elevationGain> <RouteType> <difficulty>\n";
            String example = "Example: Cape Flattery Trail, 1.2, 229, OUT_AND_BACK, Medium\n";
            String note1 = "Supported RouteTypes are: " + Arrays.toString(RouteType.values()) + "\n";
            String note2 = "Supported difficulties are: " + Arrays.toString(Hike.DIFFICULTY);
            System.out.println(usage + example + note1 + note2);
            return;
        }

        String name = args[0];
        double mileLength = Double.parseDouble(args[1]);
        int elevationGain = Integer.parseInt(args[2]);
        RouteType route = RouteType.valueOf(args[3].toUpperCase()); // since they are in all caps after all
        String difficulty = args[4];

        Hike hTest = new Hike(name, mileLength, elevationGain, route, difficulty);
        System.out.println("hTest is Hike test for HikeClientArgs");
        System.out.println(hTest);
    }
}