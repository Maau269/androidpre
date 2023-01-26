package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import to.msn.wings.okinawa_aw.Que1;
import to.msn.wings.okinawa_aw.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Que1.class);
            startActivity(intent);

            }

        });

  /*      Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(v -> {
            EditText editName = findViewById(R.id.editName);

            Intent i = new Intent(this, Que1.class);
            i.putExtra("editName",editName.getText().toString());
            startActivity(i);



        });

   */




    }
}