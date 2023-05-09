package us.sleepy;

class AlarmClock {
    // PROPERTIES/ATTRIBUTES/FIELDS/INSTANCE VARIABLES start here
    //Static = shared variables (global to all alarm clocks)
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    private int snoozeInterval = 5;  // default value when client doesn't specify one
    private int repeat = 1;          // when client doesn't specify: default 1x


    // CONSTRUCTORS: start here
    public AlarmClock() {
        //no op
    }
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }
    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);   // delegate to ctor above me for snoozeInterval
        setRepeat(repeat);      // handle repeat myself, by delegating to its setter
    }

    // BUSINESS METHOD/TASKS: start here
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");   //call own getter
    }

    // ACCESSOR aka GET/SET METHODS: start here provide "controlled access" (to clients) the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;          // delegate to setter for validation/conversion
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println(snoozeInterval + " MINUTE SNOOZE NOT SET! " +
                    "Snooze must be between " + MIN_INTERVAL + " & " + MAX_INTERVAL + " minutes");
        }

    }
    public int getRepeat() {
        return repeat;
    }
    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    // toSTRING: starts here
    public String toString() {
        return getSnoozeInterval() + "m snooze set. " + "snooze will repeat " + getRepeat() + " time(s).";
        // there is no functional difference 'it is just a little bit  more OO"
    }
}