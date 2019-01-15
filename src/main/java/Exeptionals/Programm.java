package Exeptionals;

import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        try{
            System.out.println(a[6]);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println(a);
            List <Integer> myList = new ArrayList<>();

            myList.add(1);

            public Integer myMethod (int i) throws IndexOutOfBoundsException
            Integer result = myList.get(0);
            return result;

        }
}
