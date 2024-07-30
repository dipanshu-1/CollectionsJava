package MapInterface.com;
import java.util.*;
public class AnagramGroup {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("abcdef");
        list.add("fedacb");
        list.add("qwerty");
        list.add("ytrewq");
        list.add("qweytr");

        Map<String,ArrayList<String>> map = new HashMap<>();

        for(Object str:list){

            char[] charArray =((String) str).toCharArray();
            Arrays.sort(charArray);
            String sorted_string=new String(charArray);
            // System.out.println(charArray);
            if(map.containsKey(sorted_string)) {
                ArrayList<String> r = map.get(sorted_string);

                r.add((String) str);
                map.put(sorted_string,r);}
            else {
                map.put(sorted_string, new ArrayList<>());
                ArrayList<String> r = map.get(sorted_string);

                r.add((String) str);
                map.put(sorted_string,r);
            }

        }
        System.out.println(map);

    }
}
