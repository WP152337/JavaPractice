/**
 *
 */
package org.dimigo.basic;

import java.util.Scanner;

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

        /*int [] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */
        String[] twice = {"나연","사나","쯔위","정연"};

        for (String m : twice ){
            System.out.println(m);
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("<<메뉴 선택>>");
            System.out.println("1. 캐비어");
            System.out.println("2. 샥스핀");
            System.out.println("9. 종료");
            System.out.println("==== 당신의 선택은 ?");

            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("호우");
                    break;
                case 2:
                    System.out.println("호우");
                    break;
                case 9:
                    System.out.println("호우");
                    break;
                default:
                    System.out.println("없는데??");
                    break;
            }
        }while (true);


        /*int a;
        int hp = 100;
        System.out.println("<<게임 메뉴>>");
        System.out.println("1. 공격력 증가");
        System.out.println("2. 공격력 감소");
        System.out.println("3. 캐릭터 설정");
        System.out.println("9. 종료");

        switch (a) {
            case 1:
                System.out.println("공격력이 증가되었습니다. 현재 공격력"+hp+10);
                break;
            case 2:
                System.out.println("공격력이 감소되었습니다. 현재 공격력"+(hp-10));
                break;
            case 3:
                System.out.println("공격력이 증가되었습니다. 현재 공격력"+hp+10);
                break;
            case 9:
                System.out.println("공격력이 증가되었습니다. 현재 공격력"+hp+10);

        }
    }
    */
    }
}
