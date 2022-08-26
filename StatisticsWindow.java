import javax.swing.*;
import java.util.ArrayList;
public class StatisticsWindow extends JFrame{

    private int totalMovieDuration;
    private int totalActionMovies;
    private int totalHorrorMovies;
    private int totalComedyMovies;
    private int totalDramaMovies;
    private int totalMoviesInCategory;
    private String categoryWithMostMovies;
    private String newestMovieYearName;
    private String oldestMovieYearName;

    public StatisticsWindow(ArrayList<Movie> moviesList) {

        int totalMovies = moviesList.size();

        int newestMovieYear = 5000;
        int oldestMovieYear = 1;
        for(Movie movie:moviesList) {
            totalMovieDuration += movie.getMovieDuration();

            switch (movie.getMovieCategory()) {
                case "Action" -> totalActionMovies++;
                case "Horror" -> totalHorrorMovies++;
                case "Comedy" -> totalComedyMovies++;
                case "Drama" -> totalDramaMovies++;
            }

            if(movie.getYearReleased() < newestMovieYear){
                newestMovieYear = movie.getYearReleased();
                newestMovieYearName = movie.getMovieTitle();
            }

            if(movie.getYearReleased() > oldestMovieYear){
                oldestMovieYear = movie.getYearReleased();
                oldestMovieYearName = movie.getMovieTitle();
            }

        }

        if(totalActionMovies > totalHorrorMovies &&
            totalActionMovies > totalComedyMovies &&
            totalActionMovies > totalDramaMovies) {
            categoryWithMostMovies = "Action";
            totalMoviesInCategory = totalActionMovies;
        } else if (totalHorrorMovies > totalActionMovies &&
                    totalHorrorMovies > totalComedyMovies &&
                    totalHorrorMovies > totalDramaMovies) {
            categoryWithMostMovies = "Horror";
            totalMoviesInCategory = totalHorrorMovies;
        } else if (totalComedyMovies > totalActionMovies &&
                    totalComedyMovies > totalHorrorMovies &&
                    totalComedyMovies > totalDramaMovies) {
            categoryWithMostMovies = "Comedy";
            totalMoviesInCategory = totalComedyMovies;
        } else if (totalDramaMovies > totalActionMovies &&
                    totalDramaMovies > totalHorrorMovies &&
                    totalDramaMovies > totalComedyMovies) {
            categoryWithMostMovies = "Drama";
            totalMoviesInCategory = totalDramaMovies;
        }

        double averageMovieDuration = totalMovieDuration / totalMovies;

        JLabel label = new JLabel("<html>Total movies: " + totalMovies + "<br/>" +
                                "<html>Average Duration of Movie: " + averageMovieDuration + "<br/>" +
                                "<html>Category with Most Movies: " + categoryWithMostMovies +
                                "<html>Number of movies in Category: " + totalMoviesInCategory + "<br/>" +
                                "<html>Oldest Movie: " + oldestMovieYearName + "Year: " + oldestMovieYear +
                                "<html>Newest Movie: " + newestMovieYearName + "Year: " + newestMovieYear);

        this.add(label);

        this.setSize(600, 600);
        this.setTitle("Movie Statistics");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
