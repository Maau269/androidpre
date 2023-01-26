package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka3_yoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka3_yoi);

        //注文
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E6%B3%A1%E7%9B%9B-%E7%B4%85%E8%8C%B6%E3%83%AA%E3%82%AD%E3%83%A5%E3%83%BC%E3%83%AB-%E5%AE%B5%E3%81%AE%E7%B4%85%E8%8C%B6-12%E5%BA%A6-500ml/dp/B07QHYTLVY");
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