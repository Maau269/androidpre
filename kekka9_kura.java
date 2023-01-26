package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka9_kura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka9_kura);

        //注文ボタン
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
                    Uri uri = Uri.parse("https://www.amazon.co.jp/%E3%83%98%E3%83%AA%E3%82%AA%E3%82%B9%E9%85%92%E9%80%A0-%E3%81%8F%E3%82%89-%E5%8F%A4%E9%85%92-25%E5%BA%A6-1800ml/dp/B003355V3U/ref=asc_df_B003355V3U/?tag=jpgo-22&linkCode=df0&hvadid=204274139936&hvpos=&hvnetw=g&hvrand=1548714165742986240&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9053258&hvtargid=pla-339653740713&psc=1&th=1&psc=1");
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