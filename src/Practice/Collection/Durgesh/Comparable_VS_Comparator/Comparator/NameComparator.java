package Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp2>
{


    @Override
    public int compare(Emp2 o1, Emp2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
