public class TvShow {
    private String showName;
    private int episodes;
    private String genre;

    public TvShow(String showName, int episodes, String genre) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
    }

    public TvShow(int episode) {
        this.showName = "Action.";
        this.episodes = episode;
        this.genre = "Drama.";
    }

    public String getName() {
        return showName;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "The name of the show is " + this.getName() + " with " + this.getEpisodes() + " number of episodes. The genre is " + this.getGenre();
    }
}