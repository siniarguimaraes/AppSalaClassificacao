package devandroid.ssg.appsalaclassificacao.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class AlgodaoDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "algodao.db";
    public static final int DB_VERSION = 1;
    Cursor cursor;

    SQLiteDatabase db;

    public AlgodaoDB(Context context){
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaAlgodao
                = "CREATE TABLE algodao (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "numeroMala REAL, " +
                "etiquetaFardoTEXT, " +
                "fardoMic REAL," +
                "fardoRes REAL, " +
                "fardoUhm REAL, " +
                "fardoSfi REAL, " +
                "fardoRegraHvi, " +
                "fardoBloco)";

        db.execSQL(sqlTabelaAlgodao);



    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
