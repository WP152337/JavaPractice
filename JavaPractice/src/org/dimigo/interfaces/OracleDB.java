package org.dimigo.interfaces;

/**
 * Created by 12bra on 2017-05-25.
 */
public class OracleDB implements IDBManager{

    @Override
    public void insert() {
        System.out.println("Oracle DB 저장");
    }

    @Override
    public void search() {
        System.out.println("Oracle DB 조회");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB 변경");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB 삭제");
    }
}
