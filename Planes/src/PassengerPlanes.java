public class PassengerPlanes extends Planes
{
    private int maxPassengers;
    public int getMaxPassengers()
    {
        return maxPassengers;
    }
    public PassengerPlanes(int maxPassengers,String planeID,int totalEnginePower)
    {
        super(planeID, totalEnginePower);
        this.maxPassengers=maxPassengers;
    }
}
