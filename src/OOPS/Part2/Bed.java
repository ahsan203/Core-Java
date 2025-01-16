package OOPS.Part2;

public class Bed {
    private String BedCompanyName;
    private String BedType;

    public Bed(String bedCompanyName) {
        this.BedCompanyName = bedCompanyName;
    }

    public Bed(String bedCompanyName, String bedType) {
        BedCompanyName = bedCompanyName;
        BedType = bedType;
    }

    public Bed() {
    }

    public String getBedCompanyName() {
        return BedCompanyName;
    }

    public void setBedCompanyName(String bedCompanyName) {
        BedCompanyName = bedCompanyName;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "BedCompanyName='" + BedCompanyName + '\'' +
                '}';
    }
}
