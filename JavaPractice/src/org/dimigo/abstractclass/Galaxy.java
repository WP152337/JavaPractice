package org.dimigo.abstractclass;

/**
 * Created by 12bra on 2017-05-11.
 */
public class Galaxy extends  SmartPhone{
    public Galaxy() {
    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }
    public void pay(){
        System.out.println("삼성 페이로 결제합니다.");
    }
    public void useWirelesscharging() {
        System.out.println("무선 충전 기능을 이용합니다.");
    }
}
