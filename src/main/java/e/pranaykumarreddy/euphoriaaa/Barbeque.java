package e.pranaykumarreddy.euphoriaaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Barbeque extends AppCompatActivity {

    private EditText edtName;
    private EditText edtRno;
    private EditText edtPhone;
    private EditText edtPrice;
    private Button register;

    //FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    //DatabaseReference databaseReference=firebaseDatabase.getReference();
    DatabaseReference databaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbeque);
        databaseUser = FirebaseDatabase.getInstance().getReference("Barbeque User");

        edtName=findViewById(R.id.breveragesnameet);
        edtPhone=findViewById(R.id.breveragesphoneet);
        edtPrice=findViewById(R.id.breveragesyourpriceet);
        edtRno=findViewById(R.id.breveragesrolleet);

        register=findViewById(R.id.registerbarbequebtn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
                Intent i =new Intent(Barbeque.this,results.class);
                startActivity(i);
            }
        });
    }
    private void addUser()
    {
        String name = edtName.getText().toString().trim();
        String phoneno = edtPhone.getText().toString().trim();
        String price = edtPrice.getText().toString().trim();
        String rollno = edtRno.getText().toString().trim();
        if(!TextUtils.isEmpty(name) || !TextUtils.isEmpty(phoneno) || !TextUtils.isEmpty(price) || !TextUtils.isEmpty(rollno)) {

            String id = databaseUser.push().getKey();
            User user =new User(id,name,phoneno,price,rollno);
            databaseUser.child(id).setValue(user);
            Toast.makeText(this,"User added successfully",Toast.LENGTH_SHORT).show();

        }else
        {
            Toast.makeText(this,"Fill all the details",Toast.LENGTH_SHORT).show();
        }
    }
}
