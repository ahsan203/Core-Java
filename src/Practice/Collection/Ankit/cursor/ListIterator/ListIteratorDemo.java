package Practice.Collection.Ankit.cursor.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo
{
    public static void main(String[] args) {

        List<Friends> arrayList = new ArrayList();

        Friends ahsan = new Friends("ahsan",7027);
        Friends shoeab = new Friends("shoeab",7018);
        Friends zaki = new Friends("zaki",7035);
        Friends nomaan = new Friends("nomaan",7040);
        Friends hisham =new Friends("hisham",7012);
        Friends faisal = new Friends("faisal",7015);
        Friends muzammil = new Friends("muzammil",7042);


        arrayList.add(ahsan);
        arrayList.add(shoeab);
        arrayList.add(zaki);
        arrayList.add(nomaan);
        arrayList.add(hisham);
        arrayList.add(faisal);
        arrayList.add(muzammil);


        System.out.println(arrayList);

        ListIterator litr = arrayList.listIterator();

    //---------Forward-direction..--------------------

        while(litr.hasNext())
        {
           Friends data = (Friends) litr.next();
            System.out.println(data);

        //------- remove ----------

             if(data.names=="ahsan")
             {
            litr.remove();
               }

        //----= adding element --------
            if(data.names=="shoeab")
            {
                litr.add(new Friends("Ahasn Shareef Mohammed",7027));
            }

        // ------------- replacing data ---------

        if(data.roll==7040)
        {
            litr.set(new Friends("Mohammed Waseem Uddin",7040));
        }
        }



        System.out.println(arrayList);
    }
}
