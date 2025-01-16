package Practice.Collection.Ankit.Comparable_vs_Comparator.Durgesh.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
