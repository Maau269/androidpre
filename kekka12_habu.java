package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka12_habu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka12_habu);

        //注文ボタン
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E5%8D%97%E9%83%BD%E9%85%92%E9%80%A0%E6%89%80-%E3%83%8F%E3%83%96%E5%85%A5%E3%82%8A%E3%83%8F%E3%83%96%E9%85%92-35%E5%BA%A6800ml/dp/B003X1BG4M/ref=asc_df_B003X1BG4M/?tag=jpgo-22&linkCode=df0&hvadid=204345067411&hvpos=&hvnetw=g&hvrand=15775529966654930116&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9053258&hvtargid=pla-338366241002&psc=1&th=1&psc=1");
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