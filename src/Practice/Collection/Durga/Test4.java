package Practice.Collection.Durga;

import java.util.*;

public class Test4
{
    public static void main(String[] args) {

        List al = new ArrayList();
        List syncAl = Collections.synchronizedList(al);


        Set set = new HashSet();
        Set syncSet = Collections.synchronizedSet(set);


        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> syncMap = Collections.synchronizedMap(map1);
    }
}
