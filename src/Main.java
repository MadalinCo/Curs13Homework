import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    List<Quote> quotes= ReadFromFile.readFromFile("files/quote.txt");

    QuoteService quoteService= new QuoteService(quotes) ;
        //System.out.println(quoteService.getQuotesForAuthor("unknown"));
        //System.out.println(quoteService.getAllQuotes());
        //System.out.println(quoteService.getAuthors());
        quoteService.setFavourite(22);
        quoteService.setFavourite(15);
        String favourite =  (quoteService.getFavourites()).toString();
        System.out.println(favourite);
        System.out.println( quoteService.getFavourites());
        //System.out.println(quoteService.getRandomQuote());
    }
}