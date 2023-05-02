import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    public QuoteService(List<Quote> quotes) throws FileNotFoundException {
        this.quotes = quotes;
    }

    List<Quote> quotes = ReadFromFile.readFromFile( ("files/quote.txt"));


    public List<String> getAllQuotes() {
        List<String> allQuotes = new ArrayList<>();
        for (Quote quote: quotes){
            allQuotes.add(quote.getQuote());
        }
        return allQuotes;

    }
    public List<String> getQuotesForAuthor(String author){
        List<String> allQuotesForAnAuthor = new ArrayList<>();
        for(Quote quote: quotes){
            if(author.equals(( quote.getAuthor()))){
                allQuotesForAnAuthor.add(quote.getQuote());
            }
        }
        return allQuotesForAnAuthor;
    }
    public List<String> getAuthors(){
        List<String> distinctAuthorsList = new ArrayList<>();
        for(Quote quote:quotes){
            if(distinctAuthorsList.contains(quote.getAuthor())){
                continue;
            }
            distinctAuthorsList.add(quote.getAuthor());

        }
        return  distinctAuthorsList;
    }
    public void setFavourite(int id){
        for(Quote quote:quotes){
            if(id == quote.getId()){
                quote.setFavourite(true);
            }
        }
    }
    public List<Quote> getFavourites(){
        List<Quote> favouriteList= new ArrayList<>();
        for(Quote quote:quotes){
            if(quote.isFavourite()){
                favouriteList.add(quote);
            }

        }
        return favouriteList;
    }
    public String getRandomQuote(){
        Random random = new Random();
        int rndNum = random.nextInt(getAllQuotes().size());
        for(Quote quote: quotes){
            if(rndNum == quote.getId()){
                return quote.getQuote();
            }
        }
        return null;
    }


}











