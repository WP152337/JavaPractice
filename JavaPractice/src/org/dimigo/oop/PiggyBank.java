package org.dimigo.oop;

/**
 * Created by 12bra on 2017-04-19.
 */
public class PiggyBank {
    private static int balance;

    public static void putMoney(FamilyMember member, int amount){
        System.out.printf(member.getMemberName() + " : " + "%d원 넣음\n",amount);
        balance+=amount;
    }
    public static void printBalance(){
        System.out.printf("돼지저금통 총 금액 : %d원",balance);
    }
}
