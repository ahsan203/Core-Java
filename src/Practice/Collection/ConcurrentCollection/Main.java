package Practice.Collection.ConcurrentCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Main
{
    public static void main(String[] args) {

        //List<String> list1 = new ArrayList<>();
        List<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("ahsan");
        list1.add("shoeab");
        list1.add("zaki");

        //--- Thread-1
        Runnable t1 = ()->{
            for(String s : list1)
            {
                System.out.println(s);
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
        };

        //--- Thread-2
        Runnable t2 = ()->{
            list1.add("nomaan");
            list1.add("ismail");
            list1.add("hisham");
            list1.add("muzammil");
        };



         new Thread(t2).start(); new Thread(t1).start();
    }
}
