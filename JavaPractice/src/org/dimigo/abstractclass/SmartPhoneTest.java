package org.dimigo.abstractclass;

/**
 * Created by 12bra on 2017-05-11.
 */
public class SmartPhoneTest {
    public static void main(String[] args){
        SmartPhone[] smartPhones = {
                new IPhone("iPhone 7","애플",900000),
                new Galaxy("갤럭시 S8","삼성",800000)
        };
        for(SmartPhone s : smartPhones){
            System.out.println(s.toString());
            s.turnOn();
            s.pay();
            s.useSpecialFunction();
            s.turnOff();
            System.out.println();
        }
    }
}
