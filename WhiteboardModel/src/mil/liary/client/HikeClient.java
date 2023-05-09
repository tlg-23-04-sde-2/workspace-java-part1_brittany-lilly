package mil.liary.client;

import mil.liary.*;
import mil.liary.Hike;
import mil.liary.RouteType;
import mil.liary.test.*;
import mil.liary.test.HikeValidationTest;

public class HikeClient {

    public static void main(String[] args) {
        //TODO: after packaging maybe redo following line **IF i even keep it
        System.out.println(Hike.getInstanceCount() + "instances were created.");

        Hike h1 = new Hike("Cape Flattery Trail", 1.2, 229, RouteType.OUT_AND_BACK,
                "Easy");
        Hike h2 = new Hike("Bridal Veil Falls Trail", 4.2, 1043, RouteType.OUT_AND_BACK,
                "Medium");
        Hike h3 = new Hike("Portland Walmart Parking Lot", 1.2, 5, RouteType.LOOP,
                "Hard");

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println();
        h1.startHiking();
        h1.finishHiking();



    }
}