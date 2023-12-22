import java.util.Random;

public class Streaming {

    private Media[] media;
    private int seriesCount;
    private int moviesCount;


    public Streaming(int size) {
        media = new Media[size];
    }

    public Streaming(Media[] media) {
        this.media = media;
    }

    void add(Media media) {
        if (media instanceof Series) {
            seriesCount++;
        } else if (media instanceof Movie) {
            moviesCount++;
        }

        for (int i = 0; i < this.media.length; i++) {
            if (this.media[i] == null) {
                this.media[i] = media;
                return;
            }
        }
    }

    // TODO: вывести все фильмы/сериалы
    void displayAll() {
        for (Media m : media) {
            m.display();
        }
    }

    // TODO: вывести все фильмы
    void displayAllMovies() {
        for (Media m : media) {
            if (m instanceof Movie && !(m instanceof Series)) {
                m.display();
            }
        }
    }
//
//    // TODO: вывести все сериалы
    void displayAllSeries() {
        for (Media m : media) {
            if (m instanceof Series) {
                m.display();
            }
        }
    }
//
//    // TODO: получить самый старый фильм
    Movie getOldestMovie() {
        Movie oldestMovie = new Movie("", Integer.MAX_VALUE, 0.0, 0);
        for (Media m : media) {
            if (m instanceof Series) {
                continue;
            }
            if (m.getReleaseYear() < oldestMovie.getReleaseYear()) {
                oldestMovie = (Movie) m;
            }
        }
        return oldestMovie;
    }
//
//    // TODO: получить рандомный объект Media
    Media getRandom() {
        Random random = new Random();
        int index = random.nextInt(media.length);
        return media[index];
    }

    void play(Media media) {
        if (media instanceof Series) {
            System.out.println("Сериал");
        } else if (media instanceof Movie) {
            System.out.println("Фильм");
        }
        media.display();
    }
}
