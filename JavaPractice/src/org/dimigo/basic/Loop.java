/**
 *
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author			:	12bra
 * @version		:	1.0
 */
public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        String[] arr = {"마법사","영주","기사","농민"};
        int hp = 100;
        do {
            System.out.println("<<게임 메뉴>>");
            System.out.println("1. 공격력 증가");
            System.out.println("2. 공격력 감소");
            System.out.println("3. 캐릭터 설정");
            System.out.println("9. 종료");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    hp += 10;
                    System.out.println("공격력이 증가되었습니다. 현재 공격력" + hp);
                    break;
                case 2:
                    hp-=10;
                    System.out.println("공격력이 감소되었습니다. 현재 공격력" + hp);
                    break;
                case 3:
                    int num = new Random().nextInt(4);
                    System.out.println(arr[num]+"(으)로 설정되었습니다");
                    break;
                case 9:
                    System.out.println("이제 공부하세요!");
                    break;

            }
        } while(a!=9);
    }
}
