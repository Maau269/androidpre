package to.msn.wings.okinawa_aw;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class SimpleDatabaseHelper extends SQLiteOpenHelper {

    /*フィールド*/
    private static final String DBNAME = "sample.sqlite";   //ファイル名
    private  static int VERSION =1;

    public SimpleDatabaseHelper(@Nullable Context context) {

        //親コンストラクタの呼び出し
        super(context,DBNAME, null,VERSION);
    }

    /*データベースを作成する時*/
    @Override
    public void onCreate(SQLiteDatabase db) {


        //データベース
        if (db != null){
            db.execSQL("CREATE TABLE SimpleDatabaseHelper.db(" +
                    "id TEXT PRIMARY KEY,sc1 INTEGER,sc2 INTEGER,sc3 INTEGER,sc4 INTEGER,sc5 INTEGER,sc6 INTEGER,sc7 INTEGER,sc1 INTEGER )");










            //トランザクションを開始
            db.beginTransaction();
            try {
                SQLiteStatement sql = db.compileStatement(
                        "INSERT INTO anser(id,score)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");




                //トランザクションを成功
                db.setTransactionSuccessful();
            }catch (SQLException e) {
                e.printStackTrace();
            }finally {
                //トランザクション終了
                db.endTransaction();



            }


            }


        }



        @Override
        public void onUpgrade (SQLiteDatabase sqLiteDatabase,int i, int i1){
        // Nullチェック
            if(sqLiteDatabase != null) {

                // テーブルを削除
                sqLiteDatabase.execSQL("DROP TABLE IF EXISTS books");

                // テーブルの再作成（onCreateメソッドを呼び出す）
                onCreate(sqLiteDatabase);

            }

    }


}