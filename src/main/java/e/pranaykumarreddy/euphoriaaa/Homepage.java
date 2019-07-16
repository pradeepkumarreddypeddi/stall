package e.pranaykumarreddy.euphoriaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Homepage extends AppCompatActivity {
    TextView textView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        textView = (TextView) findViewById(R.id.text);
        Button signupbtn=(Button)findViewById(R.id.button3);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String button_text;
                //button_text =((Button)View).getText().toString();
                //if(button_text.equals("signup"))
                //{
                    Intent SignUp1 = new Intent(getApplicationContext(), SIGNUP.class);
                    Log.i("check123","wirking");
                    startActivity(SignUp1);
                //}
            }
        });
    }

    @Override
    protected void onStart() {
    super.onStart();
    if (FirebaseAuth.getInstance().getCurrentUser() != null){
        Intent i = new Intent(Homepage.this,Stallspage.class);
        startActivity(i);
    }

    }

    public void Events(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("Events"))
        {
            Intent page2 = new Intent(this,page2.class);
            startActivity(page2);
        }

    }
    public void LOGIN(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("LOGIN"))
        {
            Intent Login = new Intent(this,LoginActivity.class);
            startActivity(Login);
        }

    }

    /*public void SIGNUP(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("signup"))
        {
            Intent SignUp1 = new Intent(this, SIGNUP.class);
            Log.i("check123","wirking");
            startActivity(SignUp1);
        }

    }*/
}
