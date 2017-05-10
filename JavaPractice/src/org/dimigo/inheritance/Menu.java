package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-04-21
 */
public class Menu {
    private String name; // 메뉴명
    private int price; // 가격

    public Menu(){
        this(null, 0);
        // 기본 생성자: null 및 0으로 초기화함
    }

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // StringBuilder 사용하느라 엄청 길어졌는데... String.format을 쓰면
        // return String.format("메뉴명 : %s, 가격: %,d원", this.getName(), this.getPrice())

        return String.format("메뉴명 : %s, 가격: %,d원", this.getName(), this.getPrice());
    }
}