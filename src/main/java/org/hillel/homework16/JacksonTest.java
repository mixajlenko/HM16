package org.hillel.homework16;

import java.io.IOException;
import java.util.Map;

public class JacksonTest<T> {
    public static void main(String[] args) throws IOException {
        JacksonDemo test = new JacksonDemo();

       Map map = test.getValues("prop.json");

        map.entrySet().forEach(System.out::println);

        test.mapSum(map);
        test.mapMultiply(map);
    }
}
