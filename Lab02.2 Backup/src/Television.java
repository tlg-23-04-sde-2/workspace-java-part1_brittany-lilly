class Television {
    // STATIC VARIABLES: get stored up top
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount() {    // statics can only address other statics
        return instanceCount;
    }

    // PROPERTIES/ATTRIBUTES/FIELDS/INSTANCE VARIABLES start here
//    private String brand = "Toshiba";
    private String brand;
    private int volume = 1;

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

    // BUSINESS METHOD/TASKS: start here
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
    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("Sony") || brand.equals("Sony")) {
            this.brand = brand;
        }
        else {
            System.out.println("Unknown brand");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        // TODO: i personally would like to add extra if lines here, if max, if min, then else
        else {
            System.out.println(volume + " Volume limit reached! " +
                    "Volume must be between " + MIN_VOLUME + " & " + MAX_VOLUME);
//        this.volume = volume;
        }     // at some point this close curly got deleted-- all following code had errors. found this fixed it.
    }

    // BOOLEAN starts here bc idk where else to put it
    private boolean verifyInternetConnection() {
            return true;    //fake implementation for the sake of exercize
    }

    // toSTRING: starts here
    public String toString() {
            return "This is a " + getBrand() + " television. The volume is currently set to: " + getVolume();
    }
}