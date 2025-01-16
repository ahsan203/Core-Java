package Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp2>
{


    @Override
    public int compare(Emp2 o1, Emp2 o2) {
        return o1.getEmpID()-o2.getEmpID();
    }
}
