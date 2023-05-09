package us.sleepy;

class AlarmClockClient {

    // starting point or "entry point" for every standalone Java application
    public static void main(String[] args) {
        //create an instance of AlarmClock (an AlarmClock object) and set it's properties
        AlarmClock clock1 = new AlarmClock(7, 5);

        // create a 2nd instance of AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(10);

        // Create a 3rd AlarmClock object, BUT don't set its properties
        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_INTERVAL);

        // Make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        //show their toString() methods in action, typing in to.String is redundant bc automatically called
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);

    }
}