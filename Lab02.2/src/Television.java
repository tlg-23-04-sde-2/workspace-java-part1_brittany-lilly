import java.util.Arrays;

public class Television {
    // STATIC VARIABLES: get stored up top
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    private static boolean isValidBrand(String brand) {
        boolean valid = false;  //return value
        for(String validBrand : VALID_BRANDS) {
            if(validBrand.equals(brand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

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
    // PRESERVED CODE FOR LEARNING PURPOSES:
    //TESTING IF ELSE  **wrong but just for learning/practice purposes
//    public void setBrand(String brand) {
////        if (brand.equals("Samsung") ||
//              brand.equals("Sony")    ||
//              brand.equals("LG"))     ||
//              brand.equals("Toshiba") {
//                this.brand = brand;
//        } else {
//            System.out.println("Invalid brand" + brand + "." + " Valid brands are: Samsung, LG, Sony, Toshiba.");
//        }
//    }

    // BEGIN HOMEWORK SECTION ----------------------
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println(" Invalid brand: " + brand + ". Valid brands are: " + VALID_BRANDS);
        }
    }
    //TODO: figure how to reference following line in code below:
//    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba"};

//   boolean isValidBrand = false;      // make private, static, move with statics once i fix this fucking code
//    public void setBrand() {
//        for (String[] VALID_BRANDS : Television) {
//            if (Television.getBrand().equals(VALID_BRANDS)) {
//                this.brand = brand;
//                isValidBrand = true;
//                break;
//                System.out.println("Please do something at all");
//            } else {
//                System.out.println("Invalid brand... will update if i can get code working");
//            }
//        }
//        }

//    public void setBrand(String brand) {
//        for (String[] VALID_BRANDS : Television) ;{
//            System.out.println(brand);
//        // lab book pg 81 says use equals() for string comparison & to end loop early.
//        // also references private static boolean isVAlidBrand(String brand) & calling it from setBrand()
//                this.brand = brand;
//        }
////        else {
////            System.out.println("Invalid brand: " + brand + "." + " Valid brands are: Samsung, LG, Sony, Toshiba.");
////        }
//    }

        // PRESERVED CODE IN CASE I SUPER FUCK IT UP:
        //TESTING SWITCH FOR BRAND  --this is wrong, we should use enum, but were doing it for practice
//        public void setBrand(String brand) {
//        switch (brand) {case "LG": case "Sony": case "Samsung": case "Toshiba":
//                this.brand = brand;
//                break;
//            default:
//                this.brand = "unrecognized brand ";
//                System.out.println("Recognized brands are Sony, LG & Samsung");
//        }
//    }

        //  END HOMEWORK SECTION--------------------

    //oops did i cut this?
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
        return "This is a " + getBrand() + " " + getDisplay() + " television. Volume= " + volumeString;
    }
}