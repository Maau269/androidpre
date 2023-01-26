package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka2_ender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka2_ender);



        //注文
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E7%91%9E%E7%A9%82%E9%85%92%E9%80%A0-%E5%90%9F%E9%A6%99%E6%B3%A1%E7%9B%9B-ender-%E3%82%A8%E3%83%B3%E3%83%80%E3%83%BC-25%E5%BA%A6-1800ml/dp/B071Y2YLVM/" +
                    "");
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