public class Movie extends Media {
    private double rating;
    private int duration;

    public Movie(String title, int releaseYear, double rating, int duration) {
        super(title, releaseYear);
        this.rating = rating;
        this.duration = duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Рейтинг: " + rating);
        System.out.println("Длительность: " + duration);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
