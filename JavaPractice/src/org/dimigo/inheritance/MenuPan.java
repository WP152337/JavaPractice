package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-04-21
 */
public class MenuPan {
    private static Menu[] menuList; // 전체 메뉴

    // 전체 메뉴의 가격 상수로 정의
    public static final int JJAJANG_PRICE = 4000;
    public static final int JJAMPONG_PRICE = 5000;
    public static final int FRIED_RICE_PRICE= 4500;
    public static final int JAPCHAE_RICE_PRICE = 5000;
    public static final int TANGSUYUK_PRICE = 10000;

    static {
        menuList = new Menu[] {
                new Menu("짜장면", JJAJANG_PRICE),
                new Menu("짬뽕", JJAMPONG_PRICE),
                new Menu("볶음밥", FRIED_RICE_PRICE),
                new Menu("잡채밥", JAPCHAE_RICE_PRICE),
                new Menu("탕수육", TANGSUYUK_PRICE)
        };
    }

    private MenuPan(){
        // private: 외부에서 객체 생성을 못하도록 처리
    }

    public static Menu[] getMenuList() {
        return menuList;
    }

    public static void printMenuList(){
        System.out.printf("<< 디미반점 전체 메뉴 리스트 >>%n전체 메뉴 수 : %d개%n", menuList.length); // 전체 메뉴수 출력
        for(Menu menu: menuList) System.out.println(menu.toString()); // 메뉴 정보 출력
        System.out.println();
    }
}