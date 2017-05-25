package org.dimigo.interfaces;

/**
 * Created by 12bra on 2017-05-25.
 */
public class DBTest {
    public static void main(String[] args) {
        System.out.println("<< 변경 전 >>");
        crud(IDBManager.getDBObject(IDBManager.ORACLE_DATABASE));
        System.out.println("<< 변경 후 >>");
        crud(IDBManager.getDBObject(IDBManager.SYBASE_DATABASE));
    }
    private static void crud(IDBManager db){
        db.insert();
        db.search();
        db.update();
        db.delete();
        System.out.println();
    }
}
