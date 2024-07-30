package MapInterface.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccurence {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "C:\\Users\\dipanshu.1\\Desktop\\CollectionsJava\\src\\MapInterface\\file.txt.txt");
        Scanner sc = new Scanner(file);
        Map<String,Integer> map=new HashMap<>();
        while (sc.hasNext()) {
          String temp=sc.next();
          if(map.containsKey(temp)){
              int r=map.get(temp);
              r++;
              map.put(temp,r);
          }
          else {
              map.put(temp,1);
          }

        }
        for(Map.Entry i: map.entrySet())
            System.out.println(i.getKey()+"  "+i.getValue());

    }
}
