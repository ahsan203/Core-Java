package OOPS.Part2;

public class Room
{
        private Furniture theFurniture;

        public Room(Furniture theFurniture) {
                this.theFurniture = theFurniture;
        }

        @Override
        public String toString() {
                return "Room{" +
                        "theFurniture=" + theFurniture +
                        '}';
        }

        public static void main(String[] args) {

                Bed bed1 = new Bed("Ashley's Bed");

                Furniture furniture1 = new Furniture(bed1,"Woodfield_Doors","Woodfield_drawers");
                System.out.println(furniture1);

        }
}
