package to.msn.wings.okinawa_aw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

 //       ImageView imageView2 = findViewById(R.id.);
  //      imageView2.setImageResource(R.drawable.hibiscus2);

        //インテント取得
        Intent kk =getIntent();
        Que1.Point point=(Que1.Point)kk.getSerializableExtra("point");

        //マックス値を取得
        int m = point.max();


        Button btnNextn =findViewById(R.id.btnNextn);
        btnNextn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (m) {

                    case 0:
                        Intent ke1 = new Intent(ResultActivity.this, kekka1_yuzu.class);
                        startActivity(ke1);

                        break;

                    case 1:
                        Intent ke2 = new Intent(ResultActivity.this, kekka2_ender.class);
                        startActivity(ke2);

                    case 2:
                        Intent ke3 = new Intent(ResultActivity.this, kekka3_yoi.class);
                        startActivity(ke3);

                        break;

                    case 3:
                        Intent ke4 = new Intent(ResultActivity.this, Kekka4_zanshiro.class);
                        startActivity(ke4);
                        break;

                    case 4:
                        Intent ke5 = new Intent(ResultActivity.this, kekka5_ksei.class);
                        startActivity(ke5);
                        break;


                    case 5:
                        Intent ke6 = new Intent(ResultActivity.this, kekka6_kdan.class);
                        startActivity(ke6);
                        break;

                    case 6:
                        Intent ke7 = new Intent(ResultActivity.this, kekka7_zanp.class);
                        startActivity(ke7);
                        break;

                    case 7:
                        Intent ke8 = new Intent(ResultActivity.this, kekka8_yume.class);
                        startActivity(ke8);

                        break;
                    case 8:
                        Intent ke9 = new Intent(ResultActivity.this, kekka9_kura.class);
                        startActivity(ke9);
                        break;
                    case 9:
                        Intent ke10 = new Intent(ResultActivity.this, kekka10_kiku.class);
                        startActivity(ke10);
                        break;
                    case 10:
                        Intent ke11 = new Intent(ResultActivity.this, kekka11_sen.class);
                        startActivity(ke11);
                        break;

                    case 11:
                        Intent ke12 = new Intent(ResultActivity.this, kekka12_habu.class);
                        startActivity(ke12);
                        break;


                }
            }
            });



        }





/*

                   if (m == point.getTotal()[0]) {

                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {

                               Intent ke1 = new Intent(ResultActivity.this, kekka1_yuzu.class);
                               startActivity(ke1);
                           }


                       });



                   } else if (m == point.getTotal()[1]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               Intent ke2 = new Intent(ResultActivity.this, kekka2_ender.class);
                               startActivity(ke2);
                           }
                       });


                   } else if (m == point.getTotal()[2]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               Intent ke3 = new Intent(ResultActivity.this, kekka3_yoi.class);
                               startActivity(ke3);
                           }
                       });

                   } else if (m == point.getTotal()[3]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                       Intent ke4 = new Intent(ResultActivity.this, Kekka4_zanshiro.class);
                       startActivity(ke4);
                           }
                       });

                   } else if (m == point.getTotal()[4]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                       Intent ke5 = new Intent(ResultActivity.this,kekka5_ksei.class);
                       startActivity(ke5);
                       }
                       });

                   } else if (m == point.getTotal()[5]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                       Intent ke6 = new Intent(ResultActivity.this, kekka6_kdan.class);
                       startActivity(ke6);
                           }
                       });

                   } else if (m == point.getTotal()[6]) {
                               Button btnNextn =findViewById(R.id.btnNextn);
                               btnNextn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {

                       Intent ke7 = new Intent(ResultActivity.this, kekka7_zanp.class);
                       startActivity(ke7);
                               }
                   });


                   } else if (m == point.getTotal()[7]) {
                     Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener()
                       {@Override
                         public void onClick(View view) {

                        Intent ke8 = new Intent(ResultActivity.this, kekka8_yume.class);
                       startActivity(ke8);
                       }
                       });


                   } else if (m == point.getTotal()[8]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener()
                       {@Override
                       public void onClick(View view) {
                       Intent ke9 = new Intent(ResultActivity.this, kekka9_kura.class);
                       startActivity(ke9);
                       }
                       });
                   } else if (m == point.getTotal()[9]) {
                       Button btnNextn =findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener()
                       {@Override
                       public void onClick(View view) {
                       Intent ke10 = new Intent(ResultActivity.this, kekka10_kiku.class);
                       startActivity(ke10);
                       }
                       });

                   } else if (m == point.getTotal()[10]) {
                           Button btnNextn =findViewById(R.id.btnNextn);
                           btnNextn.setOnClickListener(new View.OnClickListener()
                           {@Override
                           public void onClick(View view) {
                           Intent ke11 = new Intent(ResultActivity.this,kekka11_sen.class);
                       startActivity(ke11);
                           }
                           });

                   } else if (m == point.getTotal()[11]) {
                       Button btnNextn = findViewById(R.id.btnNextn);
                       btnNextn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               Intent ke12 = new Intent(ResultActivity.this, kekka12_habu.class);
                               startActivity(ke12);
                           }
                       });

 */





    }

