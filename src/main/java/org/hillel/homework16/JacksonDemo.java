package org.hillel.homework16;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class JacksonDemo<T> {
    
    private double value;



    public Map getValues(String json) throws IOException {
        Map result =
                new ObjectMapper().readValue(JacksonDemo.class.getResourceAsStream(json), Map.class);
        return result;
    }

    public void mapSum(Map map) {
        List valueList = new ArrayList(map.values());
        System.out.print("Summ of all elements is: ");
        value =
                (int) valueList.get(0) +
                (double) valueList.get(1) +
                (int) valueList.get(2);
        System.out.println(value);
        
    }

    public void mapMultiply(Map map){
        List<T> list = new ArrayList(map.values());
        List arr = new ArrayList();
        arr.add(value);
        System.out.println(list);
       //list.stream().map(i -> i * arr.get(0)).forEach(System.out::println);
    }
}

