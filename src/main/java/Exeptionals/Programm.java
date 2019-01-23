package Exeptionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programm {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        try {
            System.out.println(a[6]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println(a.toString());

        }
        FullExceptionalExample example = new FullExceptionalExample();

    }
}



 class FullExceptionalExample {
            public String input() throws IOException{
                BufferedReader reader =  new BufferedReader( new InputStreamReader(System.in));
                String s=null;
            try{
                s = reader.readLine();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }finally {
                try{
                    reader.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
            if (s.equals("")){
                throw new IOException("String can not be empty");
            } return s;
            }
        }




