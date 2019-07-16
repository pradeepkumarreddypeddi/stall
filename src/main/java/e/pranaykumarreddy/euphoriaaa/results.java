package e.pranaykumarreddy.euphoriaaa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class results extends AppCompatActivity {
    TextView users;
    Button getregisteredusers,backtoreg;
    DatabaseReference rootRef,demoRef,subdemoref;
    String name="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        getregisteredusers = findViewById(R.id.btnregusers);
        backtoreg = findViewById(R.id.backtoregbtn);
        users=findViewById(R.id.resultusers);
        rootRef = FirebaseDatabase.getInstance().getReference();
        getregisteredusers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rootRef.child("ShawarmaUser").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user;
                        for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()) {
                            user = dataSnapshot1.getValue(User.class);
                            name=name+"\n"+user.getUserid();
                            //Toast.makeText(results.this,"toast",Toast.LENGTH_SHORT).show();


                        }
                        Toast.makeText(results.this,"toast",Toast.LENGTH_SHORT).show();


                        users.setText(name);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        backtoreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(results.this,shawarma.class);
                startActivity(i);
            }
        });

        }
        }



