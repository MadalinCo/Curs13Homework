public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite;

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return  quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public Quote(int id, String author, String quote, boolean favourite) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
    }
}
