package net.flix;

enum Genre {         //the toString method in .java class pulls from here unless you specify bottom toString getDisplay
    COMEDY("Comedy"),    //there is no 'new' here, but with each new line, it IS essentially a 'new'
    ROMANCE("Romance"),
    ACTION("Action"),
    SCI_FI("Sci-Fi"),
    HORROR("Horror"),
    DOCUMENTARY("Documentary"),
    THRILLER("Thriller"),
    DRAMA("Drama");

    //everything below here is regular class definition stuff (fields, constructors, methods)
    private final String display;       //private & final: redundant bc enums=inherently private but good practice

    //CONSTRUCTORS: start here
    Genre(String display) {
//        System.out.println("Genre ctor called");  // this shows in run how it runs all 8 genres before code execute
        this.display = display;
    }

    //ACCESSOR METHODS: start here --provide 'read only' access to the display property
    public String getDisplay() {    //often when you ONLY have a getter, you don't use the 'get' prefix, optional tho
        return display;
    }
    public String toString() {
        return getDisplay();   // you could return the string 'display' but it is generally better to call getter
    }
}