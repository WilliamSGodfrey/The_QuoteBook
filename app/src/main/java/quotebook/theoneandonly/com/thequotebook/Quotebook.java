package quotebook.theoneandonly.com.thequotebook;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class Quotebook extends android.app.Activity {

        int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotebook);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<Quote> quoteList = new ArrayList<Quote>();

        Quote quote4 = new Quote("Whatever in creation exists without my knowledge exists without my consent.", "Judge Holden");
        quoteList.add(quote4);

        Quote quote1 = new Quote("When the Lambs is lost in the mountain. They is cry. Sometime come the mother. Sometime the wolf.", "Mexican Leader");
        quoteList.add(quote1);

        Quote quote2 = new Quote("For whoever makes makes a shelter of reeds and hides has joined his spirit to the common destiny of creatures and he will subside back into the primal mud with scarcely a cry. But who builds in stone seeks to alter the structure of the universe and so it was with these masons however primitive their works may seem to us.", "Judge Holden");
        quoteList.add(quote2);

        Quote quote3 = new Quote("Men are born for games. Nothing else. Every child knows that play is nobler than work. He knows too that the worth or merit of a game is not inherent in the game itself but rather in the value of that which is put at hazard.", "Judge Holden");
        quoteList.add(quote3);

        Quote quote5 = new Quote("It makes no difference what men think of war.... War endures. As well ask men what they think of stone. War was always here. Before man was, war waited for him. The ultimate trade awaiting its ultimate practitioner.", "Judge Holden");
        quoteList.add(quote5);

        Quote quote7 = new Quote("There is no such joy in the tavern as upon the road thereto.", "Mennonite.");
        quoteList.add(quote7);

        Quote quote6 = new Quote("Females of domestic reputation lounged upon the balconies they passed with faces gotten up in indigo and almagre gaudy as the rumps of apes and they peered from behind their fans with a kind of lurid coyness like transvestites in a madhouse.", "Narrator");
        quoteList.add(quote6);

        //Add more quotes here


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < quoteList.size()) {

                    Quote q = quoteList.get(count);

                    quoteText.setText(q.getQuote());

                    personText.setText(q.getPerson());

                    count = count + 1;


                } else{

                    count = 0;

                }




            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quotebook, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
