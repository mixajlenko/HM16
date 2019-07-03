package org.hillel.homework16;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JacksonDemo<T> {

    public Map getValues(String json) throws IOException {
        Map<String,T> result =
                new ObjectMapper().readValue(JacksonDemo.class.getResourceAsStream(json), HashMap.class);
        return result;
    }

    public void mapSum(Map map){
        List valueList = new ArrayList(map.values());
        System.out.println(valueList);
        double sum1 = 0.0;
        for(Object sum : valueList){
            System.out.println(sum);
        Double val = (Double) sum;
        sum1 += val;
            System.out.println(val);
        }
//        for(int i = 0; i <= valueList.size(); i++){
//            sum += (double)valueList.get(i);
//
//        }
        //System.out.println(sum);
    }
}

