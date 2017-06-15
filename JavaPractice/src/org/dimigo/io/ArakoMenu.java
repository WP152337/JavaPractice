package org.dimigo.io;

import java.io.*;

/**
 * Created by 12bra on 2017-06-15.
 */
public class ArakoMenu {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("files/menu.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))){

            String data;
            while((data = bufferedReader.readLine()) != null) {
                writer.write(data);
                writer.newLine();
            }
            writer.close();
            System.out.println(" << 메뉴 출력 >>");
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
