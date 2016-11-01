/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aschindler1
 */
public class Practice {
    public static void main(String[] args) {
        Map<String,List<String>> map1 = new HashMap<>();
        
        List<String> chevyList = new ArrayList<>();
        chevyList.add("corvette");
        chevyList.add("camero");

        List<String> fordList = new ArrayList<>();
        fordList.add("Ford GT");
        fordList.add("Mustang");
        
        map1.put("Chevy", chevyList);
        map1.put("Ford", fordList);
        
        List<String> favorite = map1.get("Ford");
        System.out.println(favorite);
        
        Set<String> keys = map1.keySet();
        for(String key : keys){
            System.out.println(key);
        }
        Collection<List<String>> values = map1.values();
        for(List<String> value : values){
            System.out.println(value);
        }
        Map<String, Object> record1 = new HashMap<>();
        record1.put("id", "1");
        record1.put("LastName", "Smith");
        record1.put("Age", 22);
        
        List<Map<String, Object>> records = new ArrayList();
        records.add(record1);
    }
}
