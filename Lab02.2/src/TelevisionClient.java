class TelevisionClient {

    // STARTING/ENTRY POINT: starts here (instances below)
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        Television tv1 = new Television("Samsung", 0, DisplayType.LED);  // ideal format
        System.out.println(tv1);

        Television tv2 = new Television();                             // old coding format
        tv2.setBrand("Sony");
        tv2.setVolume(5);
        System.out.println(tv2);

        Television tv3 = new Television("LG");
        System.out.println(tv3);

//        Television tv4 = new Television();                   // verify code/factory default settings
//        System.out.println(tv4);         // if i want i can mae another line in .java for volume only we won't in class

//        tv1.turnOn();
        tv2.turnOn();
//        tv1.turnOff();
        tv2.setVolume(Television.MIN_VOLUME);
//        tv3.turnOn();                                                  // #NeverGonnaSAYGoodbye
//        tv3.setVolume(Television.MAX_VOLUME);

//        System.out.println();
//        System.out.println(Television.getInstanceCount() + " instances have been created");

    }
}