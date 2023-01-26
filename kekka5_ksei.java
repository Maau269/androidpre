package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka5_ksei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka5_ksei);

        //注文
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E7%91%9E%E6%B3%89-%E9%9D%92%E9%BE%8D-3%E5%B9%B4%E5%8F%A4%E9%85%92-30%E5%BA%A6-720ml/dp/B001TZ5A3W/ref=asc_df_B001TZ5A3W/?tag=jpgo-22&linkCode=df0&hvadid=204274139936&hvpos=&hvnetw=g&hvrand=1175510510403020810&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9053258&hvtargid=pla-339653735953&psc=1&th=1&psc=1");
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