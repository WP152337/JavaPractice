package org.dimigo.oop;

/**
 * Created by 12bra on 2017-04-19.
 */
public class PiggyBankTest {
    public static void main(String[] args){
        FamilyMember[] familyMembers = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };
        int[] money = {10000,5000,2000,1000};
        FamilyMember.printMemberCnt();
        for(int i =0;i<familyMembers.length;i++){
            PiggyBank.putMoney(familyMembers[i],money[i]);
        }
        PiggyBank.printBalance();
        System.out.println();

        PiggyBank.putMoney(familyMembers[2],1000);
        PiggyBank.printBalance();
    }
}
