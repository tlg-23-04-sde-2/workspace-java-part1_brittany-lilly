class Television {   //VOLUME PRESET TV --NOT Lab02.2!!
    // STATIC VARIABLES: get stored up top
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount() {    // statics can only address other statics
        return instanceCount;
    }

    // PROPERTIES/ATTRIBUTES/FIELDS/INSTANCE VARIABLES start here
    private String brand;
    private int volume = 1;
    private DisplayType display = DisplayType.LED;         // otherwise 'null' if client doesn't say

    private boolean isMuted;
    private int oldVolume;

    // CONSTRUCTORS: start here
    public Television() {
        instanceCount++;
    }
    public Television(String brand) {
        this();                          //delegate to no-arg ctor for hte increment
        setBrand(brand);                 //delegate to its setter for any validation/conversion
    }
    public Television(String brand, int volume) {
        this(brand);                     //delegate to ctor aboce for brand
        setVolume(volume);               //handle colume myself, by delegate to its setter
    }
    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // BUSINESS METHOD/TASKS: start here
    public void mute() {
        if (!isMuted()) {                //not currently muted
            oldVolume = getVolume();
            volume = MIN_VOLUME;
            isMuted = true;
        }
        else {                           // currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void turnOn() {
        ///call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }
    public void turnOff() {
        System.out.println("Shutting down... goodbye");
    }

    // ACCESSOR METHODS start here
    public String getBrand() {
        return brand;
    }
    //TESTING IF ELSE
//    public void setBrand(String brand) {
////        if (brand.equals("Samsung") || brand.equals("Sony") || brand.equals("LG")) {
//        if (brand == "Samsung" || brand == "Sony" || brand == "LG") {
//            this.brand = brand;
//        } else {
//            System.out.println("Unknown brand");
//        }
//    }
    //TESTING SWITCH FOR BRAND
        public void setBrand(String brand) {
        switch (brand) {case "LG": case "Sony": case "Samsung":
                this.brand = brand;
                break;
            default:
                this.brand = "unrecognized brand ";
                System.out.println("Recognized brands are Sony, LG & Samsung");
        }
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.println(volume + " is an invalid volume! " +
                    "Volume must be between " + MIN_VOLUME + " & " + MAX_VOLUME);
        }     // at some point this close curly got deleted-- all following code had errors. found this fixed it.
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    // BOOLEAN starts here bc idk where else to put it
    private boolean verifyInternetConnection() {
            return true;    //fake implementation for the sake of exercize
    }
    public boolean isMuted() {
        return isMuted;
    }

    // toSTRING: starts here
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "This is a " + getBrand() + getDisplay() + " television. Volume= " + volumeString;
    }
}