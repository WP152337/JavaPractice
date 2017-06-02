package org.dimigo.exception;

/**
 * Created by 12bra on 2017-06-02.
 */
public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("에이리언:커버넌트", 15),
                new Movie("가디언즈 오브 갤럭시", 12)
        };
        int age = 16;
        for(Movie movie : movies) {
            try {
                movie.buyTicket(age);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
