package Practice.DesignPatterns.Durgesh.Factory.Example2;

public class VehicleFactory
{

//--------------------  Tyre-Factory-Method : ------------------------------------

    public static Tyres getTyre(String tyreName)
    {
        if(tyreName.trim().equalsIgnoreCase("Michelin"))
        {
            return new Michelin();
        }
        else if(tyreName.trim().equalsIgnoreCase("Bridgestone"))
        {
            return new BridgeStone();
        }
        else
        {
            return null;
        }
    }

//----------------------- Speaker-Factory-Method : ----------------------------------------------

    public static Speakers getSpeakerCompany(String speakerName)
    {
        if(speakerName.trim().equalsIgnoreCase("Sony"))
        {
            return new Sony();
        }
        else if(speakerName.trim().equalsIgnoreCase("JBL"))
        {
            return new JBL();
        }
        else
        {
            return null;
        }
    }
}
