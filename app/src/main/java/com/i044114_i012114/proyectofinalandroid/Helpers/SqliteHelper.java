package com.i044114_i012114.proyectofinalandroid.Helpers;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.i044114_i012114.proyectofinalandroid.Utilities.Constants;

/**
 * Created by ACER on 13/11/2017.
 */

public class SqliteHelper extends SQLiteOpenHelper{

    public SqliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.CREATE_TABLE_USERS);
        db.execSQL(Constants.CREATE_TABLE_PRODUCTS);
        db.execSQL(Constants.CREATE_TABLE_FAVORITE);
        db.execSQL(Constants.CREATE_TABLE_PEDIDO);
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Acetaminofen', 'Analgésico y antipirético utilizado principalmente para tratar la fiebre y el dolor leve y moderado', '30', 'http://3.bp.blogspot.com/-Gffbq6aKPoU/VWHeovCOkhI/AAAAAAAAAFk/O4Qax3ZjSzc/s1600/acetaminofen%2B%25281%2529.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Ibuprofeno', 'Analgésico y antiinflamatorio utilizado para el tratamiento de estados dolorosos, acompañados de inflamación significativa', '10', 'http://www.resumenlatinoamericano.org/wp-content/uploads/2015/05/IBUPROFENO.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Amoxicilina', 'Antiinflamatorio no esteroideo útil como antiinflamatorio y analgésico para calmar el dolor y bajar la inflamación', '20', 'https://www.farmalisto.com.co/94653-thickbox_default/comprar-amoxicilina-500-mg-caja-x-50-capsulas-rx2-precio-7702605100309.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Advil', 'Rápido y efectivo alivio de múltiples dolores moderados a fertes gracias a su tecnología líquida que comienza a actuar en tan sólo 10 minutos', '90', 'http://neopharmgroup.com/wp-content/uploads/2012/12/advil.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Ampicilina', 'Antibiotico usado principalmente para convatir infecciones bacterianas', '12', 'http://tecnoquimicasfarma.com.ec/portals/9/Images/antiinfecciosos/AmpicilinaE.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Bisolvon', 'Indicado para reducir la viscosidad de mocos y flemas, facilitando su expulsión, en resfriados y  gripes', '10', 'https://www.farmalisto.com.co/94954-thickbox_default/comprar-bisolvon-jarabe-caja-con-frasco-x-120-ml-precio-7703381000777.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Diclofenaco', 'El diclofenaco es un medicamento inhibidor relativamente no selectivo de la ciclooxigenasa y miembro de la familia de los antiinflamatorios no esteroideos', '8', 'https://www.farmalisto.com.co/87159-thickbox_default/diclofenaco-50-mg-7706569000118.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Dolex', 'Dolex Forte , para dolores fuertes y moderados. Capsulas', '6', 'https://www.farmalisto.com.co/95213-large_default/comprar-dolex-forte-500-65-mg-caja-con-48-tabletas-precio-7707172686126.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Dristan', 'Descongestionante de las vías respiratorias superiores de acción prolongada, indicado en el resfrío común, congestión nasal y otros síntomas alérgicos respiratorios', '7', 'https://www.farmalisto.com.co/93098-large_default/comprar-dristan-triple-accion-nf-caja-con-48-tabletas-precio-7702132008796.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Losartan', 'medicamento antagonista de los receptores de angiotensina II usado principalmente para tratar la presión arterial alta', '14', 'http://tecnoquimicasfarma.com.ec/portals/0/Images/cardiovascular/losartan.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Mareol', 'Prevención y alivio de la cinetosis, náuseas, vómito. Puede producir somnolencia', '5', 'http://super80.com.co/store/archivosdelusuario/fotografias/productos/full/antimareos_mareol-72tab-cx24dp_1393332590996..jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Meloxicam', 'Usado para aliviar el dolor, la sensibilidad, la inflamación y la rigidez causadas por la osteoartritis y artritis reumatoide ', '4', 'http://paraquesirven.com/wp-content/uploads/2016/07/meloxicam-300x271.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Metocarbamol', 'Relajante muscular y leisiones ceveras en los musculos', '32', 'http://www.disnagen.com/catalogo/imagenes/thumbnails/METOCARBAMOL_750_MG_TABLETAS_600x600.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Penicilina', 'utilizada para tratar infecciones causadas por bacterias. Actúa matando las bacterias o evitando su crecimiento. Requiere formula medica', '13', 'http://www.qualipharm.info/sites/default/files/PENIBENZA.jpg')");
        db.execSQL("INSERT INTO products (namepro, description, cantidad, url) VALUES ('Ranitidina', 'usa para tratar úlceras; reflujo gastroesofágico,lesiones en el tubo alimenticio (esófago) y condiciones en las que el estómago produce demasiado ácido', '8', 'http://www.swissfarminternational.com/assets/Uploads/_resampled/resizedimage406275-RANITIDINA2.jpg')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLA_NAME_USERS);
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLA_NAME_PRODUCTS);
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLA_NAME_FAVORITE);
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLA_NAME_PEDIDO);
        onCreate(db);
    }

}
