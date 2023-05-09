class TelevisionValidationTest {
    public static void main(String[] args) {
        //check -1 & 0, 100 & 101

        Television tv = new Television();
        tv.setVolume(0);    //should stick
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);
        System.out.println();

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Will this print or error?");
        System.out.println(tv);
    }

}