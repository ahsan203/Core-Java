package List_ArrayList_LinkedList_Iterator_Autoboxing.LinkedList.Second;

public class Place
{
    private String name;
    private String distanceFromSydney;

    public Place(String name, String distanceFromSydney) {
        this.name = name;
        this.distanceFromSydney = distanceFromSydney;
    }

    public String getName() {
        return name;
    }

    public String getDistanceFromSydney() {
        return distanceFromSydney;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", distanceFromSydney='" + distanceFromSydney + '\'' +
                '}';
    }
}
