package org.dimigo.interfaces;

/**
 * Created by 12bra on 2017-05-25.
 */
public interface IDBManager {
    String ORACLE_DATABASE = "ORACLE";
    String SYBASE_DATABASE = "SYBASE";

    void insert();
    void search();
    void update();
    void delete();
    public static IDBManager getDBObject(String database){
        if(database.equals(ORACLE_DATABASE)){
            return new OracleDB();
        }
        if(database.equals(SYBASE_DATABASE)){
            return new SybaseDB();
        }
        return null;
    }
}
