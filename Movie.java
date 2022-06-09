public class Movie {

    private int registryNumber;
    private String movieTitle;
    private int yearReleased;
    private int movieDuration;
    private String movieCategory;
    private String movieDirector;
    private String movieDistributionMethod;
    private int movieBudget;

    public Movie (int registryNumber,
                  String movieTitle,
                  int yearReleased,
                  int movieDuration,
                  String movieCategory,
                  String movieDirector,
                  String movieDistributionMethod,
                  int movieBudget) {
        this.movieTitle = movieTitle;
        this.yearReleased = yearReleased;
        this.movieDuration = movieDuration;
        this.movieCategory = movieCategory;
        this.movieDirector = movieDirector;
        this.movieDistributionMethod = movieDistributionMethod;
        this.movieBudget = movieBudget;
    }

    public int getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieDistributionMethod() {
        return movieDistributionMethod;
    }

    public void setMovieDistributionMethod(String movieDistributionMethod) {
        this.movieDistributionMethod = movieDistributionMethod;
    }

    public int getMovieBudget() {
        return movieBudget;
    }

    public void setMovieBudget(int movieBudget) {
        this.movieBudget = movieBudget;
    }

    @Override
    public String toString() {
        return registryNumber + "\t" +
                movieTitle + "\t" +
                yearReleased + "\t" +
                movieDuration + "\t" +
                movieCategory + "\t" +
                movieDirector + "\t" +
                movieDistributionMethod + "\t" +
                movieBudget;
    }
}
