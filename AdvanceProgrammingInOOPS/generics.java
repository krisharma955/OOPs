package AdvanceProgrammingInOOPS;

import java.util.*;

public class generics {
    //generic class
    public static class ExampleGenerics<T> {
        private List<T> list = new ArrayList<>();

        public void add(T val) {
            list.add(val);
        }

        public void removeLast() {
            if(list.isEmpty()) {
                System.out.println("List is Empty");
            }
            else {
                list.remove(list.size()-1);
            }
        }

        public T getElement(int idx) {
            return list.get(idx);
        }

        public void print() {
            for(T ele : list) {
                System.out.print(ele + " ");
            }
        }
    }

    //generic method
    public static <E> void printArr(E[] arr) {
        for(E i : arr) {
            System.out.print(i + " ");
        }
    }

    //bounded type parameter
    public static class Calculator<T extends Number> {
        public double add(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }
    }

    //wildcard type - upper bound
    public static <T> void print(List<? extends Number> ls) {
        for(Number i : ls) {
            System.out.println(i + " ");
        }
    }


    public static void main(String[] args) {
        ExampleGenerics<Integer> obj = new ExampleGenerics<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.removeLast();
        obj.getElement(1);
        //obj.print();

        //Integer[] arr = {1,2,3,4,5};
        //printArr(arr);

        //Calculator<Double> obj1 = new Calculator<>();
        //System.out.println(obj1.add(2.2,1.2));

        // List<Integer> ls = new ArrayList<>();
        // ls.add(1);
        // ls.add(12);
        // ls.add(134);
        // print(ls);

        //raw types
        //lint errors
        //List ls = new ArrayList<>();
        // ls.add(222);
        // ls.add("lando");
        // ls.add(12.2);
        // print(ls);
        
        
    }
}
