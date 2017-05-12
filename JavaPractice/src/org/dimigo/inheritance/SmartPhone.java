package org.dimigo.inheritance;

/**
 * Created by 12bra on 2017-05-11.
 */
public class SmartPhone {
    private String model;
    private String company;
    private int price;

    public SmartPhone() {

    }

    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }
    public void turnOn() {
        System.out.println(this.model + "의 전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println(this.model + "의 전원을 끕니다.");
    }

    public void pay() {

    }

    public void useSpecialFunction(SmartPhone phone) {
        if(phone == null) return;
        if(phone instanceof IPhone){
            ((IPhone) phone).useAirDrop();
        }
        else if(phone instanceof Galaxy){
            ((Galaxy) phone).useWirelesscharging();
        }

    }

    @Override
    public String toString() {
        return "모델명 : " + model + ", " + "제조사 : " + company + ", " + "가격 : "+ String.format("%,d원",price);
    }
}
