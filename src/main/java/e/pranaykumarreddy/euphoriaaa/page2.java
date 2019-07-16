package e.pranaykumarreddy.euphoriaaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void TDAY(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("TDAY")) {
            Intent tday = new Intent(this, tday.class);
            startActivity(tday);
        }

    }
    public void DJNIGHT(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("DJNIGHT")) {
            Intent DJNIGHT = new Intent(this, DJNIGHT.class);
            startActivity(DJNIGHT);
        }

    }
    public void acumen(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Acumen")) {
            Intent DJNIGHT = new Intent(this, Acumen.class);
            startActivity(DJNIGHT);
        }

    }
}
