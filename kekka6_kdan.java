package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka6_kdan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka6_kdan);


        //注文
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E7%A5%9E%E6%9D%91%E9%85%92%E9%80%A0-%E7%86%9F%E6%88%90%E5%8F%A4%E9%85%92-%E6%9A%96%E6%B5%81-%E7%90%A5%E7%8F%80%E4%BC%9D%E8%AA%AC-720ml/dp/B004OBO01G/");
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