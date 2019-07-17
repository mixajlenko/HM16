package org.hillel.homework16;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class JacksonTask {

    private double value;
    private long counterOfUnique = 0;

    public Map getValues(String json) throws IOException {
        ObjectMapper obj1 = new ObjectMapper();
        Map mapa = obj1.readValue(JacksonTask.class.getResourceAsStream(json), Map.class);
        System.out.println("\nJSON file contain: ");
        mapa.entrySet().stream().forEach(System.out::println);
        return mapa;
    }

    public void mapSum(HashMap map) {
        List valueList = new ArrayList(map.values());
        System.out.print("\nSumm of all elements in JSON: ");
        value = (double) valueList.get(0) + (int) valueList.get(1) + (int) valueList.get(2);
        System.out.println(value);
    }

    public void mapMultiply(HashMap map) {
        HashMap<String, Double> mapAfterChanges = new HashMap<>();
        List list = new ArrayList(map.values());
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        int counter = 0;
        mapAfterChanges.putAll(map);

        list.stream().map(i -> {
            if (i instanceof Double) {
                return i;
            } else {
                return Double.parseDouble(i.toString());
            }
        }).map(i -> (double) i * value).collect(Collectors.toCollection(() -> list2));

        System.out.println("\nElements after multiply: " + list2);

        for (int i = 0; i < list2.size(); i++) {
            list3.add(i);
        }
        for (Map.Entry<String, Double> entry : mapAfterChanges.entrySet()) {
            mapAfterChanges.put(entry.getKey(), (double) list2.get(counter++));
        }
        System.out.println("\nJSON file after changes: ");
        mapAfterChanges.entrySet().stream().forEach(System.out::println);
        uniqueValues(mapAfterChanges);
    }

    public void uniqueValues(HashMap map) {
        counterOfUnique = map.entrySet().stream()
                .filter(i -> {
                    for (Object o : map.values()) {
                        if (!o.equals(map.values())) {
                            counterOfUnique++;
                        }
                    }
                    return true;
                }).count();
        System.out.println("\nCount of unique values: " + counterOfUnique);
    }
    }

