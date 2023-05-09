package ex.periment;

class WrappersTest {
                               // [] below means array... but also args = array? oh man.
    public static void main(String[] args) {              //examples of static (factories?)
        String ageInput = "34";                           // i want it as an int so
        int age = Integer.parseInt(ageInput);             //takes the string ageInput and returns int
        Integer ageInteger = Integer.valueOf(ageInput);   //makes the strings & returns integer object

        String populationInput = "8_000_000_000";         // i want it long
        long population = Long.parseLong(populationInput);
        Long populationLong = Long.valueOf(populationInput);   // if i want it as a long object

        String salaryInput = "35_000.01";
        double salary = Double.parseDouble(salaryInput);       // parse for string & (?)
        // if i want it as big D double object
        Double salaryDouble = Double.valueOf(salaryInput);     //always value of for wrapped object

        String isCloudyInput = "true";     //not a boolean YET
        boolean isCloudy = Boolean.parseBoolean(isCloudyInput);   //paint means result of this is always true
        Boolean isCloudyBoolean = Boolean.valueOf(isCloudyInput);

        // ALL BELOW IS XFER'D TO MASS NOTES. DUPLICATE HERE, IN CASE ... it helps?
        // why wrapper? bc the information is coming from external sources as strings & i need it as some other
        // format, so i have to convert it. This is how i do it.
        // all enums get 1 of 2 (?) one is values
    }
        }