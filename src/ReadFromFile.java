import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadFromFile {

    public static List<Quote> readFromFile(String filePath) throws FileNotFoundException {
        List<Quote> quotes = new ArrayList<>();
        Scanner magicScanner = new Scanner(new File(filePath));
        int num = 1;
        while(magicScanner.hasNext()){
            String line = magicScanner.nextLine();
            String[] tokens = line.split((Pattern.quote("~")));
            quotes.add(new Quote(num, tokens[0], tokens[1], false));
            num++;
        }
        return quotes;

    }
}
