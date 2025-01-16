package Practice.Collection.Ankit.cursor.ListIterator;

public class Friends
{
    String names;
    int roll;

    public Friends(String names,int roll)
    {
        this.names=names;
        this.roll=roll;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "names='" + names + '\'' +
                ", roll=" + roll +
                '}';
    }
}
