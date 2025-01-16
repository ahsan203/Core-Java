package OOPS.Part2;

public class Furniture
{
    private Bed bed;
    private String door;
    private String drawer;

    public Furniture() {
    }

    public Furniture(Bed bed, String door, String drawer) {
        this.bed = bed;
        this.door = door;
        this.drawer = drawer;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "bed=" + bed +
                ", door='" + door + '\'' +
                ", drawer='" + drawer + '\'' +
                '}';
    }
}
