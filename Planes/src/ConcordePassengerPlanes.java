public class ConcordePassengerPlanes extends PassengerPlanes
{
    public void goSuperSonic()
    {
        System.out.println("PlaneID_"+this.getPlaneID()+" - Supersonic mode activated");
    }
    public void goSubSonic()
    {
        System.out.println("PlaneID_"+this.getPlaneID()+" - Supersonic mode deactivated");
    }
    public ConcordePassengerPlanes(int maxPassengers,String planeID,int totalEnginePower)
    {
        super(maxPassengers, planeID, totalEnginePower);
    }
}
