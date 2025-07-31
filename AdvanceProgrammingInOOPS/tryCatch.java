package AdvanceProgrammingInOOPS;

import java.util.*;

public class tryCatch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        try {
            System.out.println(list.get(5));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            //closing resources
            //it can also contain a try catch
            System.out.println("executed at last");
        }
    }
}
