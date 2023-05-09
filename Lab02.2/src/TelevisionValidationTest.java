

// LAB07.1 TELEVISION
class TelevisionValidationTest {
    public static void main(String[] args) {
        //check -1 & 0, 100 & 101

        Television tv = new Television("LG", 32);  //should stick
        System.out.println(tv);

//        tv.setVolume(100);
//        System.out.println(tv);
//        tv.setVolume(-1);
//        System.out.println(tv);
//        tv.setVolume(101);
//        System.out.println(tv);
//        System.out.println();

//        tv.setBrand("Sony");
//        System.out.println(tv);
//        tv.setBrand("Samsung");
//        System.out.println(tv);

        tv.setBrand("Unknown Brand");
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);
    }

}