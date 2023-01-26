package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class Kekka4_zanshiro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka4_zanshiro);
        Intent ke4 = getIntent();

        //注文
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E6%AF%94%E5%98%89%E9%85%92%E9%80%A0-%E6%AE%8B%E6%B3%A2-%E3%83%9B%E3%83%AF%E3%82%A4%E3%83%88-25%E5%BA%A6-720ml/dp/B001TZ1WLG/ref=asc_df_B001TZ1WLG/");
            Intent n = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(n);
        });



        //スタート画面に戻る
        Button btnBack2 = findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(v -> {


            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);



        });

    }
}