package net.flix;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic");
        movie1.setReleaseYear(1997);
        movie1.setRevenue(1_750_000_000.0);  //can pass double for Double, must keep ".0" bc int/Integer not int/Double
        movie1.setMatRate(Maturity.NC_17);
        movie1.setGenre(Genre.DRAMA);
        System.out.println(movie1);

        Movie movie2 = new Movie("Mario", 2023, 5_000_000.0, Maturity.PG, Genre.ACTION);
        System.out.println(movie2);

        Movie movie3 = new Movie("White Roses", Genre.ROMANCE);
        System.out.println(movie3);
    }
}