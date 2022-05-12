public class Books {
    private String title;
    private int pages;
    private int year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getPages() {
        return pages + " pages";
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getTitle() + ", " + getPages() + ", " + getYear();
    }
}