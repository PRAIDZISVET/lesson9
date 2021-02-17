package com.itacademy.lesson9;

import com.itacademy.lesson7.hero.Gender;
import com.itacademy.lesson7.hero.Mage;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        integers.add(5);
        integers.add(10);
        integers.add(10);
        integers.add(7);
        integers.add(3);

       // integers.remove(1);
        print(integers);
       // deleteMax(integers);
        //удалить все элементы. Если несколько значений макс:
        integers.removeAll(Arrays.asList(10));
        print(integers);

        List<String> strings = new ArrayList<>();
        strings.add("5");
        strings.add("10");
        strings.add("7");
        strings.add("3");


//        print(strings);
    }

    public static void deleteMax (List<Integer> list){
        Integer max = findMax(list);
        list.remove(max);
    }



    private static Integer findMax(List<Integer> list) {
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        return max;
    }

    private static<T> void print(Iterable<T> objects) {
//        for (T object : objects) {
//            System.out.println(object);
//        }

        Iterator<T> iterator = objects.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            System.out.println(next);

        }
    }
}
