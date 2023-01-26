package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka10_kiku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka10_kiku);

        //注文ボタン
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
                    Uri uri = Uri.parse("https://www.amazon.co.jp/%E6%B3%A1%E7%9B%9B-%E8%8F%8A%E4%B9%8B%E9%9C%B2VIP%E3%82%B4%E3%83%BC%E3%83%AB%E3%83%89-30%E5%BA%A6-720ml12%E6%9C%AC-1%E3%82%B1%E3%83%BC%E3%82%B9/dp/B00KBODEEE/ref=asc_df_B00KBODEEE/?tag=jpgo-22&linkCode=df0&hvadid=529623310744&hvpos=&hvnetw=g&hvrand=2409384856090457009&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9053258&hvtargid=pla-1436517692316&psc=1");
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