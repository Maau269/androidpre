package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka11_sen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka11_sen);

        //注文ボタン
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
                    Uri uri = Uri.parse("https://www.amazon.co.jp/%E4%BB%8A%E5%B8%B0%E4%BB%81%E9%85%92%E9%80%A0-%E6%B3%A1%E7%9B%9B-%E5%8D%83%E5%B9%B4%E3%81%AE%E9%9F%BF-%E9%95%B7%E6%9C%9F%E7%86%9F%E6%88%90%E5%8F%A4%E9%85%92-720ml/dp/B001TO7HH0/ref=asc_df_B001TO7HH0/?tag=jpgo-22&linkCode=df0&hvadid=204345067411&hvpos=&hvnetw=g&hvrand=152070090434288722&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9053258&hvtargid=pla-338957465269&psc=1&th=1&psc=1");
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