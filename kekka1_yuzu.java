package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka1_yuzu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka1_yuzu);

        Intent ke1 = getIntent();

        //注文
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E8%AB%8B%E7%A6%8F%E9%85%92%E9%80%A0-%E8%AB%8B%E7%A6%8F%E6%9F%9A%E5%AD%90%E3%82%B7%E3%83%BC%E3%82%AF%E3%83%AE%E3%83%BC%E3%82%B5%E3%83%BC-720ml/dp/B00CXL4O56");
            Intent n = new Intent(Intent.ACTION_VIEW,uri);
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