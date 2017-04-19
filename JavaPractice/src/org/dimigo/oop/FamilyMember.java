package org.dimigo.oop;

/**
 * Created by 12bra on 2017-04-19.
 */
public class FamilyMember {
    private static int memberCnt;
    private String memberName;

    public FamilyMember(String memberName){
        this.memberName=memberName;
        memberCnt++;
    }

    public String getMemberName() {
        return memberName;
    }
    public static void printMemberCnt() {
        System.out.printf("가족 총 인원 수 : %d명\n",memberCnt);
    }
}
