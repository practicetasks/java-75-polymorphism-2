public class Series extends Movie {
    private int seriesCount;

    public Series(String title, int releaseYear, double rating, int duration, int seriesCount) {
        super(title, releaseYear, rating, duration);
        this.seriesCount = seriesCount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Кол-во серий: " + seriesCount);
    }

    public int getSeriesCount() {
        return seriesCount;
    }

    public void setSeriesCount(int seriesCount) {
        this.seriesCount = seriesCount;
    }
}
