package MapInterface.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        map.put(6,-1);
        map.put(7,-2);

        HashMap<Integer,Integer> sortedMap=map.entrySet().stream().sorted((i1,i2)-> i1.getValue().compareTo(i2.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        for(Map.Entry e:sortedMap.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}
