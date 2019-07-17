package org.hillel.homework16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JacksonDemo {


    public static void main(String[] args) throws IOException {
        JacksonTask taskOne = new JacksonTask();
        SecondTask taskTwo = new SecondTask();

        /**
         *
         * Task 1
         *
         */
        Map<Object, Object> map = new HashMap<Object, Object>(taskOne.getValues("prop.json"));
        taskOne.mapSum((HashMap) map);
        taskOne.mapMultiply((HashMap) map);

        /**
         *
         * Task 2
         *
         */
        List<Integer> list = new ArrayList();
        taskTwo.listInitialization(list);
        taskTwo.maxElementForSecondTAsk(list);
        taskTwo.uniqueValuesForSecondTAsk(list);

        /**
         *
         * Task 3
         *
         */
        Map<Object, Object> map2 = new HashMap<Object, Object>(taskOne.getValues("prop2.json"));






    }
}
