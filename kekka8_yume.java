package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class kekka8_yume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kekka8_yume);

        //注文ボタン
        Button btnOtsumami = findViewById(R.id.btnOtsumami);
        btnOtsumami.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://www.amazon.co.jp/%E5%A4%A2%E8%88%AA%E6%B5%B7-30%E5%BA%A61800ml/dp/B004OBKM2C/ref=pd_lpo_2?pd_rd_w=yxodV&content-id=amzn1.sym.d769922e-188a-40cc-a180-3315f856e8d6&pf_rd_p=d769922e-188a-40cc-a180-3315f856e8d6&pf_rd_r=X3GDMWCK3PT8WTMCFMAB&pd_rd_wg=kfNTS&pd_rd_r=7723432b-1ede-4e2d-a1ad-b05d35b28da0&pd_rd_i=B004OBKM2C&psc=1");
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