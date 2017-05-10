package org.dimigo.inheritance;

import java.util.Arrays;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-04-21
 */
public class Bill {
    private int tableNumber; // 테이블 번호
    private Menu[] selectedMenu; // 선택한 메뉴 목록

    public Bill(int tableNumber){
        this.tableNumber = tableNumber;
    }

    public void chooseMenu(Menu[] selectedMenu){
        this.selectedMenu = selectedMenu; // 선택한 메뉴를 메뉴 목록에 설정
        System.out.printf("<< %d번 테이블 선택 메뉴 >>%n", this.tableNumber); // 테이블 번호 출력
    }

    public void printBillResult(){
        for(Menu menu: this.selectedMenu) System.out.println(menu.toString()); // 선택한 메뉴들의 정보 출력
        int sum = Arrays.stream(this.selectedMenu).mapToInt(Menu::getPrice).sum(); // 테이블의 총 금액 계산
        System.out.printf("%d번 테이블 총 금액 : %,d원%n%n", this.tableNumber, sum);
    }
}