public class TomCatFighterPlanes extends FighterPlanes
{
    public void refuel()
    {
        System.out.println("PlaneID_"+this.getPlaneID()+" - Initiating refueling procedure - Locating refueller - Catching up -x Refueling - Refueling complete");
    }
    public TomCatFighterPlanes(String planeID,int totalEnginePower)
    {
        super(planeID, totalEnginePower);
    }    
}
