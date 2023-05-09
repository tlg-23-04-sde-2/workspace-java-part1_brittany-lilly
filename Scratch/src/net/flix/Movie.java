package net.flix;

class Movie {
    // PROPERTIES/ATTRIBUTES/FIELDS/INSTANCE VARIABLES start here
    private String title;        // default null
    private Integer releaseYear; //default 0 when int, now null bc Integer
    private Double revenue;      //default 0.0 with double, now null bc Double
    private Maturity matRate;    // default null
    private Genre genre;         // default null

    // CONSTRUCTORS: start here
    public Movie(String title) {
        setTitle(title);}
    public Movie(String title, Integer releaseYear) {
        // delegate to setters for any validation/conversion they might be doing
        this(title);                    // delegate to ctor above me for title
        setReleaseYear(releaseYear);    // delegate to its setter for validation
    }
    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }
    public Movie(String title, Integer releaseYear, Double revenue) {
        // delegate to setters for any validation/conversion they might be doing
        this(title);                    // delegate to ctor above me for title
        setReleaseYear(releaseYear);    // delegate to its setter for validation
        setRevenue(revenue);            // " "
    }
    public Movie(String title, Integer releaseYear, Double revenue, Maturity matRate) {
        // delegate to setters for any validation/conversion they might be doing
        this(title);                    // delegate to ctor above me for title
        setReleaseYear(releaseYear);    // delegate to its setter for validation
        setRevenue(revenue);            // " "
        setMatRate(matRate);            // " "
    }
    public Movie(String title, Integer releaseYear, Double revenue, Maturity matRate, Genre genre) {
        // delegate to setters for any validation/conversion they might be doing
        this(title, genre);             // delegate to ctor above me for title, genre
        setReleaseYear(releaseYear);    // delegate to its setter for validation
        setRevenue(revenue);            // " "
        setMatRate(matRate);            // " "
//        setGenre(genre);                // " " // commented out bc we put it in the this

    }

    // BUSINESS METHOD/TASKS: start here e.g. pause(), play(), stop(), rewind(), fastForawrd()


    // ACCESSOR METHODS (get/set) - these provide "controlled access" to the objects fields
    public String getTitle() {
        return title;
    }  //keeping in case we change title later. Easier for future edits
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Maturity getMatRate() {
        return matRate;
    }
    public void setMatRate(Maturity matRate) {
        this.matRate = matRate;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // toSTRING: starts here
    public String toString() {
        return String.format("Movie title=%s, releaseYear=%s, revenue=%,.2f, MatRate=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getMatRate(), getGenre());
    }
}