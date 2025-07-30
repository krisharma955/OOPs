package AdvanceProgrammingInOOPS;

import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        try {
            System.out.println(list.get(5));
        }
        catch(Exception e) {
            System.out.println("Exception at line 12 : " +e.getMessage());
        }

        System.out.println("try & catch block");
    }
}
