package us.sleepy;

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);    // this should work
        System.out.println(clock);

        clock.setSnoozeInterval(20);
        System.out.println(clock);

        clock.setSnoozeInterval(0);    //snooze interval is still set as 20 instead of defaulting to 5. Interesting
        System.out.println(clock);

        clock.setSnoozeInterval(21);
        System.out.println(clock);
    }
}