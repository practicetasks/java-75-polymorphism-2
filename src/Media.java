public class Media {
    private String title;
    private int releaseYear;


    public Media(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public void display(){
        System.out.println("Название: " + title);
        System.out.println("Год выпуска: " + releaseYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
