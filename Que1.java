package to.msn.wings.okinawa_aw;

import static android.nfc.NfcAdapter.EXTRA_DATA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;

public class Que1 extends AppCompatActivity {

    private TextView tNum;
    private TextView tTitle;
    private Button btn1;
    private Button btn2;
    private Button btn3;


    private int i = 0;
    Point point;


    //１）質問データ
    String quizData[][] = {
            // {"問題", "正解","選択肢１", "選択肢２", "選択肢３"}
            {"質問①：では、お伺いします。あなた様のご性別は？", "男性", "女性", "その他"},
            {"質問②：泡盛のご経験は？", "まだ未経験or苦手", "少しだけ経験済み", "好き・何種類か経験済"},
            {"質問③：あなた様のご年代を教えてください。", "20代　", "30代～40代", "50代～"},
            {"質問④：泡盛をたしなむ環境は。", "ひとりでゆっくり贅沢タイム", "少数人数で親交や絆を深めながら", "大人数で賑やかに"},
            {"質問⑤：想像してください。最初はグーでジャンケンをします。相手は次に何を出しましたか？", "パー", "チョキ", "グー"},
            {"質問⑥：お好きなのは", "甘め", "普通", "辛口"},
            {"質問⑦：お酒の耐性についてはどうですか。", "弱い", "普通", "強い"},
            {"質問⑧：最後のご質問です。あなた様がお酒に求めるものがあるとするならどちらが大きく当てはまりますか。", "滋養強壮", "楽しさ", "リラックス"},

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que1);
/*
            SimpleDatabaseHelper helper = new SimpleDatabaseHelper(this);
            try(SQLiteDatabase db = helper.getWritableDatabase()){
                Toast.makeText(this,"接続しました",Toast.LENGTH_SHORT).show();
*/
        point = new Point();


        String editName = getIntent().getStringExtra("editName");
        Toast.makeText(this, String.format("いらっしゃいませ", editName),
                Toast.LENGTH_SHORT).show();

        getId();

        showQue();

    }

    private void getId() {
        tNum = findViewById(R.id.tNum);
        tTitle = findViewById(R.id.tTitle);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

    }


    //表示
    public void showQue() {
        ArrayList<ArrayList<String>> num = new ArrayList<>();


        tNum.setText("残り" + (8 - i));
        tTitle.setText(quizData[i][0]);
        btn1.setText(quizData[i][1]);
        btn2.setText(quizData[i][2]);
        btn3.setText(quizData[i][3]);

    }


    //ボタンが押された時
    public void onButton(View v) {
        Log.i("TEST", "i=" + i);
        if (i == 8) {
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);


        }

        //押されたボタン
        if (v.getId() == R.id.btn1) {
            Snackbar.make(v, "ボタン1", Snackbar.LENGTH_SHORT).show();
            point.addTotal(i, 0);
            int[] total = point.getTotal();
            String s = "";
            for (int num : total) {
                s += num + " , ";
            }
            Toast.makeText(Que1.this, s, Toast.LENGTH_SHORT).show();

            //ボタン無効化
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);


        } else if (v.getId() == R.id.btn2) {
            Snackbar.make(v, "ボタン2", Snackbar.LENGTH_SHORT).show();
            point.addTotal(i, 1);


            //ボタン無効化
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);

        } else if (v.getId() == R.id.btn3) {
            Snackbar.make(v, "ボタン3", Snackbar.LENGTH_SHORT).show();
            point.addTotal(i, 2);


            //ボタン無効化
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);

        }
        i++;
    }

    //Nextボタンが押された時
    public void onNext(View view) {
        if (i == 8) {

            //★★★ここが不明

            Intent i = new Intent(this, ResultActivity.class);
            i.putExtra("point", point);

            startActivity(i);

        } else {
            showQue();

            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
        }
    }

    /**
     * ポイントクラス
     */
    public static class Point implements Serializable {

        // 合計用配列
        private int[] total = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // 商品ポイント用配列
        private final int[][][] points = {
                {    // 質問①
                        {1, 3, 0, 1, 3, 3, 3, 3, 2, 3, 3, 3},    // 選択肢①
                        {3, 3, 3, 3, 2, 2, 1, 3, 2, 2, 2, 0},// 選択肢②
                        {2, 2, 3, 2, 2, 2, 3, 2, 2, 2, 3, 0}//選択肢③
                },
                {    // 質問②
                        {3, 3, 3, 3, 2, 2, 1, 2, 2, 1, 0, 0},    // 選択肢①
                        {3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 1, 0},    // 選択肢②
                        {0, 2, 1, 1, 3, 3, 3, 3, 2, 3, 3, 1}//選択肢③
                },
                {    // 質問③
                        {3, 3, 3, 3, 2, 2, 1, 2, 1, 1, 0, 0},    // 選択肢①
                        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0},
                        {1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 2}// 選択肢3

                },
                {    // 質問④
                        {3, 3, 3, 2, 2, 2, 2, 2, 3, 2, 3, 0},    // 選択肢①
                        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0},// 選択肢②
                        {2, 3, 1, 3, 3, 3, 3, 3, 3, 3, 2, 0}

                },
                {    // 質問⑤
                        {3, 3, 3, 3, 3, 3, 1, 1, 2, 3, 1, 0},    // 選択肢①
                        {3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 0, 0},    // 選択肢②
                        {1, 3, 1, 1, 3, 3, 3, 3, 3, 3, 4, 0}
                },
                {    // 質問⑥
                        {4, 2, 4, 2, 1, 1, 1, 1, 2, 1, 0, 0},    // 選択肢①
                        {2, 3, 2, 3, 3, 3, 2, 3, 3, 3, 2, 0},    // 選択肢②
                        {0, 2, 0, 3, 3, 3, 3, 3, 2, 3, 3, 1}

                },
                {    // 質問⑦
                        {3, 1, 3, 1, 0, 0, 0, 1, 2, 0, 1, 0},    // 選択肢①
                        {3, 3, 3, 3, 1, 1, 1, 3, 3, 3, 3, 0},    // 選択肢②
                        {3, 3, 2, 3, 3, 3, 3, 3, 2, 2, 3, 1}
                },
                {    // 質問⑧
                        {0, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 15},    // 選択肢①
                        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 0},    // 選択肢②
                        {3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 0}
                }
        };


        /**
         * 選択された商品ポイントを合計に追加する
         *
         * @param a 質問
         * @param b 選択肢
         */
        public void addTotal(int a, int b) {

            // 選択された選択肢のポイント配列を取得
            int[] result = points[a][b];

            // 商品ごとに繰り返す
            for (int i = 0; i < result.length; i++) {

                // ポイントを取得
                int point = result[i];

                // 合計にポイントを追加
                total[i] += point;


            }

        }

        /**
         * 合計用配列を取得
         *
         * @return 合計用配列
         */
        public int[] getTotal() {


            return total;


        }

        /**
         * 最大値が入った要素の番号を返す
         *
         * @return 〇番目
         */
        public int max() {

            int rtn = 0;    // 〇番目
            int max = 0;    // 最大値

            for (int i = 0; i < total.length; i++) {

                if (max < total[i]) {
                    max = total[i];
                    rtn = i;
                }

            }

            return rtn;

        }


        }


    }

    //結果を表示させる






/*
            SimpleDatabaseHelper helper = new SimpleDatabaseHelper(Que1.this);
            try(SQLiteDatabase db = helper.getWritableDatabase()){
                Toast.makeText(Que1.this,"接続しました",Toast.LENGTH_SHORT).show();



*/










