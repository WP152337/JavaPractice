package org.dimigo.inheritance;

import java.util.Arrays;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-04-21
 */
public class DinnerTest {
    public static void main(String[] args){
        MenuPan.printMenuList(); // 전체 메뉴 리스트 출력
        Menu[] menuList = MenuPan.getMenuList(); // 전체 메뉴가 담긴 배열 얻어옴

        int[][] ranges = {{0, 2}, {1, 4}, {2, 5}}; // 각 테이블별 주문 범위
        Bill[] bills = { new Bill(1), new Bill(2), new Bill(3) }; // Bill 객체 생성

        for(int i = 0; i < bills.length; i++){
            // 전체 메뉴가 담긴 배열로부터 선택한 메뉴 배열 생성
            Menu[] selectedMenu = Arrays.copyOfRange(menuList, ranges[i][0], ranges[i][1]);

            bills[i].chooseMenu(selectedMenu);
            bills[i].printBillResult(); // 메뉴 결과 출력
        }
    }
}