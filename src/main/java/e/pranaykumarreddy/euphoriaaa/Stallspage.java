package e.pranaykumarreddy.euphoriaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Stallspage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stallspage);
    }

    public void shawarma(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("shawarma")) {
            Intent tday = new Intent(this, shawarma.class);
            startActivity(tday);
        }

    }
    public void waterauction(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("water")) {
            Intent tday = new Intent(this, waterauction.class);
            startActivity(tday);
        }

    }
    public void icecream(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Ice Cream")) {
            Intent tday = new Intent(this, icecream.class);
            startActivity(tday);
        }

    }
    public void barbeque(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("barbeque")) {
            Intent tday = new Intent(this, Barbeque.class);
            startActivity(tday);
        }

    }
    public void breverages(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("breverages")) {
            Intent tday = new Intent(this, Breverages.class);
            startActivity(tday);
        }

    }




}






