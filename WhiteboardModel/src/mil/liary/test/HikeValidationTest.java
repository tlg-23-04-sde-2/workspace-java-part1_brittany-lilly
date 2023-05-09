package mil.liary.test;

import mil.liary.*;
import mil.liary.Hike;
import mil.liary.RouteType;
import mil.liary.client.*;
import mil.liary.client.HikeClient;
import mil.liary.client.HikeClientArgs;

public class HikeValidationTest {
    public static void main(String[] args) {
        Hike h = new Hike("Pretend Hike", 0.4, 15, RouteType.LOOP, "Easy");
        System.out.println(h);
        System.out.println();
//        h.setRoute("wrong");      // for your convenience
        h.setDifficulty("Wrong");



    }
}