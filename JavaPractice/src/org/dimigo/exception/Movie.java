package org.dimigo.exception;

/**
 * Created by 12bra on 2017-06-02.
 */
public class Movie {
    private String title;
    private int limitAge;

    public Movie(String title, int limitAge) {
        this.title = title;
        this.limitAge = limitAge;
    }
    public String getTitle() {
        return title;
    }
    public int getLimitAge() {
        return limitAge;
    }
    public void buyTicket(int age) throws Exception {
        try{
            if( age < getLimitAge()) {
                System.out.println(getTitle() +"은/는 " + getLimitAge()+ "세 이상 관람가입니다.");
            }
            else if( age >= getLimitAge()) {
                System.out.println(getTitle() + " 즐감하세요.");
            }
        } catch (Exception e) {
            throw e;
        }

    }
}
