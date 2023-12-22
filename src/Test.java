public class Test {
    public static void main(String[] args) {

//        String title, int releaseYear, double rating, int duration, int seriesCount
        Media[] media = {
                new Series("series1", 2022, 8.8, 190, 6),
                new Movie("movie1", 2020, 8.7, 100),
                new Series("series2", 2022, 8.8, 190, 7),
                new Movie("movie2", 2003, 8.7, 100),
                new Series("series2", 1999, 8.8, 190, 7),
        };

        Streaming streaming = new Streaming(media);
        streaming.getRandom().display();


    }

}
