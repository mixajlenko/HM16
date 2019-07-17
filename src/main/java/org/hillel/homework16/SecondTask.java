package org.hillel.homework16;
import java.util.*;

public class SecondTask {

   private long counterOfUnique;

    public void listInitialization(List<Integer> list) {
        for (int i = 0; i <= 100000; i++) {
            list.add(getRandomValue(0, 100000));
        }
        System.out.println("\nList is: " + list);
    }

    public void uniqueValuesForSecondTAsk(List list) {
        counterOfUnique = list.stream().distinct().count();
        System.out.println("\nCount of unique values: " + counterOfUnique);
    }

    public void maxElementForSecondTAsk(List<Integer> list) {
        System.out.println("\nMax value of list: " + Collections.max(list));
    }

    public static int getRandomValue(int min, int max) {

        max -= min;

        return (int) (Math.random() * max + 1) + min;
    }

}
