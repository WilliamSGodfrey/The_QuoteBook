package quotebook.theoneandonly.com.thequotebook;

/**
 * Created by Will on 3/17/2015.
 */
public class Quote {

    public String quote;
    public String person;


    public Quote(String mQuote, String mPerson){
        super();

        quote = mQuote;
        person = mPerson;

    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }

}
