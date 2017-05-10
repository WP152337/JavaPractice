package org.dimigo.inheritance;

/**
 * Created by 12bra on 2017-04-26.
 */
public class PersonTest2 {
    public static void main(String[] args){
        Person[] people = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };
        for(Person p : people){
            greeting(p);
            System.out.println();
        }


    }
    private static void greeting(Person p) {
        System.out.println(p);
        p.sayHello();
        p.sayBye();

    }
}
